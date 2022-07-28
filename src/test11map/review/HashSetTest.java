package test11map.review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
     public static void main(String[] args) {
          //创建结合对象
          HashSet<String> set=new HashSet<>();
          //添加元素
          set.add("dalian");
          set.add("abc");
          //set集合的元素不能通过下标取了，没有下标
          //遍历集合（迭代器）
          Iterator<String> it=set.iterator();
          while(it.hasNext()){
               System.out.println(it.next());
          }
          //遍历集合（foreach）
          for(String s:set){
               System.out.println(s);
          }
          //无序不可重复
          set.add("dalian");
          set.add("dalian");
          set.add("dalian");
          System.out.println(set.size());

          set.add("1");
          set.add("10");
          set.add("2");
          for (String ss:set){
               System.out.println("--->"+ss);
          }
          //创建Set集合，存储Student对象,存储hashmap集合key的元素需要同时重写equals和hashCode
          Set<Student> students=new HashSet<>();

          Student s1=new Student(111,"zhangsan");
          Student s2=new Student(111,"zhangsan");
          Student s3=new Student(222,"wangwu");

          students.add(s1);
          students.add(s2);
          students.add(s3);

          System.out.println(students.size());

          //遍历
          for (Student stud:students){
               System.out.println(stud);
          }






     }
}
class  Student{
     int no;
     String name;

     public Student() {

     }

     public Student(int no, String name) {
          this.no = no;
          this.name = name;
     }

     @Override
     public String toString() {
          return "Student{" +
                  "no=" + no +
                  ", name='" + name + '\'' +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Student student = (Student) o;
          return no == student.no && Objects.equals(name, student.name);
     }

     @Override
     public int hashCode() {
          return Objects.hash(no, name);
     }
}
