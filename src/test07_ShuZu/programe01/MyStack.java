package test07_ShuZu.programe01;

public class MyStack {
    private Object[] elements;
    //栈帧永远指向栈顶部元素
    private int index;


    public MyStack() {
        //一维数组的动态初始化
        //默认初始化容量是10
        this.elements=new Object[10];
        this.index=-1;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }



    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    //压栈的方法
    public void push(Object obj){
        if (index>=elements.length-1){
            System.out.println("压栈失败，栈已满");
            return;
        }
        index++;
        elements[index]=obj;
//        elements[++index]=obj;
        System.out.println("压栈"+obj+"元素成功，栈帧指向"+index);


    }
    //弹栈的方法，从数组中往外取元素
    public void pop(){
        if (index<0){
            System.out.println("弹栈失败，栈已空！");
            return ;
        }
        System.out.println("弹栈"+elements[index]+"元素成功");
        index--;
        System.out.println("栈帧指向"+index);


    }




}
