package test13IO;
/*
* FileWriter:
* 文件字符输出流，写
* 只能输出普通文本
*
* */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out=null;
        try {
            //创建文件字符输出流
            out=new FileWriter("src/test13IO/dalian2");
//            out=new FileWriter("src/test13IO/dalian2",true);
            //开始写
            char[] chars={'我','是','大','连','人'};
            out.write(chars);
            out.write(chars,2,3);
            out.write("我是一名大连球迷！");
            out.write("\n");
            out.write("dalian");

            //刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
