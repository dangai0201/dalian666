package test07_ShuZu;

/*
* java中对数组的扩容：
* 先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组当中
*数组扩容效率较低，因为涉及到拷贝的问题，
* */
public class ArrayTest06 {
    public static void main(String[] args) {
//        System.arraycopy();
        //拷贝源（从这个数组中拷贝）
        int[] src={1,11,22,3,4};
        //拷贝目标（拷贝到这个目标数组上）
        int[] dest=new int[20];
       /* System.arraycopy(src,1,dest,3,2);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }*/

        System.arraycopy(src,0,dest,0,src.length);


        //二维数组
        int[][] array={{1,2,3},{3,3,5,6,7},{0,1},{6,6,6},{16,17,18}};

        int[][] hehe={{1,2,31},{3,3,5,6,71},{0,11},{6,6,61},{16,17,181}};
        printArray(hehe);
//        System.out.println("#########################");
//        printArray(new int[][]{{1,2,31},{3,3,5,6,71},{0,11},{6,6,61},{16,17,181}});
        System.out.println("*****************************");
        System.out.println(array.length);
        System.out.println(array[0].length);
        int[] a0=array[0];
        int aa=a0[0];
        System.out.println(aa);
        //合并以上代码
        System.out.println(array[0][0]);

        System.out.println("============");
        //遍历二维数组
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        //动态初始化二维数组
        //3个一维数组，每一个一维数组中4个元素
        int[][] aoc=new int[3][4];
        for (int i = 0; i < aoc.length; i++) {
            for (int j = 0; j < aoc[i].length; j++) {
                System.out.print(aoc[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printArray(int[][] array1){
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
