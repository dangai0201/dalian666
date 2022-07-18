package test08string.enum1;

public class EnumTest02 {
    public static void main(String[] args) {
        Result r=divide(10,2);
        System.out.println(r==Result.SUCESS?"计算成功":"计算失败");

        //switch语句支持枚举类型
        switch (Season.WINTER){
            case SPRING :
                System.out.println("春天");
            case SUMMER:
                System.out.println("夏天");
            case AUTUMN:
                System.out.println("秋天");
            case WINTER:
                System.out.println("冬天");
        }




    }
    public static Result divide(int a,int b) {
        try {
            int c = a / b;
            return Result.SUCESS;

        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}


/*
* 枚举：一枚一枚可以列举出来的，才建议使用枚举
* 枚举也是一种引用数据类型
* 枚举中的每一个值可以看做是常量
* */
enum Result{
    SUCESS,FAIL
}


enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
