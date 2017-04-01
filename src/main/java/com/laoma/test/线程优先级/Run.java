package com.laoma.test.线程优先级;

/**
 * @Auther: laoma
 * @create: 2017-03-13 下午5:31
 */
public class Run {

    public static void main(String[] args) {

        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());

//        Thread.currentThread().setPriority(6);

        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());

        MyThread thread = new MyThread();
        thread.start();

    }
}
