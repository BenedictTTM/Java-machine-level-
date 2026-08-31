public class Person {
    String name ;
    int age ;
    String about;

    public Person(String name , int age , String about ){
        this.name = name ;
        this.age = age ;
        this.about = about ;

        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
    }
        public void about(String about) {
         System.out.println("My about " + about );
        };
    
}
