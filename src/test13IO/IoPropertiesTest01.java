package test13IO;

import java.io.FileReader;
import java.util.Properties;

/*
* IO+Properties的联合使用
* 经常改变的数据，可以单独写到一个文件中，使用程序动态读取
* 将来只需改这个文件的内容，java代码不需要改动，不需要重新编辑，服务器也不需要重启，就可以拿到动态的信息
* 以上这种机制的文件被称为配置文件
* key=value, 属性配置文件
* java规范中要求：属性配置文件建议以Properties结尾，但不是必须的
* */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        /*
        *Properties是一个Map集合，key和value都是String类型
        *想将dalian10文件中的数据加载到Properties对象当中
        *
        * */
        //新建一个输入流对象
        FileReader reader=new FileReader("src/test13IO/dalian10.properties");
        //新建一个map集合
        Properties pro=new Properties();
        //load方法将文件中的数据加载到Map集合中
        pro.load(reader);//文件中的数据顺着管道加载到map集合中，其中等号左边做key，右边做value

        //通过key来获取value
        String username=pro.getProperty("username");
        System.out.println(username);

        String password=pro.getProperty("password");
        System.out.println(password);




    }
}
