package test07_ShuZu;

public class ArrayTest02 {
    public static void main(String[] args) {
        //静态初始化
        int[] x={1,2,3,4,5,6};
        printArray(x);
        printArray(new int[]{1,2,3});

        //动态初始化
        int[] x2=new int[3];
        printArray(x2);
        printArray(new int[3]);
        //run edit编辑参数
        System.out.println("长度是"+args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }





    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }




}
