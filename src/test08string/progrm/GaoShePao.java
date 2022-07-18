package test08string.progrm;


//高射炮，是武器，不能移动只能射击


public class GaoShePao extends Weapon implements  Shootable{
    @Override
    public void shoot() {
        System.out.println("高射炮射击");
    }
}
