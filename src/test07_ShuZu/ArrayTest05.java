package test07_ShuZu;

public class ArrayTest05 {
    public static void main(String[] args) {
        Aniaml a1 = new Aniaml();
        Aniaml a2 = new Aniaml();
        Aniaml[] aniamls={a1,a2};
        for (int i = 0; i < aniamls.length; i++) {
//            Aniaml a = aniamls[i];
//            a.move();
            aniamls[i].move();
        }

        Cat c=new Cat();
        Bird b=new Bird();
        Aniaml[] anis={c,b};
        for (int i = 0; i < anis.length; i++) {
            //如果调用的方法是父类中存在的方法不需要向下转型，直接使用父类型引用调用即可
            Aniaml an=anis[i];
            an.move();

            //调用子对象特有方法的话，需要向下转型
            //对类型进行向下转型的时候，一定要使用instanceof
            if (anis[i] instanceof Cat){
                //anis[i]是一个引用，anis[i]变量保存了内存地址指向了堆中的对象
                //anis[i]引用指向的堆内存中java对象是一个Cat
                Cat cat=(Cat)anis[i];
                cat.catchMouse();
            }else if (anis[i] instanceof Bird){
                Bird bird= (Bird) anis[i];
                bird.sing();
            }
        }




    }
static class  Aniaml{
    public void move(){
        System.out.println("Animal move....");
    }
    public  void catchMouse(){
        System.out.println("猫在捉老鼠");
    }
}

static class Cat extends Aniaml{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
}
static class Bird extends Aniaml{
    @Override
    public void move() {
        System.out.println("bird fly ....");
    }
    public void sing(){
        System.out.println("鸟儿在歌唱！！");
    }
}
}
