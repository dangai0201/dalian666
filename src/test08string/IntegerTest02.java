package test08string;

public class IntegerTest02 {
    public static void main(String[] args) {
        //String-->int
        String s1="100";
        int i1=Integer.parseInt(s1);
        System.out.println(i1+1);
        //int-->String
        String s2=i1+"";
        System.out.println(s2+1);
        //int -->Integer
        Integer x=100;
        //Integer-->int
        int y=x;
        //String-->Integer
        Integer k=Integer.valueOf("123");
        //Integer-->String
        String e=String.valueOf(k);






    }
}
