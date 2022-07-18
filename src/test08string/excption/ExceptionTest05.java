package test08string.excption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 在finally子句中的代码是最后执行的，并且是一定会执行的，及时try语句这块中的代码出现了异常
* finally子句必须和try一起出现，不能单独编写
*
*
* */
public class ExceptionTest05 {
    public static void main(String[] args) {
        FileInputStream fs=null;

        try {
            fs=new FileInputStream("/Users/yuliguo/Downloads/20200430134449_60961.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("dalian666");
            //流用完需要关闭，因为流是占用资源的
            if (fs!=null){//避免空指针异常
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //try finally 可以联合使用
        //执行书序：1.try 2.finally 3.return


        try{
            System.out.println("dalian");
            return;
            //退出jvm,finally语句中的代码就不执行了
//            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }


}
