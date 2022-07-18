package test11map;

public class MyClass {
    //声明一个静态内部类
    private static class InnerClas{
        //静态方法
        public static void m1(){
            System.out.println("静态内部类的m1方法执行");
        }
        //实例方法
        public void m2(){
            System.out.println("静态内部类中的实力方法执行");
        }


    }

    public static void main(String[] args) {
        MyClass.InnerClas.m1();
        //创建静态内部类对象
        MyClass.InnerClas mi=new MyClass.InnerClas();
        mi.m2();
    }
}
