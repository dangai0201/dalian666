package test13IO;
/*
 * IO流的分类
 * 1.按照流的方向进行分类
 * 以内存为参照物
 * 往内存中去，叫做输入（Input）,或者叫做read
 *从内存中出来，叫做输出（Output）.或者叫做写（Write）
 * 2.按照读取数据方式不同进行分类
 * 有的流是按照字节的方式读取数据，一次读取1个字节byte，等同于一次读取8个二进制
 * 这种流是万能的，什么类型的文件都能读取包括：文本文件，图片声音文件，视频文件
 *a中国
 * 第一次读：一个字节，读到a
 * 第二次读：一个字节，读到中字符的一半
 * 第三次读：一个字节：读到中字符的另一半
 *
 * 有的流是按照字符的方式读取数据，一次读取一个字符，这种流是为了方便读取普通文本文件而存在的
 * 这种流不能读取：图片声音，视频等文件，只能读取纯文本文件，连word都不能读取
 *a中国
 * 第一次读：a字符（a字符在系统中占用1个字符）
 * 第二次读：中字符（中字符在系统中占用2个字符）
 * 流的分类
 * 输入流。输出流
 *字节流，字符流
 *
 *
 * java io 四大家族
 * java.io.InputStream 字节输入流
 * java.io.OutputStream 字节输出流
 * java.io.Reader 字符输入流
 * java.io.Writer 字符输出流
 * 四大家族的首领都是抽象类（abstract class）
 * 所有的流都实现了java.io.Closeable接口，都是可关闭的，都有close（）方法
 * 流毕竟是一个管道，这个是内存和硬盘之间的管道，用完之后一定要关闭，不然会耗费（占用）很多资源。
 * 所有的输出流都实现了：
 * java.io.Flushable接口，都是可刷新的，都有flush()方法
 * 养成一个好习惯，输出流在最终输出后，一定要flush()刷新一下，这个刷新标识将管道/通道中剩余未输出的数据
 * 强行输出完（清空管道），刷新的作用就是清空管道
 * 注意：如果没有flush()可能会导致丢失数据
 *
 * 注意：java中只有以类名Stream结尾的都是字节流。以Reader、Writer结尾都是字符流
 *
 * java.io包下需要掌握的流
 * 文件专属
 * FileInputStream
 * FileOutputSteam
 * FileReader
 * FileWriter
 *转换流（将字节流转换成字符流）
 * InputStreamReader
 * OutputStreamWriter
 *缓冲流专属
 * BufferedReader
 * BufferedWriter
 * BufferedInputStream
 * BufferedOutputStream
 *数据流专属
 * DataInputStream
 * DataOutputStram
 *对象专属流
 * ObjectInputStream
 * ObjectOutputStream
 *标准输出流
 * PrintWriter
 * PrintStream
 * */
/*
 * 1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
 * 2.字节的方式，完成输入操作，完成读的操作（硬盘---》内存）
 *
 * */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            //创建文件字节输入流对象（java中“\”标识转义，写成/这个也是可以的）
            //一下都是采用了：绝对路径的方式
            fis=new FileInputStream("C:\\Users\\admin\\Desktop\\abc.txt");
            //开始读
            //这个方法的返回值是：读取到的字节本身
            //已经读到文件的末尾了，在读的时候读取不到任何数据，返回-1
            int readData=fis.read();
            System.out.println(readData);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //finally语句块中确保流一定关闭
            if (fis != null) {
                //避免空指针异常
                //关闭流的前提是：流不是空，流是null的时候没必要关闭
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
