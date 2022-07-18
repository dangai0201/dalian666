package test10collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("dalian");
        c.add("bisheng");
        Iterator it=c.iterator();
        while (it.hasNext()){
            Object o=it.next();
            it.remove();//删除的一定是迭代器指向的当前元素，迭代器去删除的时候，会自动更新迭代器，并且更新集合
            System.out.println(o);
        }
        System.out.println(c.size());

    }
}
