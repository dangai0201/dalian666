package test10collection;


/*
* 自定义泛型
*自定义泛型的时候，<>是一个标识符，随便写
* java原代码中经常出现的是：
* <E><T>
* E是element单词的首字母
* T是Type单词的首字母
* */
public class GenericTest03<dalian> {
    public void doSome(dalian o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        //new 对象的时候指定了泛型是：String类型
        GenericTest03<String> genericTest03=new GenericTest03<>();
        GenericTest03<Integer> gt2=new GenericTest03<>();
        genericTest03.doSome("abc");
        gt2.doSome(123);

        MyIterator<String> mi=new MyIterator<>();
        String s1=mi.get();
        MyIterator<Animal> mi2= new MyIterator<>();
        Animal a=mi2.get();

    }

}


class  MyIterator<T>{
    public  T get(){
        return null;
    }

}
