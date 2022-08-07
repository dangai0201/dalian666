package test15thread.reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) throws  Exception{
        /*
        //获取一个文件的绝对路径
        String path=Thread.currentThread().getContextClassLoader().
                getResource("classinfo66.properties").getPath();
        String path1 = URLDecoder.decode(path,"utf-8");
        FileReader reader=new FileReader(path1);
        */




        //直接以流的形式返回
        InputStream reader=Thread.
                currentThread().getContextClassLoader().
                getResourceAsStream("classinfo66.properties");




        Properties pro=new Properties();
        pro.load(reader);
        reader.close();

        String className=pro.getProperty("className");
        System.out.println(className);





    }

}
