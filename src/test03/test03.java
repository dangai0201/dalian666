package test03;

public class test03 {
    public static void main(String[] args) {
        new C();

    }
}




class A{
    public A(){
        System.out.println("A的无参构造");
    }

}



class B extends  A{
    public B(){
        System.out.println("B的午餐构造");
    }
    public B(String name){
        System.out.println("B的有参构造String");
    }


}


class  C extends B{
    public C(){
        this("zhangsan");
        System.out.println("C的无参构造");
    }
    public C(String name){
        this(name,20);
        System.out.println("C的有参构造String");
    }
    public C(String name,int age){
        super(name);
        System.out.println("C的有参构造String age");
    }

}
