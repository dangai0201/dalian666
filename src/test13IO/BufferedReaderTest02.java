package test13IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
* 转换流
*
* */

public class BufferedReaderTest02 {
    public static void main(String[] args) throws  Exception{
        /*
        //字节流
        FileInputStream in=new FileInputStream("src/test13IO/FileInputStreamTest01.java");
        //通过转换流转换（将字节流转换成字符流）
        //in是节点流，reader是包装流
        InputStreamReader reader=new InputStreamReader(in);
        //这个构造方法只能传字符流，不能传字节流
        //reader是节点流，br是包装流
        BufferedReader br=new BufferedReader(reader);
        */


        //合并
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("src/test13IO/FileInputStreamTest01.java")));







        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //关闭最外层
        br.close();
    }
}
