package test13IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
* 对test01改造：循环方式
* 缺点：
* 一次读取一个字节byte,这样内存和硬盘交互太频繁，基本上时间/资源都耗费在交互上面了
*
* */

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis= null;
        try {
            fis=new FileInputStream("C:\\Users\\admin\\Desktop\\abc.txt");
            /*while(true){
                int ReadData=fis.read();
                if (ReadData==-1){
                    break;
                }
                System.out.println(ReadData);
            }*/
            int readData=0;
            while ((readData= fis.read())!=-1){
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }
}
