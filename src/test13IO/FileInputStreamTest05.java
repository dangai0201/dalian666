package test13IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("src/IOTEST/dalian");
            System.out.println("总字节数量："+fis.available());

            /*int readByte=fis.read();
            //剩下可以读的字节数量
            System.out.println("剩下的字节数量:"+fis.available());*/

            //available方法的用处
            //这种方式不太适合太大的文件，因为byte[]数组不能太大
            byte[] bytes=new byte[fis.available()];
            //直接读一次就行
            int readCount=fis.read(bytes);
            System.out.println(new String(bytes));

            /*//skip跳过几个字节不读取
            fis.skip(3);
            System.out.println(fis.read());*/




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
