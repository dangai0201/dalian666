package test02;

/*
*类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类
*抽象类也属于引用书库类型
* 语法：
* 【修饰符列表】abstract class 类名{
* 类体
* }
*抽象类是无法实例化的，无法创建对象，所以抽象类是用来被子类继承的
*
* 抽象类的子类还可以是抽象类
*
* */

public class test02 {
    public static void main(String[] args) {

    }
}


abstract  class Accout{

}

//子类继承抽象类，子类可以实例化对象
class CreditAccount extends  Accout{
    

}

