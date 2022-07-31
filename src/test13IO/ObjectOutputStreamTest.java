package test13IO;


/*
* 参与序列化和反序列化的对象，必须实现Serializable接口
* Serializable接口只是一个标志接口
*Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口后，会自动为该类自动生成一个序列化版本
*
* 结论：一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号
* 这样，以后这个类及时代码修改了，但是版本号不变，java虚拟机会认为是同一个类
* */

import test13IO.bean.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception{
        //创建java对象
        Student s=new Student(123,"dalian");
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/test13IO/dalian7"));
        //序列化对象
        oos.writeObject(s);
        //刷新
        oos.flush();
        //关闭
        oos.close();


    }
}
