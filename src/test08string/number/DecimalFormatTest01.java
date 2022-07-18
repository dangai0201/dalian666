package test08string.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        /*
        * DecimalFormat专门负责数字格式化的
        * #代表任意数字
        * ，代表千分位
        * .代表小数点
        * 0代表不够时补0
        * ###,###.##
        * 表示：加入千分位，保留2个小数点
        * */
        DecimalFormat df=new DecimalFormat("###,###.##");
        String s=df.format(1234.56);
        System.out.println(s);

        DecimalFormat df1=new DecimalFormat("###,###.0000");//保留4位小数，不够补0
        String s1=df1.format(1234.56);
        System.out.println(s1);


        //精度极高的100
        BigDecimal v1=new BigDecimal(100);
        BigDecimal v2=new BigDecimal(200);
        //v1和v2都是引用，不能直接使用+求和
        BigDecimal v3=v1.add(v2);//调用方法求和
        System.out.println(v3);

        BigDecimal v4=v2.divide(v1);
        System.out.println(v4);




    }
}
