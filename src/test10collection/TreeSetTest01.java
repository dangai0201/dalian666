package test10collection;


/*
* TreeSet集合存储元素特点
* 1.无序不可重复，但是存储的元素可以自动按照大小顺序排序，称为可排序集合
*
* 2.无序：这里的无序指的是存进去的顺序和取出来的顺序不同，并且没有下标
*
*
* */

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> strs=new TreeSet<>();
        strs.add("E");
        strs.add("B");
        strs.add("D");
        strs.add("A");
        strs.add("C");
        //遍历
        for (String str:strs){
            System.out.println(str);
        }

    }
}
