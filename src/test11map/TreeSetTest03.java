package test11map;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        Customer p1=new Customer(27);
        Customer p2=new Customer(26);
        Customer p3=new Customer(28);
        TreeSet<Customer> customers=new TreeSet<>();
        customers.add(p1);
        customers.add(p2);
        customers.add(p3);
        for (Customer p:customers){
            System.out.println(p);
        }



    }
}

//放在TreeSet集合中的元素需要实现java.lang.Comparable接口
//并且实现compareTo方法
class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }

    //需要再这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较，返回值可能是>0<0=0
    @Override
    public int compareTo(Customer c) {//c1.compareTo(c2)
        //this是c1
        //c是c2
        //c1,c2比较的时候，就是this和c进行比较
        /*int age1=this.age;
        int age2=c.age;
        if (age1==age2){
            return 0;

        }else if (age1>age2){
            return 1;
        }else {
            return -1;
        }*/

        return this.age-c.age;
    }
}

