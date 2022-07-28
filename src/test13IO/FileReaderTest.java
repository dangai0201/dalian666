package test13IO;

/*
* 文件字符流，只能读取普通文本
* 读取文本内容时，比较方便，快捷
* */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            //创建文本字符输入流
            reader=new FileReader("src/test13IO/dalian");

            //准备一个char数组
            char[] chars=new char[4];
            //往插入数组中毒
            reader.read(chars);
            for (char c:chars){
                System.out.println(c);
            }



           /* //开始读
            char[] chars=new char[4];//一次读取4个字符
            int readCount=0;
            while((readCount=reader.read(chars))!=-1){
                System.out.print(new String(chars,0,readCount));
            }*/
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
