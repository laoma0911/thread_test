package com.laoma.test.非线程安全;

/**
 * @Auther: laoma
 * @create: 2017-03-09 下午12:24
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();

        a.interrupt();
    }
}
