package test01;

public class test01 {
    public static void main(String[] args) {
//        ctrl+alt+R 运行
//        System.out.println("hello world");
        //通过午餐数的构造方法创建对象
        Bus b=new Bus();
//        通过有参构造方法创建对象
        b.setSize(5);
        b.setSpeed(100);

        System.out.println("长度是"+b.getSize());
        System.out.println("速度是"+b.getSpeed());

//        test01.test01.Bus b1=new test01.test01.Bus(120,5);


        b.speedUp(70);
        System.out.println(b.getSpeed());

        b.speedDown(10);
        System.out.println(b.getSpeed());


    }



}
