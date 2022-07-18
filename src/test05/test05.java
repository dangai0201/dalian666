package test05;

public class test05 {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cooker1=new ChinaCooker();
        FoodMenu cooker2=new AmericaCooker();
                //创建顾客对象
        Customer customer=new Customer(cooker2);
        //顾客点菜
        customer.order();

    }
}