
@FunctionalInterface
interface A{
    // void run(int i, int j);

    int run(int i , int j);
}
public class Lambda {
    public static void main(String[] args) {
        // Lambda expression :used to give shorter syntax for implementing a functional interface
        
        // A a  = () -> System.out.println("in running");
        //     // can only be used for functional interface
        
        // A a = (int i, int j) -> System.out.println("sum : "+(i+j));    //can be used for parameters also
        // a.run(5,4);
             
        A a = (i,j) -> i+j;  //while only returning a value,it did not need any return to write ...
        System.out.println(a.run(4, 3));
    }
}
