package test05;

public class Customer {
    private FoodMenu foodmenu;

    public Customer(){

    }
    public Customer(FoodMenu foodmenu){
        this.foodmenu=foodmenu;

    }

    public void setFoodMenu(FoodMenu foodmenu){
        this.foodmenu=foodmenu;
    }
    public void getFoodMenu(FoodMenu foodmenu){
        this.foodmenu=foodmenu;
    }

    //提供一个点菜的方法
    public void order(){
        foodmenu.jingjiangrousi();
        foodmenu.shiziCHaojidan();
    }


}
