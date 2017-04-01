package com.laoma.test.非线程安全;

/**
 * 模拟B用户登录
 *
 * @Auther: laoma
 * @create: 2017-03-09 下午12:23
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bbbb的password");
    }
}
