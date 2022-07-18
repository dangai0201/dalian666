package test10collection;



/*
* jdk8之后引入了：自动类型推断机制（砖石表达式）
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest02 {
    public static void main(String[] args) {

        List<Animal> mylist=new ArrayList<>();
        mylist.add(new Animal());
        mylist.add(new Cat());
        mylist.add(new Bird());

        //遍历
        Iterator<Animal> it=mylist.iterator();
        while (it.hasNext()){
            Animal a=it.next();
            a.move();
        }

        List<String> strList=new ArrayList<>();
        strList.add("http://www.baidu.com");
        strList.add("http://www.123.com");
        strList.add("http://www.dalian.com");
        Iterator<String> iterator=strList.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            String newString=str.substring(7);
            System.out.println(newString);
        }

    }
}
