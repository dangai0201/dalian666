package test15thread.reflect;
/*
 * 可变长度参数
 *1.可变长度参数要求的参数个数0~n个
 * 2.可变长度参数在参数列表中必须是最后有一个位置上，而且可变长度参数只能有1个
 * 3.可变长度可以当做一个数组来看待
 *
 * */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(1);
        m(1,2);

        m2(1);
        m2(1,"dalian");
        m2(1,"dalian","hhhh");



        m3("dalian","abc","hahaha");
        String[] strs={"a","b","c"};
        //也可以传一个数组
        m3(strs);

//        直接传一个数组
        m3(new String[]{"我","dalian","人"});

        m3("我","dalian","人");



    }
    public static void m(int...args){
        System.out.println("m方法执行了");
    }
    //必须在最后，只能有1个
    public static void m2(int a,String...arg1){

    }
    public static void  m3(String...args){

        //args有length属性，说明args是一个数组
        //可以将可变长度参数当做一个数组来看
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }


}
