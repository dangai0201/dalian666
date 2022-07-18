package test03;

public class demo01 {
    //打印大于n的最小质数
    public static void main(String[] args) {
        printminzhishu(10);

    }
    //打印大于n的最小质数
    public static void printminzhishu(int n){
        /*while (true){
            n++;
            boolean flag=isZHUshu(n);
            if (flag){
                System.out.println(n);
                break;
            }
        }*/
        while (!isZHUshu(++n)){
        }
        System.out.println(n);
    }
    //判断是否未质数
    public static boolean isZHUshu(int num){
        for (int i=2; i<num;  i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}
