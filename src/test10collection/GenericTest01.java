package test10collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 泛型
* 泛型这种语法机制，只在编译阶段起作用，只是给编译器参考的（运行阶段泛型没用！）
* 使用了泛型好处是什么？
* 1、集合中存储的元素类型统一了
* 2.从集合中取出的元素类型是泛型指定的类型，不需要进行大量的"向下转型"
* 泛型的缺点是什么？
* 导致集合中存储的元素缺乏多样性
* 大多数业务中，集合中元素的类型还是统一的。
*
*
*
*
* */
public class GenericTest01 {
    public static void main(String[] args) {
       /* List list=new ArrayList();
        //准备对象
        Cat cat=new Cat();
        Bird bird=new Bird();
        //将对象添加到集合中
        list.add(cat);
        list.add(bird);
        //遍历集合
        Iterator it=list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            //obj中没有move方法，无法调用，需要向下转型
            if(obj instanceof Animal){
                Animal a=(Animal) obj;
                a.move();
            }
        }*/

        /*
        * S使用jdk5之后的泛型机制
        * 使用泛型list<Animal>之后，表示list集合中只允许存储Animal类型的数据
        * 用泛型来指定集合中存储的数据类型
        * */
        List<Animal> mylist=new ArrayList<Animal>();
        Cat cat=new Cat();
        Bird bird=new Bird();
        mylist.add(cat);
        mylist.add(bird);
        //获取迭代器
        //这个标识迭代器迭代的是Animal类型
        Iterator<Animal> it=mylist.iterator();
        while(it.hasNext()){
            //使用泛型之后，每一次迭代返回的数据都是Animal类型
//            Animal a=it.next();
//            a.move();

            Animal a=it.next();
            //调用子类特有的方法还是需要向下转换的
            if (a instanceof Cat){
                Cat cat1= (Cat) a;
                cat1.catchMouse();

            }
            if (a instanceof Bird){
                Bird bird1= (Bird) a;
                bird1.fly();
            }
        }


    }

}




class Animal{
    public void move(){
        System.out.println("动物在移动！");
    }

}
class  Cat extends  Animal{
    public void catchMouse(){
        System.out.println("猫捉老鼠！");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟在飞翔！");

    }
}