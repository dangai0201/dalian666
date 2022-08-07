package test15thread.reflect;

/*
* 路径问题
* 获取文件的绝对路径，前提是：文件需要在类路径下，才能使用这种方式
*
* */

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class AboutPath {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //类路径：方法在src下的都是类路径下，src是类的根路径
        /*
        * Thread.currentThread()当前线程对象
        * getContextClassLoader()是线程对象的方法，可以获取到当前线程的类加载器对象
        * getResource()这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
        * */
        String path=Thread.currentThread().getContextClassLoader().
                getResource("classinfo66.properties").getPath();
        String path1 = URLDecoder.decode(path,"utf-8");
        //采用以上代码可以拿到一个文件的绝对路径
        System.out.println(path1);

        //从类的根路径下作为起点开始
        String path2=Thread.currentThread().getContextClassLoader().
                getResource("test15thread/reflect/db.properties").getPath();
        System.out.println(path2);

    }
}
