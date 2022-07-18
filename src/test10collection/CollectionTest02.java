package test10collection;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c=new ArrayList();
        //向集合中存储元素
        String s1=new String("abc");
        String s2=new String("def");
        c.add(s1);
        c.add(s2);

        System.out.println("元素的个数是："+c.size());

        String x=new String("abc");
        //判断集合中是否包含，包含返回true,不包含返回false
        System.out.println(c.contains(x));


        Collection c2=new ArrayList();

        User u1=new User("jack");
        User u2=new User("jack");

        c2.add(u1);
        //没有重写euqals之前，这个结果是false
        System.out.println(c2.contains(u2));


        Integer xx=new Integer(1000);
        c2.add(xx);
        Integer y=new Integer(1000);
        System.out.println("---------"+c2.contains(y));


        Collection cc=new ArrayList();
        String ss=new String("hello");
        cc.add(ss);
        String ss1=new String("hello");
        cc.remove(ss1);

        System.out.println("============"+cc.size());


    }
}
class  User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
    public boolean equals(Object o) {
        if (o==null||!(o instanceof User)) return false;
        if (o==this) return true;
        User u=(User)o;
        return u.name.equals(this.name);
    }
}
