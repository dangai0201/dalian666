package test10collection;

import java.util.*;
/*
* vector
*1.底层也是一个数组
* 2.初始化容量是10
* 3.扩容后是原容量的2倍
* 10--》20--》40
* 3.Arraylist 集合扩容特点，是原容量的1.5倍
* 10--》15---》15*1.5
*vector 中所有的方法都是线程同步的，都带有synchronized 关键子，是线程安全的，效率比较低，使用较少
*
* 5.怎么将一个线程不全的Arraylist 集合转换成线程安全的呢？
* 使用集合工具类
* java.util.Collections;
*
*
* */

public class VectorTest {
    public static void main(String[] args) {
        //创建一个vector元素
        Vector vector=new Vector();

        //默认容量10个
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);


        Iterator iterator=vector.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }


        List mylist=new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(mylist);
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");





    }
}
