package com.laoma.test;

/**
 * Runnable练习
 *   Thread构造函数使用runnable
 *
 * @Auther: laoma
 * @create: 2017-03-09 下午12:01
 */
public class ThreadTest3_runnable implements Runnable{
    public void run() {
        System.out.println("thread_constructor_param" + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadTest3_runnable runnable = new ThreadTest3_runnable();

        Thread thread = new Thread(runnable,"test_runnable");

        thread.start();
    }


}
