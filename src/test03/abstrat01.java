package test03;

public class abstrat01 {

    /*
    * 类到对象是实例化，对象到类是抽象
    *
    *抽象类：类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类
    *类本身是不存在的，所以抽象类无法创建对象（无法实例化）,所以抽象类是用来被子类继承的
    *抽象类型也属于引用数据类型
    *
    *final和abstract不能联合使用，这两个关键字是对立的
    *
    * 抽象类的子类还可以是抽象类
    *
    *
    * 抽象类有构造方法是供子类使用的
    *
    * 抽象方法没有实现的方法，没有方法体的方法
    * public abstract void dosome();
    * 抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中
    * */
    public static void main(String[] args) {

    }
}




abstract class Account{
//    public Account(){
//
//    }
//    public Account(String s){
//
//    }




}

//子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account{

}
