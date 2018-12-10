package org.hebut.scse.thread.communication.cases;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  有三个线程分别打印A、B、C,请用多线程编程实现
 *  在屏幕上循环打印10次ABCABC…
 *  在本文中，给出了五种这个题目的解决方法：
     使用sleep
     使用synchronized, wait和notifyAll
     使用Lock 和 Condition
     使用Semaphore
     使用AtomicInteger
 http://www.tuicool.com/articles/2mqI7n

 */
public class CrossPrint {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //sleep方式
//        pool.execute(new SleepTask('A'));
//        pool.execute(new SleepTask('B'));
//        pool.execute(new SleepTask('C'));
        //同步原语方式，三个线程为不同任务，通过共享的lock实现同步
//        Object lock=new Object();
//        pool.execute(new Task('A',lock));
//        pool.execute(new Task('B',lock));
//        pool.execute(new Task('C',lock));
        //通过同步锁来实现
//        pool.execute(new LockTask('A'));
//        pool.execute(new LockTask('B'));
//        pool.execute(new LockTask('C'));
//        pool.shutdown();
        //通过condition实现
//        pool.execute(new ConditionTask('A'));
//        pool.execute(new ConditionTask('B'));
//        pool.execute(new ConditionTask('C'));
        //信号量实现
        pool.execute(new SemaphoreTask('A'));
        pool.execute(new SemaphoreTask('B'));
        pool.execute(new SemaphoreTask('C'));
        pool.shutdown();
    }

    /**
     * 通过sleep实现ABC ABC交叉打印
     * sleep能让当前线程释放对CPU的占用
     * 当CPU处于空闲，也就是多有线程都阻塞时，
     * cpu会保证变量可见性，刷新主存变量到工作内存
     */
    static class SleepTask implements Runnable{
        public static int count=0;
        public char name;
        public char[] c={'A','B','C'};
        public SleepTask(char c){
            this.name=c;
        }
        @Override
        public void run() {
            int len=getLen(name);
            while (count < len) {
                while (c[count%3]!=name){//其他线程执行之后，再次判断count的状态，符合条件才打印
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(name + "");
                count++;
            }
        }
    }
    /**
     * 通过同步原语
     */
    static class Task implements Runnable{
        public static int count=0;
        public Object lock=null;
        public char name;
        public char[] c={'A','B','C'};
        public Task(char c,Object lock){
            this.name=c;
            this.lock=lock;
        }

        @Override
        public void run() {
            int len=getLen(name);
            while (count < len) {
                synchronized (lock){
//                    while (c[count%3]!=name){
//                        try {
//                            lock.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    System.out.print(name + "");
//                    count++;
//                    lock.notifyAll();
                    if(c[count%3]==name){
                        System.out.print(name + "");
                        count++;
                    }
                }
            }
        }
    }
    /**
     * 通过lock实现
     */
    static class LockTask implements Runnable{
        public static int count=0;
        public static ReentrantLock lock=new ReentrantLock();
        public char name;
        public char[] c={'A','B','C'};
        public LockTask(char c){
            this.name=c;
        }

        @Override
        public void run() {
            int len=getLen(name);
            while (count < len) {
                lock.lock();//一个线程获得锁后，其他线程阻塞
                if (c[count%3]==name){//满足条件打印更新，不满足释放锁
                    System.out.print(name + "");
                    count++;
                }
                lock.unlock();
            }
        }
    }
    /**
     * 通过lock和Condition实现
     */
    static class ConditionTask implements Runnable{
        public static ReentrantLock lock=new ReentrantLock();
        //第一个条件当屏幕上输出到3
        public static Condition ca = lock.newCondition();//条件a，count%3=0,相当于将要打印A的线程等待队列
        public static Condition cb = lock.newCondition();//条件b，count%3=1,相当于将要打印B的线程等待队列
        public static Condition cc = lock.newCondition();//条件c，count%3=2,相当于将要打印C的线程等待队列
        public char name;//线程名称
        public static char letter='A';//应该打印的字符
        public ConditionTask(char c){
            this.name=c;
        }
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    if (name != letter) {//判断该线程是否可打印
                        try {
                            switch (name) {
                                case 'A':
                                    ca.await();
                                    break;
                                case 'B':
                                    cb.await();
                                    break;
                                case 'C':
                                    cc.await();
                                    break;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    switch (name) {
                        case 'A':
                            System.out.print('A');
                            letter='B';
                            cb.signal();//唤醒一个打印B的线程
                            break;
                        case 'B':
                            System.out.print('B');
                            letter='C';
                            cc.signal();//唤醒一个打印C的线程
                            break;
                        case 'C':
                            System.out.print('C');
                            letter='A';
                            ca.signal();//唤醒一个打印A的线程
                            break;
                    }
                }finally {
                    lock.unlock();//保证资源互斥访问,不unlock第一个唤醒线程将一直保持持有锁，其他唤醒线程没机会执行
                }
            }
        }
    }
    /**
     *使用Semaphore来实现
     * Semaphore可以控制某个资源可被同时访问的个数，
     * acquire()获取一个许可，如果没有就等待
     * 而release()释放一个许可。
     * 信号量(Semaphore)，有时被称为信号灯，是在多线程环境下使用的一种设施, 它负责协调各个线程, 以保证它们能够正确、合理的使用公共资源。
     *  Semaphore即信号量，维护一堆许可。初始化时会设置一个计数器值，当调用acquire方法时，如果此时计数器值为0，
     *  则阻塞直到计数值大于0；否则计数器值减一，当前线程继续执行。
     *  当release()方法调用时，计数器值会加一。
     * http://www.cnblogs.com/linjiqin/archive/2013/07/25/3214676.html
     */
    static class SemaphoreTask implements Runnable {
        //初始时先打印A，其他两个不打印所以信号量置为0让其阻塞，等待release
        private static Semaphore sa = new Semaphore(1);//
        private static Semaphore sb = new Semaphore(0);
        private static Semaphore sc = new Semaphore(0);
        public char name;//线程名称

        public SemaphoreTask(char c) {
            this.name = c;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                switch (name) {
                    case 'A':
                        try {
                            sa.acquire();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print('A');
                        sb.release();//唤醒一个打印B的线程
                        break;
                    case 'B':
                        try {
                            sb.acquire();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print('B');
                        sc.release();//唤醒一个打印C的线程
                        break;
                    case 'C':
                        try {
                            sc.acquire();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print('C');
                        sa.release();//唤醒一个打印A的线程
                        break;
                }
            }
        }

    }
    private static int getLen(char c){
        int len=0;
        switch (c){
            case 'A':
                len=28;
                break;
            case 'B':
                len=29;
                break;
            case 'C':
                len=30;
                break;
        }
        return len;
    }

}
