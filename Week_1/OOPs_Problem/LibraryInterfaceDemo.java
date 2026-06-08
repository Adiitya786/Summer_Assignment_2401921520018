 
  interface LibraryUser {
     public void MethodName();
     public void registerAccount();
     public void requesBook();
    
}
class KidUsers implements LibraryUser{
   int age;
   String bookType;
    public void MethodName(){
              
    }
    public void registerAccount(){
           if(age<12){
            System.out.println("You have successfully registered under a Kids Account ");
           }
           else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
           }
    }
    public void requesBook(){
         if(bookType.equals("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
         }
         else{
            System.out.println("Oops, you are allowed to take only kids books");
         }
    }
}

class AdultUser implements LibraryUser{
           int age;
   String bookType;

   public void MethodName(){

   }
      public void registerAccount(){
           if(age>12){
            System.out.println("You have successfully registered under a Adult Account ");
           }
           else{
            System.out.println("Sorry, Age must be greater than 12 to register as a adult");
           }
    }
    public void requesBook(){
         if(bookType.equals("Fiction")){
            System.out.println("Book issued successfully, please return the book within  7 days");
         }
         else{
            System.out.println("Oops, you are allowed to take only Adults fiction books");
         }
    }
}
public class LibraryInterfaceDemo{
    public static void main(String[] args) {
        KidUsers k = new KidUsers();
      //   k.age =10;
      //   k.bookType="Kids";
      //   k.requesBook();
        k.age =18;
        k.bookType="Fiction";
        k.requesBook();

        AdultUser a = new AdultUser();
      //   a.age = 5;
      //   a.bookType = "Kids";
      //   a.requesBook();
        a.age = 23;
        a.bookType = "Fiction";
        a.requesBook();
    }
}