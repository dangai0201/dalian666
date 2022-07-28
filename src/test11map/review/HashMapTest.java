package test11map.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //创建map集合
        Map<Integer,String> map=new HashMap<>();
        //添加元素
        map.put(1,"zhangsan");
        map.put(2,"dalian");
        map.put(2,"dalian1");//key重复value会覆盖
        //获取元素个数
        System.out.println(map.size());
        //获取key是2的元素
        System.out.println(map.get(2));
        //遍历map集合：先获取所有的key，遍历key的时候，通过key获取value
        Set<Integer> keys=map.keySet();
        for (Integer key:keys){
            System.out.println(key+"="+map.get(key));
        }

        //2.是将map集合转换成set集合，set集合中每一个元素是node
        //node节点中有key和value
        Set<Map.Entry<Integer,String>> nodes=map.entrySet();
        for (Map.Entry<Integer,String> node :nodes){
            System.out.println(node.getKey()+":"+ node.getValue());
        }

    }
}
