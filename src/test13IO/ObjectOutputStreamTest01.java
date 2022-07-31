package test13IO;

import test13IO.bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
* 一次序列化多个对象，可以将对象放到集合中，序列化集合
*参与序列化的ArrayList集合以及集合中的元素User都需要实现Serializable接口
*
* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws  Exception{
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"dalian"));
        userList.add(new User(2,"kalasike"));
        userList.add(new User(3,"zhangsan"));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/test13IO/dalian8"));
        //序列华一个集合,这个集合对象中放了许多其他对象
        oos.writeObject(userList);

        oos.flush();
        oos.close();

    }
}
