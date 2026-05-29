

class Car{
    String brand;
    static int wheels;
    int model;

    public Car(String b, int m){
        this.brand = b;
        this.model=m;
}

}

class Human{
    private String name;
    private int age;

    public void setname(String name){
           this.name = name;
    }
    public void setage(int age){
           this.age = age;
    }
    public String getname(){
          return  this.name ;
    }
    public int getage(){
           return this.age;
    }
    public void show(){
        System.out.println("Name: "+this.getname());
        System.out.println("Age: "+this.getage());
    }
}

class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n ){
        super();
        System.out.println(":in int A");
    }


}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        super();
        System.out.println("in B int");

    }

}

public class tel {
    public static void main(String[] args) {
        // Car c = new Car("Mustang", 987);
        // Car c1 = new Car("Mus", 454);
        // Car.wheels=4;
        // System.out.println(Car.wheels);
        // System.out.println(c1.brand+" "+ c1.model);
          


        // Human h = new Human();
        // Human h1 = new Human();
        // h.setname("Aditya Prajapati");
        // // h.setname("Aditya ");
        // h.setage(19);
        // h1.setname("Rahul Srivastav");
        // h1.setage(18);

        // h.show();
        // h1.show();
        
        // B b = new B(5);
          

        
    }
}
