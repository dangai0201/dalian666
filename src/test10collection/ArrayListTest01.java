package test10collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


/*
* ArrayList 集合的扩容：是原容量的1.5倍
*数组优点：检索效率较高
*数组缺点:随机增删元素效率比较低
*向数组末尾添加元素，效率很高，不受影响
* */

public class ArrayListTest01 {
    public static void main(String[] args) {
        //指定初始化容量
        List list=new ArrayList(20);

        //>>1 二进制右移一位
        System.out.println(10>>1);

        //创建一个HashSet集合
        Collection c=new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        //将HashSet集合转换成List集合
        List list1=new ArrayList(c);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));


        }


    }
}
