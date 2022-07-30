package test13IO;

/*
* DataInputStream:数据字节输入流
* DataOutputStream 写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序
* 读的顺序需要和写的顺序一致，才可以正常取出数据
*
* */


import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest01 {
    public static void main(String[] args) throws  Exception{
        DataInputStream dis=new DataInputStream(new FileInputStream("src/test13IO/dalian5"));
        //开始读
        byte b=dis.readByte();
        Short s=dis.readShort();
        int i= dis.readInt();
        Long l=dis.readLong();
        Float f=dis.readFloat();
        Double d=dis.readDouble();
        Boolean sex=dis.readBoolean();
        char c=dis.readChar();


        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);

        dis.close();

    }
}
