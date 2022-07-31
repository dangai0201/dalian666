package test13IO;

import test13IO.bean.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
* 反序列化集合
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws  Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/test13IO/dalian8"));
        /*Object obj=ois.readObject();
        System.out.println(obj instanceof List);*/

        List<User> userList=(List<User>)ois.readObject();
        for (User user:userList){
            System.out.println(user);
        }
        ois.close();


    }
}
