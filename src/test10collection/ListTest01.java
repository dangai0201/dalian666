package test10collection;
/*
* list存储元素特点：有序可重复
* 有序：list集合中元素有下标，从0开始，以1递增
* 可重复：存储一个1，还可以再存储一个1
*
*
* */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        //ArrayList 初始化容量是10，集合底层是Object[]数组
        list.add("A");
        list.add("B");
        list.add("C");
        //在列表制定位置插入指定元素
        list.add(1,"dalian");
        list.add(2,"dalian");

        Iterator it=list.iterator();
        while (it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }

        System.out.println("===============");

        Object firstObj=list.get(1);
        System.out.println(firstObj);

        for (int i = 0; i < list.size(); i++) {
            Object obj=list.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现处的索引
        System.out.println(list.indexOf("dalian"));

        //获取指定对象最后一次出现处的索引
        System.out.println(list.lastIndexOf("dalian"));

        //删除指定下标位置的元素
        list.remove(3);
        System.out.println(list.size());

        System.out.println("**************");


        //修改指定位置元素
        list.set(1,"kalasike");

        for (int i = 0; i < list.size(); i++) {
            Object obj=list.get(i);
            System.out.println(obj);
        }
    }

}
