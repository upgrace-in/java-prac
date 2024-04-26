// JAVA SCOPES
public class Prac3{
    // Method Scope
    static void method(){
        // x is not accessible here
        int x = 47;
        // x is accessible here
        System.out.println(x);
    }
    // x is not accessible here

    // Block Scope
    static void block(){

        int y = 13;

        {
            // x is not accessible here
            int x = 47;
            // x is accessible here
            System.out.println(x);
        }
        // x is not accessible here
        // y is accessible here
        System.out.println(y);

    }
    public static void main(String[] args){
        method();
        block();
    }
}