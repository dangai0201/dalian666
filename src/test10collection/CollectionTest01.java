package test10collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
*
* 数组其实就是一个集合，集合实际上就是一个容器。可以用来容纳其他类型的数据
*
* 集合是一个容器，是一个载体，可以容纳多个对象
*
* 集合不能直接存储基本数据类型，另外集合也不能直接存储java对象，集合中存储的都是java对象的内存地址，或者说集合中存储的是引用
* 集合在java中本身是一个容器，是一个对象
* 集合中任何时候存储的都是引用
*在java中每一个不同的集合，底层会对应不同的数据结构。往不同的集合中存储元素，等于将数据放到了不同的数据结构中
* 数据存储的结构就是数据结构，不同的数据结构，数据存储方式不同
* eg:数组，二叉树，链表，哈希表....
* 以上这些都是常见的数据结构
*
*所有的集合类和集合接口都在java.util包下
*
*在java中集合分为2大类
* 1.单个方式存储元素，这一类集合中超级父接口：java.util.Collection;
* 2.以键值对的方式存储元素，这一类集合中超级父接口：java.util.Map;
*
*
* 没有使用"泛型"之前，Collection中可以存储Object的所有子类型
* 使用了"泛型"之后，Collection中只能存储某个具体的类型
*
* */
public class CollectionTest01 {
    public static void main(String[] args) {

        //多态
        Collection c=new ArrayList();
        //自动装箱,实际上放进去了一个对象的内存地址
        c.add(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);

        //获取集合中元素的个数
        System.out.println("集合中元素个数是："+c.size());

        //清空集合
        c.clear();
        System.out.println("集合中元素个数是："+c.size());

        c.add("hello");
        c.add("world");


        //判断集合中是否包含hello
        boolean flag=c.contains("hello");
        boolean flag1=c.contains("hello1");
        System.out.println(flag);
        System.out.println(flag1);



        System.out.println("集合中元素个数是："+c.size());

        c.remove("world");


        System.out.println("集合中元素个数是："+c.size());

        //判断集合是否为空
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());

        c.add("abc");
        c.add("100");
        c.add(new Student());
        //转换成数组
        Object[] obj=c.toArray();

        for (int i = 0; i < obj.length; i++) {
            Object o=obj[i];
            System.out.println(o);
        }






        //遍历/迭代方式，是所有collection通用的一种方式
        //在Map集合中不能用，在所有的Collection以及子类中使用


        System.out.println("===================");

//        Collection c1=new ArrayList();//有序可重复
        Collection c1=new HashSet();//无序（存进去和取出来的顺序不一定相同）不可重复
        c1.add("abc");
        c1.add("100");
        c1.add("100");
        c1.add(new Object());

        //第一步：获取集合对象的迭代器对象Iterator
        Iterator it=c1.iterator();

        //通过获取的迭代器对象，开始遍历/遍历集合
        //hasNext()如果仍有元素可以迭代，则返回true
        while (it.hasNext()){
            //next()返回迭代的下一个元素
            Object obj1=it.next();
            System.out.println(obj1);
        }





    }
}
class  Student{
}