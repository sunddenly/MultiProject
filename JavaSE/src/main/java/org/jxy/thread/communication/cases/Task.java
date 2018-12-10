package org.hebut.scse.thread.communication.cases;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * AAAAAAA
 * BBBBBBB
 * CCCCCCC
 */
public class Task implements Runnable{
    private static Semaphore sa = new Semaphore(1);
    private static Semaphore sb = new Semaphore(0);
    private static Semaphore sc = new Semaphore(0);
    private char name;//线程名称
    public Task(char name) {
        this.name = name;
    }

    @Override
    public void run() {
        switch (name) {
            case 'A':
                try {
                    sa.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.print('A');
                }
                sb.release();
                break;
            case 'B':
                try {
                    sb.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.print('B');
                }
                sc.release();
                break;
            case 'C':
                try {
                    sc.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.print('C');
                }
                sa.release();
                break;
        }
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //sleep方式
        pool.execute(new Task('A'));
        pool.execute(new Task('B'));
        pool.execute(new Task('C'));
    }
}
