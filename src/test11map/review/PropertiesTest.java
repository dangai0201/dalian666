package test11map.review;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        //创建对象
        Properties pro=new Properties();
        //存
        pro.setProperty("username","dalian");
        pro.setProperty("password","123456");
        //取
        String username=pro.getProperty("username");
        String password=pro.getProperty("password");

        System.out.println(username);
        System.out.println(password);

    }
}
