package test15thread.reflect;

/*
* java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
* 使用以下方法的时候，属性配置文件xxx.properties必须放到类路径下
*
* */

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类路径下。文件扩展名必须是properties
        //并且在写路径的时候，路径后面的扩展名不能写
//        ResourceBundle bundle=ResourceBundle.getBundle("classinfo66");
        ResourceBundle bundle=ResourceBundle.getBundle("test15thread/reflect/db");

        String className=bundle.getString("className");
        System.out.println(className);

    }
}
