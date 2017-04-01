package com.laoma.test;


/**
 * 该demo展现线程具有随机性
 *
 * @Auther: laoma
 * @create: 2017-03-08 下午5:49
 */
public class ThreadTest2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ThreadTest2 threadTest2 = new ThreadTest2();
            threadTest2.setName("mytest2");
            threadTest2.start();

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
