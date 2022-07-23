package test11map;


/*
* java.util.Collection集合接口
* java.util.Collections集合工具类，方便集合的操作
* */

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list=new ArrayList<>();
        //变成线程安全的
        Collections.synchronizedList(list);
        //排序
        list.add("abd");
        list.add("abc");
        list.add("abz");

        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }

        List<WuGui2> wuGui2s=new ArrayList<>();
        wuGui2s.add(new WuGui2(1000));
        wuGui2s.add(new WuGui2(2000));
        wuGui2s.add(new WuGui2(500));
        //注意：对list集合中元素排序，需要保证list集合中的元素实现了Comparable接口
        Collections.sort(wuGui2s);
        for (WuGui2 W:wuGui2s){
            System.out.println(W);
        }

        //对set集合排序
        Set<String> set=new HashSet<>();
        set.add("dalian");
        set.add("dalixn");
        set.add("dalicn");
        set.add("daliaan");
        set.add("dalian1");
        //将set集合转换成list集合
        List<String> mylist=new ArrayList<>(set);
        Collections.sort(mylist);
        for (String s:mylist){
            System.out.println(s);
        }

    }
}
class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(WuGui2 o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "WuGui2{" +
                "age=" + age +
                '}';
    }
}