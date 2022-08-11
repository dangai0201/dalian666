package test15thread.reflect;

import java.lang.reflect.Method;

/*
 * 通过反射机制调用一个对象的方法
 *反射机制,让代码很具有通用性，可变化的内容都是写到配置文件当中，
 * 将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了，
 * 但java代码不需要任何改动，这就是反射机制的魅力
 * */
public class ReflectTest12 {
    public static void main(String[] args) throws  Exception{
        //不使用反射机制，调用方法
        //创建对象
        UserService userService=new UserService();
        //调用方法
        /*
         * 要素1：对象userService
         * 要素2：login方法
         * 要素3：实参列表
         * 要素4：返回值
         * */

        boolean loginSuccess=userService.login("admin","123123");
        System.out.println(loginSuccess);
        System.out.println(loginSuccess?"登录成功":"登录失败");


        //使用反射机制来调用一个对象的方法
        Class userServiceClass=Class.forName("test15thread.reflect.UserService");
        //创建对象
        Object obj=userServiceClass.newInstance();
        //获取method
        Method loginmeth=userServiceClass.getDeclaredMethod("login",String.class,String.class);
//        Method loginmeth=userServiceClass.getDeclaredMethod("login",int.class);
        //调用方法
        /*
         * loginmeth方法
         * obj对象
         * "admin","123123"实参
         * retValue返回值
         *
         * */
        Object retValue=loginmeth.invoke(obj,"admin","123");
        System.out.println(retValue);



    }
}
