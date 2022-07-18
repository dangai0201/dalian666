package test08string.progrm;

//类在强制类型转换过程中，如果类转换成接口类型
//那么类和接口之间不需要存在继承关系，也可以转换

public class Army {
    //武器数组
    private Weapon[] weapons;

    /**
     * 创建军队的构造方法
     * @param count 武器的数量
     */

    public Army(int count){
        //动态初始化数组中每一个元素默认值是null
        weapons=new Weapon[count];
    }

    /**
     * 将武器加入数组
     * @param weapon
     */
    public void  addWeapon(Weapon weapon) throws WeaponException {
        for (int i = 0; i < weapons.length; i++) {
            if (null==weapons[i]){
                weapons[i]=weapon;
                System.out.println(weapon+"：武器添加成功");
                return;
            }

        }
        //程序如果执行到这，武器没有添加成功
        throw new WeaponException("武器数量已达到上线！");

    }
    //所有可攻击的武器攻击
    public void attackAll(){
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof  Shootable){
                //调用子类中特有的方法，向下转型
                Shootable shootable=(Shootable) weapons[i];
                shootable.shoot();
            }
        }


    }
    //所有可移动的武器移动
    public void moveAll(){
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof  Moveable){
                Moveable moveable=(Moveable) weapons[i];
                moveable.move();
            }
        }

    }

}
