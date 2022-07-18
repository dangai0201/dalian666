package test11map;
/*
* TreeSet集合中元素可排序的第二种方式：使用比较器的方式
*结论：
* 放到TreeSet或者TreeMap结合key部分的元素要想做到排序，包括两种方式
* 1.放在集合中的元素实现java.lang.Comparable接口
* 2.在构造TreeSet或者TreeMap集合的时候给他传一个比较器对象
* Comparable和Comparator如何选择？
* 当比较规则不会发生改变的时候，或者说比较规则只有1个的时候，建议实现Comparable接口
* 如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口
* Comparator接口的实际符合OCP原则
* */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest06 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候，需要使用这个比较器
        //给构造方法传递一个比较器
//        TreeSet<Wugui> wuguis=new TreeSet<>(new WuGuiComparator());
        //匿名内部类的方式（这个类没有名字，直接new接口）
        TreeSet<Wugui> wuguis=new TreeSet<>(new Comparator<Wugui>() {
            @Override
            public int compare(Wugui o1, Wugui o2) {
                return o1.age- o2.age;
            }
        });
        wuguis.add(new Wugui(100));
        wuguis.add(new Wugui(66));
        wuguis.add(new Wugui(116));
        for (Wugui wugui:wuguis){
            System.out.println(wugui);
        }


    }
}

class Wugui {
    int age;

    public Wugui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wugui{" +
                "age=" + age +
                '}';
    }

}
/*//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口（comparable 是java.lang包下的。comparator是java.util包下的）
class WuGuiComparator implements Comparator<Wugui>{

    @Override
    public int compare(Wugui o1, Wugui o2) {
        //指定比较规则
        //按照年龄排序
        return o1.age-o2.age;
    }
}*/


