package test13IO;

/*
* BufferedReader:
* 带有缓冲区的字符输入流
* 使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，自带缓冲
*
* */

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流
        //当前程序来说，FileReader节点流，BufferedReader包装流/处理流
        FileReader reader=new FileReader("src/test13IO/FileInputStreamTest01.java");
        BufferedReader br=new BufferedReader(reader);

        //r.readLine()读取一个文本行，但不带换行符
        String s=null;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }


        //关闭流
        //对于包装流来说，只需要关闭最外层流就行，里面的节点流最自动关闭
        br.close();

    }
}
