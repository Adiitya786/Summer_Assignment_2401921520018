

// import A;

// class A{           // cant be static 
//      int age;
//      public void show(){
//         System.out.println("in show");
//      }
//      static class B{     //can be static
//         int num;
//         public void config(){
//             System.out.println("in config");
//         }
//      }
// }

// public class Inner{
//         public static void main(String[] args) {
//             A a = new A();
//             a.show();
//             A.B b = new A.B();    //specifies outer class also for object creatiom of B
//             // A.B b = a.new B();     without static keyword decl in B
//             b.config();
            
//         }
// }





// Anonymous  Inner class



class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

public class Inner{
            public static void main(String[] args) {
            A a = new A(){
                // anoymous inner class declaring a overridden method without creating subclass
            public void show(){
            System.out.println("in B show");
        }
        
        // can have any no. of overidden method

        public void config(){
            System.out.println("in B config");
        }
    };
        a.show();
        a.config();
            }
}