package test07_ShuZu;

public class ArrayTest01 {
    /*
    * 数组的优点：
    * 查询/查找/检索某个下标上的元素时效率极高，可以说是查询效率最高的数据结构
    * 为什么检索效率高：
    * 1.每个元素的内存地址在空间存储上是连续的
    * 2.每一个元素类型相同，所以占用空间大小一样
    * 3.知道第一个元素的内存地址，知道每一个元素占用空间的大小，又知道下标，所以通过一个数学表达式就可以计算出某个下标上元素的内存地址。直接通过内存地址定位元素，所以数组的检索效率是最高的
    *缺点：
    * 1.由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或者增加元素的时候，效率较低，因为随机增删元素会设计到后面元素统一向前或向后唯一的操作
    * 2.数组不能存储大数据量，为什么？
    * 因为很难在内存空间上找到一块特别大的连续的内存空间
    * 注意：对于数组中最后一个元素的增删，是没有效率影响的
    * 定义一个一维数组：语法格式：
    * int[] array1;
    * double[] array2;
    * boolean[] array3;
    * String[] array4;
    * Object[] array5;
    * 初始化数组：
    * 静态初始化一维数组
    * int[] array={100,2100,300,55};
    * 动态初始化一维数组
    * int[] array=new int[5];
    * 这里的5代表数组元素的个数
    * 初始化一个5个长度的int类型的数组，每个元素的默认值是0
    * String[] names=new String[6]//初始化6个长度的Sring类型数组，每个元素默认值null
    * */
    public static void main(String[] args) {
        int[] a={1,100,10,20,55,288};
        System.out.println("数组中的元素个数"+a.length);
        System.out.println("第一个元素"+a[0]);
        System.out.println("最后一个元素"+a[a.length-1]);
        a[0]=111;
        a[a.length-1]=888;
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //从最后一个元素遍历到第一个元素
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.println(a[i]);
        }

    }
}
