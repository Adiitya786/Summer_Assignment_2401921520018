

// // interface -> interface : extends
// // interface -> class: implements

// interface A {
//     // both the variables are final and static in nature by default
//      int num = 10;
//      String locality ="Rishikesh";
       
//      // methods are already abstract and public by default...
//      void show();
//      void config();
    
// }
//  interface X  {
//           void run();
    
// }
//  interface Y extends X {
//         void display();
    
// }
// class B implements A,X{
//     public void show(){
//         System.out.println("in B show");
//     }
//     public void config(){
//         System.out.println("in B config");
//     }
//     public void run(){
//         System.out.println("running B");
//     }
// }
// public class Interface {
//     public static void main(String[] args) {
//         B obj = new B();
//         // A.locality = "shaumli";   gives error bcz static and final in nature...
//         obj.show();
//         obj.config();
//         obj.run();
//         System.out.println(A.locality);
//     }
// }









interface computer  {
            void code();
    
}
class Laptop implements computer{
    public void code(){
        System.out.println("In laptop");
    }
}
class Desktop implements computer{
    public void code(){
        System.out.println("In desktop");
    }
}
class Developer {

    public void devapp(computer dev){
        dev.code();
    }
}
public class Interface {


    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer d = new Developer();   
        d.devapp(lap);
        d.devapp(desk);
    }
     
}