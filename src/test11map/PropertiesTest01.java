package test11map;


/*
* properties是一个map集合，继承hashtable，properties的key和value都是String类型的
* properties被称为属性类对象
*properties是线程安全的
*
* */

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个properties对象
        Properties pro=new Properties();
        pro.setProperty("a","dalian");
        pro.setProperty("b","pro");
        pro.setProperty("c","666");

        String a=pro.getProperty("a");
        String b=pro.getProperty("b");
        String c=pro.getProperty("c");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
