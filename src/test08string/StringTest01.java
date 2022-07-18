package test08string;
/*
* String属于引用数据类型
*直接存储在"方法区"的"字符串常量池"当中
* */

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringTest01 {
    public static void main(String[] args) {
        byte[] bytes={97,98,99};
        String s=new String(bytes);
        System.out.println(s);
        //String(字符数组，数组元素下标的起始位置，长度)
        String s1=new String(bytes,1,2);
        System.out.println(s1);



        //String类常用方法
        char c="中国人".charAt(1);
        System.out.println(c);
        //字符串大小比较不能直接使用><，需要使用compareTo方法
        int result1="abc".compareTo("abc");
        System.out.println(result1);//等于0，前后一致 10-10=0
        int result2="abcd".compareTo("abce");
        System.out.println(result2);//小于0 前小后大 8-9=-1
        int result3="abce".compareTo("abcd");
        System.out.println(result3);//大于0 前大后小 9-8=1

        //判断前面的字符串中是否包含后面的字符串
        System.out.println("hello.java".contains(".java"));
        System.out.println("123".contains("456"));
        //判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".txt"));
        System.out.println("test.txt".endsWith(".java"));
        System.out.println("abc".endsWith("c"));

        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("ABC".equalsIgnoreCase("abc"));

        //将字符串对象转换成字节数组
        byte[] bytes1="abcdefg".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        //判断某个字符串在当前字符串中第一次出现处的索引（下标）
        System.out.println("dalianbishenghahaha".indexOf("ha"));

        //判断某个字符串是否为"空字符串"，底层源代码调用的应该是字符串的length()方法
        String s12="";
        System.out.println(s12.isEmpty());

        //判断数组长度是length属性，判断字符串长度是length()方法
        System.out.println("abc".length());

        //判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("abcdeaac".lastIndexOf("a"));

        //替换
        String newString="abcdefabc".replace("abc","dalian");
        System.out.println(newString);
        String newString1="name=zhangsan&password=123456".replace("=",":");
        System.out.println(newString1);

        //拆分字符串
        String[] ymd="1990-10-11".split("-");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }

        //判断某个字符串是否以某个子字符串开始
        System.out.println("okok".startsWith("ok"));
        System.out.println("okok".startsWith("dalian"));

        //截取字符串
        System.out.println("okodalian".substring(3));
        //左闭右开
        System.out.println("okdalianok".substring(2,8));

        //将字符串转换成char数组
        char[] chars="我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //转换为小写
        System.out.println("ABC".toLowerCase());
        //转换成大写
        System.out.println("abc".toUpperCase());

        //去除字符串前后空白
        System.out.println(" hello word ".trim());


        //将"非字符串"转换成"字符串"
//        String ss=String.valueOf(100);
//        String ss=String.valueOf(3.14);
        String ss=String.valueOf(true);
        String ss1=String.valueOf(new Customer());
//        System.out.println(ss1);//没有重写toString方法之前是对象的内存地址
        System.out.println(ss);
        System.out.println(ss1);

    }
}
class  Customer{
    //重写toString
    @Override
    public String toString() {
        return "我是一个大连客户";
    }
}
