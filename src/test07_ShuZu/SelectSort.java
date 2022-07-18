package test07_ShuZu;

/*选择排序：
每一次从这堆"参与比较的数据当中"找出最小值，
拿着这个最小值和"参与比较的这堆最前面的元素"交换位置
选择排序比冒泡排序的好处：每一次的交换位置都是有意义的。
*/


public class SelectSort {
    public static void main(String[] args) {
        int[] arr={2,6,5,10,5,3,1};
        int count=0;
        int count2=0;
        for (int i = 0; i < arr.length-1; i++) {
            //i正好是"参与比较的这堆数据中"最左边的那个元素的下标。
            //i是一个参与比较的这堆数据中的奇点下标
            //假设起点i下标位置上的元素是最小的
//            System.out.println(i);
            int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                count++;
//                System.out.println("=====>"+j);
                if (arr[j]<arr[min]){
                    min=j;//最小值元素下标是j
                }

            }
            //当i和min相等时，标识最初的猜测是对的
            //当i和min不相等时，标识最初猜测是错误的，有比这个元素更小的元素
            //需要拿这个更小的元素和最左边的元素交换位置
            if (min!=i){
                int temp;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
                count2++;
            }
        }
        System.out.println("比较次数："+count);
        System.out.println("交换次数："+count2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

}
