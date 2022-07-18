package test08string.enum1;

public class EnumTest01 {
    public static void main(String[] args) {
        /*int aa=divide(10,2);
        System.out.println(aa);

        int bb=divide(10,0);
        System.out.println(bb);*/


        boolean bb=divide(10,2);
        System.out.println(bb?"计算成功":"计算失败");
    }

    /**
     * 默认 Java 方法输入 /** 回车会自动生成方法注释
     * @param a
     * @param b
     * @return 返回1标识成功，返回0标识失败
     */
    /*设计缺陷，应当选择布尔类型
    public static int divide(int a,int b){
        try{
            int c=a/b;
            return 1;

        }catch (Exception e){
            return 0;
        }}
        */

    public static boolean divide(int a,int b) {
        try {
            int c = a / b;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
