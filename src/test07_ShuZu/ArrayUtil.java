package test07_ShuZu;

import static java.util.Arrays.binarySearch;

/*
* 二分法查找：
* 10（下标0），11，12，13，14，15，16，17，18，19，20（下标10）
* 找出18这个元素的下标：
* (0+10)/2--->中间元素下标：5
* 拿着这个中间这个元素和目标要查找的元素进行对比：
* 中间元素arr[5]=15<18(被查找的元素)
* 被查找的元素在目标元素15的右边
*所以开始元素的下标从0变成5+1
* 在重新计算中间元素的下标
* （6+10）/2----8 对应的元素是18
*
* 1.二分法查找算法是基于排序的基础上（没有排序的数据是无法查找的）
* 2.二分法查找的终止条件：一直折半，直到中间的那个元素恰好是被查找的元素
* */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr={100,200,230,235,600,1000,2221};

        int index=binarySearch2(arr,600);
        System.out.println(index==-1?"该元素不存在！":"该元素下标"+index);
    }

    public static int binarySearch2(int[] arr, int dest) {
        //开始下标
        int begin=0;
        //结束下标
        int end=arr.length-1;
        //
        while(begin<=end){
            //中间元素下标
            int mid=(begin+end)/2;

            if (arr[mid]==dest){
                return mid;
            }else if(arr[mid]<dest){
                //目标在中间的右边
                begin=mid+1;
            }else {
                //目标在中间的左边
                end=mid-1;
            }

        }
        return -1;


    }
}
