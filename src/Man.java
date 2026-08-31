public class Man extends Person {
    public Man(String name , int age , String about ){
     super(name , age , about);
    }


    @Override
    public void about(  String about) {
    System.out.println("My personal about " + about + "My age is "+ age );
     };

     public static void main (String[] args){
    
    Man man1 = new Man("Ben" , -34 , "Charlie charlie dog dog");
    man1.about( "Guuyyy man");

}
    
}

