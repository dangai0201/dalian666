package test15thread.reflect;
/*
* 验证反射机制的灵活性
*java 代码写一遍，在不改变java源代码的基础之上，可以做到不同对象的实例化
* 非常之灵活（符合OCP开闭原则，对扩展开放，对修改关闭）
*
*
* */
import java.io.FileReader;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws  Exception{

        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象
        //通过IO流读取classinfo.properties文件
        FileReader reader=new FileReader("src/test15thread/reflect/classinfo.properties");
        //创建属性类对象map
        Properties pro=new Properties();//key，value 都是String
        //加载
        pro.load(reader);

        //关闭流
        reader.close();

        //通过key获取value
        String className=pro.getProperty("className");
        System.out.println(className);
        //通过反射机制实例化对象
        Class c=Class.forName(className);
        Object obj=c.newInstance();
        System.out.println(obj);






    }
}
