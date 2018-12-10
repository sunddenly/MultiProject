package org.hebut.scse.thread.communication.cases;

public class test1 {
 
    private static boolean is = true;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(test1.is){
                   i++;
//                    for(int k=0;k<100000;k++){
//                        new Object();
//                    }
//                   synchronized (this) { } //会强制刷新主内存的变量值到线程栈?
//                   System.out.println("1"); //println 是synchronized 的,会强制刷新主内存的变量值到线程栈?
                   //sleep 会从新load主内存的值?
                     //    try {
                     //       TimeUnit.MICROSECONDS.sleep(1);
                     //   }catch (InterruptedException e) {
                     //      e.printStackTrace(); 
                     //   }
                } 
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                is = false;  //设置is为false，使上面的线程结束while循环
            }
        }).start();
    }
}