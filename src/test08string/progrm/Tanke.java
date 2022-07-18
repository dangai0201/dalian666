package test08string.progrm;

//坦克是一个武器，可移动，可射击

public class Tanke extends  Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克射击");

    }
}
