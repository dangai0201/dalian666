package test07_ShuZu;

public class ArrayTest03 {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("使用该系统清输入程序参数，参数包括用户名和密码，例如：zhangsan 123");
            return;
        }
        String username=args[0];
        String password=args[1];
//        if (username.equals("admin")&&password.equals("123")){
        //即使username和password都是null,也不会出现空指针异常
        if ("admin".equals(username)&&"123".equals(password)){
            System.out.println("登录成功，欢迎["+username+"]回家");
            System.out.println("您可以继续使用该系统......");
        }else{
            System.out.println("验证是失败，用户名不存在或密码错误");
        }

    }
}
