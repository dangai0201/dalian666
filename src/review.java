import sun.font.TrueTypeFont;

import java.util.Objects;

public class review {
    public static void main(String[] args) {
        Mytime m1=new Mytime(2008,8,8);
        Mytime m2=new Mytime(2008,8,8);
//        boolean flag=m1.equals(m2);
//        System.out.println(flag);

        String A1=new String("大连");
        String A2=new String("111");

        System.out.println(A1.equals(A2));
        System.out.println(A1);

/*        for (int i = 0; i < 10000; i++) {
            Mytime.Person p = new Mytime.Person();
            p=null;
        }*/
        Mytime.Person p = new Mytime.Person();
        p=null;
        System.gc();//建议启动垃圾回收器


        Object o=new Object();
        int hashcodevalue=o.hashCode();
        System.out.println(hashcodevalue);
        System.out.println(A2.hashCode());

    }
}

class Mytime{
    int year;
    int month;
    int day;

    public Mytime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Mytime(){

    }
   /* public boolean equals(Object obj){
        int year1=this.year;
        int month1=this.month;
        int day1=this.day;
        if(obj instanceof Mytime){
            Mytime t=(Mytime)obj;
            int year2=t.year;
            int month2=t.month;
            int day2=t.day;
            if(year1==year2 && month1==month2 && day2==day1){
                return true;
            }
        }
        return false;
    }*/
//   public boolean equals(Object obj){
//       if (obj==null){
//           return false;
//       }
//       if (!(obj instanceof  Mytime)){
//           return false;
//       }
//       if (this==obj){
//           return true;
//       }
//       Mytime t=(Mytime)obj;
//       if (this.year==t.year && this.month==t.month && this.day==t.day){
//           return true;
//       }
//       return false;
//   }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Mytime mytime = (Mytime) o;
//        return year == mytime.year && month == mytime.month && day == mytime.day;
//    }

//    finalize()方法执行时机，当一个java对象即将被垃圾回收器回收的时候，
//    垃圾回收器负责调用finalize()方法   垃圾销毁时机



    static class Person{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("即将被销毁");
            super.finalize();
        }
    }







}
