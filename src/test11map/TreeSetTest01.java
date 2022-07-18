package test11map;


import java.util.TreeSet;

/*
* TreeSet集合底层实际上是一个TreeMap
* TreeMap集合底层是一个二叉树
* 放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了
* TreeSet结合中的元素：无序不可重复，但是可以按照元素大小顺序自动排序。称为：可排序集合
*
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> ts=new TreeSet<>();
        //添加String
        ts.add("dalian");
        ts.add("adalian");
        ts.add("daliwn");

        for (String s:ts){
            //按照字典顺序，升序
            System.out.println(s);
        }
        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(6);
        ts2.add(7);
        ts2.add(666);
        ts2.add(16);
        ts2.add(17);
        for (Integer elt:ts2){
            //升序
            System.out.println(elt);
        }

    }
}
