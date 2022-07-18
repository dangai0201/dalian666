package test11map;


/*
* 以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则
*java.lang.ClassCastException: test11map.Person cannot be cast to java.lang.Comparable
* 出现这个异常的原因是：
* Person类没有实现java.lang.Comparable接口
* */

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        Person p1=new Person(26);
        Person p2=new Person(27);
        Person p3=new Person(28);
        TreeSet<Person> persons=new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        for (Person p:persons){
            System.out.println(p);
        }



    }
}

class  Person{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
