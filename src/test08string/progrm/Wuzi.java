package test08string.progrm;



//物资运输，是武器，只能移动，不能攻击
public class Wuzi extends Weapon implements  Moveable{
    @Override
    public void move() {
        System.out.println("运输机起飞");
    }
}
