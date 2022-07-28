package test13IO;

/*
* FileReader FileWriter 进行拷贝只能拷贝"普通文本"文件
*
* */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy02 {
    public static void main(String[] args) {
        FileReader in=null;
        FileWriter out=null;
        try {
            //读
            in=new FileReader("src/test13IO/dalian2");
            //写
            out=new FileWriter("src/test13IO/dalian2copy");

            //一边读一边写
            char[] chars=new char[1024*512];
            int readCount=0;
            while ((readCount=in.read(chars))!=-1){
                out.write(chars,0,readCount);
            }

            //刷新
            out.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
