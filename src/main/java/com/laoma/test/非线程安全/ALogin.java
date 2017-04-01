package com.laoma.test.非线程安全;

/**
 * 模拟A用户登录
 *
 * @Auther: laoma
 * @create: 2017-03-09 下午12:22
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aaaaaa的password");
    }
}
