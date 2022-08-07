package test15thread.reflect;
/*
*通过Class的newInstance()方法来实例化对象
* 注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参数构造存在才可以
* */
public class ReflectTest02 {
    public static void main(String[] args) {
        //这是不使用反射机制，创建对象
        User user=new User();
        System.out.println(user);


        //下面这段代码是以反射机制的方式创建对象
        try {
            //通过反射机制，获取class，通过class来实例化对象
            Class c=Class.forName("test15thread.reflect.User");

            //newInstance()这个方法会调用User这个类的无参构造方法，完成对象的创建
            //重点是：newInstance()调用的无参构造，必须保证无参构造是存在的
            Object obj=c.newInstance();

            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
