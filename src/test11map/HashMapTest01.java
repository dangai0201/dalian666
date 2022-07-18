package test11map;
/*
* 1.HashMap集合底层是哈希表/散列表的数据结构
* 2.哈希表是一个怎样的数据结构？
* 哈希表是一个数组和单向链表的结合体
* 数组：在查询方便效率很高，随机增删方面效率很低
* 单向链表：在随机增删方面效率较高，在查询方面效率很低
* 哈希表将以上两种数据结构融合在一起，充分发挥他们各自的优点
*
* HashMap集合的key部分特点：
* 无序，不可重复
* 为什么无序？因为不一定挂到哪个单向链表上
* 不可重复怎么保证？equals方法来保证HashMap集合的key不可重复。如果key重复了，value会覆盖
* 放在hashmap集合key部分的元素其实就是放到了HashSet集合中了
* 所以HashSet集合中的元素也需要同时重写hashCode()+equals()方法
*
*哈希表HashMap使用不当时无法发挥性能
* 假设将所有的hashCode（）方法返回值固定为某个值，那么会导致底层哈希表变成了纯单向链表，这种情况称为：散列分布不均匀
* 散列分布均匀
* 假设100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的，是散列分布均匀
* 假设将所有的hashCode（）方法的返回值设定为不一样的值，可以？有什么问题？
* 不行，这样导致底层哈希表就成了一维数组，没有链表的概念了，也是散列不均匀
* 散列分布均匀需要重写hashCode()方法，有一定的技巧
*
* 重点：放在hashMap集合key部分的元素，以及放在hashSet集合中的元素，需要同时重写hashCode()和equal()方法
*
* command+7快速查看类中所有的方法
*
* 系统键盘中选择选项 “将F1、F2等键用作标准功能键…”
* https://blog.csdn.net/qq_40813329/article/details/118609538
* command+f12搜索类中的方法
*
* hashmap集合的默认初始化容量是16，默认加载因子是0.75
* 这个默认加载因子是当hashmap集合底层数组容量达到75%的时候，数组开始扩容
*hashmap集合初始化容量必须是2的倍数，这也是官方推荐的，这是因为达到散列均匀，为了提高hashmap结合的存取效率所必须得
*
*
*
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        //测试hashMap集合key部分元素特点
        //Interger是key，他的hashCode和equals都重写了
        Map<Integer,String> map=new HashMap<>();
        map.put(11111,"dalian");
        map.put(222,"kalasike");
        map.put(333,"qinsheng");
        map.put(222,"xiehui");//key重复的时候value会自动覆盖
        System.out.println(map.size());
        //遍历map集合
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        for(Map.Entry<Integer,String> entry:set){
            //验证结果：hashmap集合key部分语速：无序不可重复
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
