package test07_ShuZu;

/*
* 数组元素查找有两种方式:
*   第一种方式：一个一个挨着找，直到找到为止
*   第二种方式：二分法查找（算法），这个效率较高。
* */

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr={2,3,666,5,88,123,565};
        /*int[] arr={2,3,666,5,88,123,565};
        //一个一个挨着找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==666){
                System.out.println("666的下标是："+i);
                return;
            }

        }
        System.out.println("666这个元素不存在");*/

        int index=arraySearch(arr,666);
        System.out.println(index==-1?"该元素不存在":"该元素下表是"+index);
    }

    public static int arraySearch(int[] arr, int ele) {
        for (int j = 0; j <arr.length ; j++) {
            if (ele==arr[j]){
                return j;
            }
        }
        return -1;
    }

}
