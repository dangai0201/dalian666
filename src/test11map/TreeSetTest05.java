package test11map;
/*
* 先按照年龄升序，如果年龄相同在按照姓名升序
* */

import java.util.TreeSet;

public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips=new TreeSet<>();
        vips.add(new Vip("dalicn",20));
        vips.add(new Vip("dalian",20));
        vips.add(new Vip("hhaha",18));
        vips.add(new Vip("hhaha",17));
        for (Vip v:vips){
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    * compareTo方法返回值很重要
    * 返回0表示相同，value会覆盖
    * 返回>0，会继续在右子树上找【10-9>0，说明左边的这个数字比较大，所以在右子树上找】
    * 返回<0，会继续在左子树上找
    * */

    @Override
    public int compareTo(Vip v) {
        if (this.age==v.age){
            //年龄相同按照姓名排序
            return this.name.compareTo(v.name);
        }else {
            //年龄不一样
            return this.age-v.age;
        }
    }
}
