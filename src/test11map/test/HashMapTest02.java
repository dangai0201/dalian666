package test11map.test;


/*
* 向map集合中存，以及从map集合中取，都是先调用key的hashCode方法，然后在调用equals方法
* equlas方法有可能调用，也有可能不调用
* 拿put（k，v）举例，什么时候不会调用equals？
* k.hashcode()方法返回哈希值
* 哈希值经过哈希算法转换成数组下标
* 数组下标位置如果是null，equals不需要执行
*拿get（k，v）举例，什么时候不会调用equals？
* k.hashcode()方法返回哈希值
* 哈希值经过哈希算法转换成数组下标
* 数组下标位置如果是null，equals不需要执行
*
*
* 注意：如果一个类的equals方法重写了，那么hashCode（）方法必须重写
* 并且equals方法返回如果是true，hashCode（）方法返回的值必须一样
* equals方法返回true表示两个对象相同，在同一个单向链表上比较
* 那么对于同一个单向链表的节点来说，他们的哈希值都是相同的
* 所以hashCode（）方法的返回值也应该相同
*
*放在hashMap集合key部分的，以及放在hashSet集合中的元素，需要同时重写hashCode（）方法和equals方法
*
*
* 对于哈希表数据结构来说
* 如果o1和o2的hash值相同，一定是放到同一个单向链表上
* 如果o1和o2的hash值不同，但由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生"哈希碰撞"
*
* hashtable的key和value都是不能为null 的
* hashMap集合的key和value都是可以为null的
*hashtable方法都带有synchronized：线程安全的
* 线程安全有其他的方案，hashtable对线程的处理，导致效率较低，使用较少了
*
*hashtable和hashMap一样，底层都是哈希表数据结构
* hashtable的初始化容量是11，默认加载因为是：0.75f
* hashtable的扩容是：原容量*2+1
*
* */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1=new Student("DALIAN");
        Student s2=new Student("DALIAN");
        System.out.println(s1.equals(s2)); //true

        System.out.println("s1的hashcode="+s1.hashCode());
        System.out.println("s2的hashcode="+s2.hashCode());
        //s1.equals(s2)结果已经是true了，表示s1和s2是一样的，相同的，那么往hashSet集合中放的话
        //按说只能放进去1个（hashSet集合特点：无序不可重复）
        Set<Student> students=new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());



        Map map=new HashMap();
        //hashmap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());

        //key重复的话value是覆盖
        map.put(null,100);
        System.out.println(map.size());

        //通过key获取value
        System.out.println(map.get(null));


    }
}
