package test13IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //dalian1文件不存在的时候会自动新建
            //这种方式谨慎使用，这种方式会先将原文件清空，然后重新写入
//            fos=new FileOutputStream("src/IOTEST/dalian1");

            //以追加的方式在文件末尾写入，不会清空源文件内容
            fos=new FileOutputStream("src/IOTEST/dalian1",true);

            //开始写
            byte[] bytes={97,98,99,100};
            fos.write(bytes);
            //将byte数组的一部分写出
            fos.write(bytes,0,2);


            String s="大连人足球俱乐部";
            //将字符串转换成byte数组
            byte[] bs=s.getBytes();
            fos.write(bs);



            //写完之后，最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
