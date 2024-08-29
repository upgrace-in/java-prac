// final keyword works for variable, class, methods

final class A {
    public void show(){
        System.out.println("A is shown!");
    }
}

// now we can't extend A because that is a constant class
class B extends A {
    
}

public class Final {
    public static void main(String[] args){
        final float PI = 3.14f;
        // we can't change here as the variable is declared as final
        // PI = 2.4f;
    }   
}

// same goes with methods
