package test08string.excption;

public class ExceptionTest06 {
    public static void main(String[] args) {
        int result=m();
        System.out.println(result);//100
    }
    //方法中的代码必须遵循自上而下顺序一次执行
    //return语句一旦执行，整个方法必须结束
    public static int m(){
        int i=100;
        try{
            //这行代码出现在int i=100的下面，所以最终结果必须是返回100
            //return语句必须保证是最后执行的，一旦执行，整个方法结束
            return i;
        }finally {
            i++;
        }
    }
}
