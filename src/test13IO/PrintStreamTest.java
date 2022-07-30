package test13IO;

/*
* PrintStream:标准的字节输出流，默认输出到控制台
*
* */

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws  Exception{
        //合起来写
        System.out.println("hello dalian");
        //分开写
        PrintStream ps =System.out;
        ps.println("dalian1");
        ps.println("dalian2");
        //标准输出流不需要手动close()关闭

        //标准输出流不再指向控制台，指向log文件
        PrintStream ps1=new PrintStream(new FileOutputStream("src/test13IO/dalian6"));
        System.setOut(ps1);

        System.out.println("dalianpro");
        System.out.println("dalianpro1");
        System.out.println("dalianpro2");

    }

}
