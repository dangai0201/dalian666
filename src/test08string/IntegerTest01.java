package test08string;



/*
* 基本数据类型        包装类型
*   byte         java.lang.Byte
*   short        java.lang.Short
*   int          java.lang.Integer
*   long         java.lang.Long
*   float        java.lang.Float
*   double       java.lang.Double
*   boolean      java.lang.Boolean
*   char         java.lang.Character
* */

public class IntegerTest01 {
    public static void main(String[] args) {
        MyInt myInt=new MyInt(100);
        doSome(myInt);
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        //基本数据类型--(转换为)>引用数据类型（装箱）
        Integer i=new Integer(123);
        //引用数据类型--(转换为)>基本数据类型
        float f=i.floatValue();
        System.out.println(f);
        //引用数据类型--(转换为)>基本数据类型（拆箱）
        int aa=i.intValue();
        System.out.println(aa);

        //通过访问包装类的常量，来获取最大值和最小值
        System.out.println("int的最大值"+Integer.MAX_VALUE);
        System.out.println("int的最小值"+Integer.MIN_VALUE);
        System.out.println("byte的最大值"+Byte.MAX_VALUE);
        System.out.println("byte的最小值"+Byte.MIN_VALUE);

        //自动装箱
        Integer x=100;
        //+两边要求是基本数据类型的数字，x是包装类，不属于基本数据类型，这里会自动拆箱
        //将x转换成基本数据类型，只有+-*/才会触发自动拆箱
        System.out.println(x+1);
        //自动拆箱
        int y=x;




        Integer a=128;
        Integer b=128;
        System.out.println(a==b);//false

        //java中为了提高程序的执行效率，将[-128到127]之间所有的包装对象提前创建好
        //放到一个方法区的"整数型常量池"当中，目的是只要用这个区间的数据就不需要在new
        //直接从整数型常量池当中取出来


        //==永远判断的都是两个对象的内存地址是否相同
        Integer KK=127;
        Integer ok=127;
        System.out.println(KK==ok);//true


        //parseInt(String s)
        //静态方法，传参String,返回int
        int retValue=Integer.parseInt("123");
        System.out.println(retValue+100);

        double retValue2=Double.parseDouble("2.56");
        System.out.println(retValue2+1);

        float retValue3=Float.parseFloat("1.0");
        System.out.println(retValue3+1);

        //将十进制转换成二进制字符串
        String binaryString=Integer.toBinaryString(3);
        System.out.println(binaryString);


        //将10进制转换成十六进制字符串
        String hexString=Integer.toHexString(16);
        System.out.println(hexString);

        //将10进制转换成八进制字符串
        String octalString=Integer.toOctalString(8);
        System.out.println(octalString);
        //int转成integer
        Integer i1=Integer.valueOf(100);
        System.out.println(i1);
        //String-->interger
        Integer i2=Integer.valueOf("100");
        System.out.println(i2);



















    }
    public static void doSome(Object obj){

        System.out.println(obj);
    }
}
