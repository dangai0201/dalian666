package test08string.progrm;

//战斗机是武器可移动可攻击

public class Zhandouji extends Weapon implements  Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("战斗机起飞");

    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮");

    }
}
