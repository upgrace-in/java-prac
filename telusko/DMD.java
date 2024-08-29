// Dynamic Method Dispatch
// Its also known as Run Time Polymorphism (Overriding)

class A {
    void show(){
        System.out.println("A is shown!");
    }
}

class B extends A {
    void show(){
        System.out.println("B is shown");
    }
}

class C {
    void show(){
        System.out.println("C is show!");
    }
}

public class DMD {
    public static void main(String[] args){
        A obj = new A();
        obj.show();

        // we can initialize any class within an object variable declared with 
        // another class as the data type 
        // if and only if the intializing class is a child of the decalted class which
        // acts as the data type 
        obj = new B();

        // this provide error because C is not a child of A
        // obj = new C();
    }
}
