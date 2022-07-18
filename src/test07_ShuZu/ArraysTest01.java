package test07_ShuZu;

import java.util.Arrays;

public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr={112,1,56,777,17};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
