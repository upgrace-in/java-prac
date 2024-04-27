public class Main{
    int x = 47;
    final int y = 74; // final maintains the integrity of it

    // Constructor Method
    public Main(){
        x = 74;
    }
    // with params
    public Main(int z){
        x = z;
    }

    // Static Method
    static void myMethod(){
        // Static methods can be called without creating objects
        System.out.println("Hari Hari");
    }

    // Public Method
    public void myMethod2(){
        // Public methods must be called by creating objects
        System.out.println("Hari Hari Hari Hari");
    }

    public static void main(String[] args){
        myMethod();
        // myMethod2(); // will give compile error

        Main myObj = new Main();
        myObj.myMethod2();
    }


}