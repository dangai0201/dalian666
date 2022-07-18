package test07_ShuZu;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,6,5,10,5,3,1};
        /*for (int i = 0; i < arr.length-1; i++) {
            System.out.println(i);
        }*/
        int count=0;
        int count2=0;


        for (int i = arr.length-1; i >0 ; i--) {
//            System.out.println(i);
            for (int j = 0; j < i; j++) {
                count++;
                if (arr[j]>arr[j+1]){
                    //交换位置
                    int temp;//先定义一个盒子
                    temp=arr[j];//吧arr[j]方法temp盒子里
                    arr[j]=arr[j+1];//arr[j+1]放到arr[j]里面
                    arr[j+1]=temp;//吧盒子里放到arr[j+1]中

                    count2++;

                }

            }
        }
        System.out.println("比较次数: "+count);
        System.out.println("交换次数: "+count2);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

}
