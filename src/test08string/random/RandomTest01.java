package test08string.random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random=new Random();
        //随机产生一个int类型取值范围内的数字
        int num=random.nextInt();
        System.out.println(num);
        //产生0-100之间的随机数
        int num2=random.nextInt(101);
        System.out.println(num2);








        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }

        int index=0;
        while(index<arr.length){
            int num6=random.nextInt(101);
            if (!contains(arr,num6)){
                arr[index]=num6;
                index++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

    }
    /*
    * 判断数组中是否包含某个元素
    * true表示包含，false表示不包含
    *
    * */
    public static boolean contains(int[] arr,int key){

       /* //排序（排序会出问题） -1 -1 53 85 29
        Arrays.sort(arr);
        //二分法
        return Arrays.binarySearch(arr,key)>=0;*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return true;
            }
        }
        return false;







    }

}
