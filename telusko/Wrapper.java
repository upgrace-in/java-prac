// Wrapper Class
// Classes such as Integer, Double, String
// which converts the primitive values to Objects in JAVA

public class Wrapper {
    public static void main(String[] args){
        int i = 10;
        // Integer i2 = new Integer(i); // boxing 
        Integer i2 = i; // autoboxing
        System.out.println(i2);
        
        // converting Integer value again to int;
        // int i3 = i2.intValue(); // unboxing
        int i3 = i2; // auto-unboxing
        System.out.println(i3);
    }
}
