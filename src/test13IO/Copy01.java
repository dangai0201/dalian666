package test13IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 使用fileInputStream+fileOutStream完成文件的拷贝
* 拷贝的过程应该是一边读，一边写
* 适应以上的字节流拷贝文件的时候，文件类型随意，万能的
*
* */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建一个输入流对象
            fis=new FileInputStream("C:\\Users\\admin\\Desktop\\app-release.apk");
            //创建一个输出流对象
            fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\MP3\\app-release.apk");
            //最核心的：一边读，一边写
            byte[] bytes=new byte[1024*1024];//一次最多拷贝1Mb
            int readCount=0;

            while ((readCount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }

            //刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //分开try
            //一起try的时候，其中一个出现异常，可能会影响到另一个流的关闭
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
