import java.util.Scanner;

public class Practice {
   public static void main(String[] args){
    Student student = new Student();
    student.setDetails("Ben",2, "d");

   }
}

class Student {
String name ;
int age ;
String about ;

public void setDetails(String name, int age , String about){
   this.name = name ;
   this.age = age ;
   this.about = about;

   System.out.println("Name"+ name);
}
}