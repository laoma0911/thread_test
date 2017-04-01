package com.laoma.test.非线程安全;

/**
 * 模拟servlet组件
 *
 * @Auther: laoma
 * @create: 2017-03-09 下午12:19
 */
public class LoginServlet {
    private static String username;
    private static String password;

    public static synchronized void doPost(String name, String pwd) {
        try {

            username = name;

            if (username.equals("a")) {
                Thread.sleep(5000);
            }

            password = pwd;
            System.out.println("LoginServlet{" +
                    "name='" + username + '\'' +
                    ", pwd='" + password + '\'' +
                    '}');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
