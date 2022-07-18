package test10collection.danlianbiao;

public class Link {
    //头节点
    Node header;

    int size=0;

    public int size(){
        return size;
    }


    //向链表中添加元素的方法
    public  void  add(Object data){
        //创建一个新的节点对象
        //让之前单链表的末尾节点next指向新节点对象
        if (header==null){
            //说明还没有节点
            //new一个新的节点对象，作为头节点对象
            //这个时候的头节点既是一个头节点，又是一个末尾节点
            header=new Node(data,null);
        }else {
            //说明头不是空
            //头节点已经存在
            //找到当前末尾节点，让当前末尾节点的next是新节点
            Node currentLatNoede=findLast(header);
            currentLatNoede.next=new Node(data,null);
        }
        size++;

    }

    //专门查找末尾节点的方法
    private Node findLast(Node node) {
        if (node.next==null){
            return node;
        }
        return findLast(node.next);
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }
    //修改链表中某个数据的方法
    public void modify(Object obj){

    }
    //查找链表中某个元素的方法
    public int find(Object obj){
        return 1;
    }


}
