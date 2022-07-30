package test13IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws  Exception{
        //带有缓冲区的字符输出流
//        BufferedWriter  out=new BufferedWriter(new FileWriter("src/test13IO/dalian3"));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/test13IO/dalian3",true)));
        //开始写
        out.write("hello dalian");
        out.write("\n");
        out.write("hello world");
        //刷新
        out.flush();
        //关闭最外层
        out.close();
    }

}
