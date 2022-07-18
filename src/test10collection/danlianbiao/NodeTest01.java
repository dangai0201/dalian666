package test10collection.danlianbiao;

import java.util.LinkedList;
import java.util.List;

public class NodeTest01 {
    public static void main(String[] args) {
        Link link=new Link();
        link.add(100);
        link.add(200);
        link.add(300);
        System.out.println(link.size);


        
        //LinkedList集合底层也是有下标的
        List list=new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            Object obj=list.get(i);
            System.out.println(obj);
        }

    }
}
