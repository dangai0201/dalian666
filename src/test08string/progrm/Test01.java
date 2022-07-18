package test08string.progrm;

public class Test01 {
    public static void main(String[] args) {
        //构建一个军队
        Army army=new Army(4);//军队只有4个武器

        //创建武器
        Tanke tanke=new Tanke();
        Tanke tanke1=new Tanke();
        Wuzi wuzi=new Wuzi();
        Zhandouji zhandouji=new Zhandouji();
        GaoShePao gaoShePao=new GaoShePao();

        //添加武器
        try {
            army.addWeapon(tanke);
            army.addWeapon(tanke1);
            army.addWeapon(wuzi);
            army.addWeapon(zhandouji);
            army.addWeapon(gaoShePao);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }

        army.moveAll();

        army.attackAll();


    }
}
