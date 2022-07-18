package test10collection;

/*
*
* jdk5.0之后推出个新特性：叫做增强for循环，或者叫做foreach
*
*
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest01 {
    public static void main(String[] args) {
        //int类型数组
        int[] arr={1,2,3,5,6};
        //遍历数组（普通for循环）
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
       /* //增强for
        for(元素类型 变量名：数组或集合){
            System.out.println(变量名);   
        }*/
        System.out.println("=============");
        //foreach有一个缺点，没有下标，在需要使用下标的循环中，不建议使用
        for(int data:arr){
            //data是数组中的元素
            System.out.println(data);
        }


        //创建list集合
        List<String> strlist=new ArrayList<>();
        //添加元素
        strlist.add("hello");
        strlist.add("dalian");

        //遍历，使用迭代器方式
        Iterator<String> it=strlist.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }


        System.out.println("------------");

        //使用下标方式（只针对于有下标的集合）
        for (int str = 0; str < strlist.size(); str++) {
            System.out.println(strlist.get(str));

        }
        System.out.println("#############");
        //使用foreach
        for (String s:strlist){//因为泛型使用的是String类型
            System.out.println(s);
        }

        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for (Integer i:list){//i代表集合中的元素
            System.out.println(i);
        }



    }
}
