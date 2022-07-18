package test08string.stringbuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        //如何优化StringBuffer的性能
        //在创建StringBuffer的时候尽可能给定一个初始化容量
        //最好减少底层数组的扩容次数，预估计一下，给一个大一些初始化容量
        //指定初始化容量的StringBuffer对象（字符串缓冲区对象）
        StringBuffer stringBuffer1=new StringBuffer(100);

        StringBuffer stringBuffer=new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append()方法
        stringBuffer.append("a");
        stringBuffer.append("b");
        //append方法底层进行追加的时候，如果byte数组满了，会自动进行扩容
        stringBuffer.append("c");
        System.out.println(stringBuffer.toString());




    }
}
