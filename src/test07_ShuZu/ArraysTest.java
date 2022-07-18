package test07_ShuZu;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr={3,6,10,16,12,13,666,123};
        //排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //二分法查找
        int index=Arrays.binarySearch(arr,3);
        System.out.println(index==-1?"该元素不存在":"该元素的下标是："+index);



    }
}
