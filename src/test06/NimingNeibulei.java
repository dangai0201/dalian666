package test06;

public class NimingNeibulei {
    /*
    * 在类的内部有定义了一个新的类，内部类
    * 静态内部类：类似于静态变量
    * 实例内部类：类似于实例变量
    * 局部内部类：类似于局部变量
    *
    * */
    public static void main(String[] args) {
        MyMath mm= new MyMath();
//        mm.mySum(new CompterIm(),100,200);
        mm.mySum(new Compter(){
                     public int sum(int a, int b) {
                         return a+b;
                     }
        },100,200);

    }
   /* class Test01{
        //静态内部类
        static class Inner1{
        }
        //实例内部类
        class Inner2{
        }
        public void DoSome(){
            //局部变量
            int i=100;
            //局部内部类
            class Inner3{
            }
        }
    }*/
interface Compter{
        int sum(int a,int b);
}
/*static class CompterIm implements Compter{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}*/
static class MyMath{
        public void mySum(Compter c,int x,int y){
            int retValue=c.sum(x,y);
            System.out.println(x+"+"+y+"="+retValue);
        }
}

}

