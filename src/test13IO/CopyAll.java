package test13IO;

/*
*
* 拷贝目录
* */
import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        //拷贝原
        File srcfile=new File("/Users/yuliguo/Desktop/物料");
        //拷贝目标
        File destfile=new File("");
        //调用方法拷贝
        copyDir(srcfile,destfile);
    }

    /**
     * 拷贝目录
     * @param srcfile 拷贝源
     * @param destfile 拷贝目标
     */
    private static void copyDir(File srcfile, File destfile) {
        if (srcfile.isFile()){
            //srcfile如果是一个文件的话，递归结束
            //是文件的时候需要拷贝 一边读，一边写
            FileInputStream in=null;
            FileOutputStream out=null;
            try {
                //读这个文件
                in =new FileInputStream(srcfile);
                //写到这个文件中
                String path=(destfile.getAbsolutePath().endsWith("\\") ? destfile.getAbsolutePath():destfile.getAbsolutePath()+"\\"+
                        srcfile.getAbsolutePath().substring(3));
                out=new FileOutputStream(path);
                //一边读，一边写
                byte[] bytes=new byte[1023*1024];//一次复制1Mb
                int readCount=0;
                while((readCount=in.read(bytes))!=-1){
                    out.write(bytes,0,readCount);
                }

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

            return;
        }
        //获取源下面的子目录
        File[] files=srcfile.listFiles();
        for (File file:files){
            //获取所有文件的绝对路径（包括目录和文件）
//            System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                String srcDir=file.getAbsolutePath();
                String destDir=(destfile.getAbsolutePath().endsWith("\\") ? destfile.getAbsolutePath():destfile.getAbsolutePath()+"\\"+
                        srcDir.substring(3));
                File newfile=new File(destDir);
                if (!newfile.isFile()){
                    newfile.mkdirs();
                }

            }

            //递归调用
            copyDir(file,destfile);
        }
    }
}
