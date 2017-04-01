package com.laoma.test;

/**
 * 1.说明线程采用异步方式
 * 2.代码执行结果与执行顺序无关
 * @Auther: laoma
 * @create: 2017-03-08 下午5:17
 */
public class ThreadTest1 extends Thread {


    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadTest1 threadTest = new ThreadTest1();
        threadTest.start();
        System.out.println("运行结束，主线程：" + Thread.currentThread().getName());
    }
}
