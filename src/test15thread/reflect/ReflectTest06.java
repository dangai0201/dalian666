package test15thread.reflect;
/*
 *反射 Student类中所有的Field
 *
 * */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class studentClass=Class.forName("reflect.Student");

        String className=studentClass.getName();
        System.out.println("完整类名"+className);

        String simpleName=studentClass.getSimpleName();
        System.out.println("简类名"+simpleName);



        //获取类中所有的public修饰的Field
        Field[] fields=studentClass.getFields();
        System.out.println(fields.length);

        //取出这个Field
        Field f=fields[0];
        //取出Field的名字
        String filedName=f.getName();
        System.out.println(filedName);

        System.out.println("====================");
        //获取所有的Field
        Field[] fs=studentClass.getDeclaredFields();
        System.out.println(fs.length);
        //遍历
        for (Field ff:fs){
            //获取属性的修饰符列表
            int i=ff.getModifiers();//返回的修饰符是一个数字，每个数字是修饰符的代号
            System.out.println(i);
            //将代号转换成字符串
            String modrdierString= Modifier.toString(i);
            System.out.println(modrdierString);
            //获取属性类型
            Class fff=ff.getType();
            String fName=fff.getSimpleName();
//            String fName=fff.getName();
            System.out.println(fName);
            //获取属性的名字
            System.out.println(ff.getName());
        }




    }
}

