
// // enum is special type used to store a fixed set of constants
// enum Status {
//     Running, walking, fielding, playing;
// }

// public class Enu{
//     public static void main(String[] args) {
//         Status s = Status.fielding;     // can be accessed normally
//         // Status s = Status.playing;    
//        // System.out.println(s);

//         // Status ss[] = Status.values();
        
//         // for(Status s : ss){
//         //     System.out.println(s+"->"+s.ordinal());
//         // }

//         switch (s) {
//             case Running:
//                  System.out.println("Process is running");
//                 break;
//             case walking:
//                  System.out.println("Process is walking");
//                 break;
//             case fielding:
//                  System.out.println("Process is fielding");
//                 break;
//            default:
//                  System.out.println("Process is playing");
//                 break;
          
//         }

//         // if(s==Status.Running){
//         //     System.out.println("Process is running");
//         // }
//         // else if(s==Status.walking){
//         //     System.out.println("Process is walking");
//         // }
//         // else if(s==Status.fielding){
//         //     System.out.println("Process is in field");
//         // }
//         // else if(s==Status.playing){
//         //     System.out.println("Process is playing");
//         // }
//     }
// }


enum Laptop{
    mac("macos",2000),Xps("xos",1800),surface(4000);
      int price;
    String model;
    private Laptop(int price){
        // price =500;
        model = "default";
    }
    private Laptop(String model,int price){
        this.model  = model;
        this.price = price;
    }
    public void setprice(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}

public class Enu{
    public static void main(String[] args) {
        Laptop lap = Laptop.mac;
        System.out.println("MOdel = "+lap.getModel()+" & price =  "+lap.getPrice());
        lap.setModel("new mac");
        System.out.println(lap.getModel());
        // for(Laptop lp : Laptop.values()){
        //              System.out.println(lp +" model and price  "+lp.getModel()+" "+lp.getPrice());
        // }
    }
}