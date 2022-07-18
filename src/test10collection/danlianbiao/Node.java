package test10collection.danlianbiao;


/*
* 单链表中的节点
*节点是单向链表中基本的单元
*每一个节点node都有2个属性：1.是数据的存储2.是下一个节点的内存地址
*
* 链表优点：随机增删元素效率较高（因为增删元素不涉及到大量元素位置）
* 链表缺点：查询效率较低，每一次查找元素的时候都需要从头节点开始往下遍历
* */


public class Node {
    //存储的数据
    Object element;
    //下一个节点的内存地址
    Node next;

    public Node() {
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }
}
