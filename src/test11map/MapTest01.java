package test11map;


/*
* 1.Map和Collection没有继承关系
* 2.map集合以key和value的方式存储数据：键值对
* key和value都是引用数据类型
* key和value都是存储对象的内存地址
* key起到主导地位，value是key的一个附属品
* */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //创建Map对象
        Map<Integer, String> map=new HashMap<>();
        //向map集合中添加键值对
        map.put(1,"zhangsan");//1在这里进行了自动装箱
        map.put(2,"wangwu");
        map.put(3,"dalian");
        //通过key获取value
        String value=map.get(1);
        System.out.println(value);
        //获取键值对的数量
        System.out.println("键值对的数量："+map.size());
        //通过key删除value
        map.remove(2);
        System.out.println("键值对的数量："+map.size());
        //判断是否包含某个key
        //contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法
        System.out.println(map.containsKey(new Integer(3)));
        //判断是否包含某个value
        System.out.println(map.containsValue(new String("dalian")));

        System.out.println("-------------------------");
        //获取所有的value
        Collection<String> values=map.values();
        for (String s:values){
            System.out.println(s);
        }


        //清空map集合
        map.clear();
        System.out.println("键值对的数量："+map.size());
        //判断是否为空
        System.out.println(map.isEmpty());




    }
}
