package com.laoma.test.线程优先级;

/**
 * @Auther: laoma
 * @create: 2017-03-13 下午5:28
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority:" + this.getPriority());

    }
}
