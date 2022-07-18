package test08string;

public class UserTest {
    public static void main(String[] args) {
        //s变量中保存的是字符串对象的内存地址
        //s引用中保存的不是"123"，是0x123
        //0x123是"123"字符串对象在"字符串常量池"当中的内存地址
        String s="123";


        User user=new User(110,"张三");
    }
}
