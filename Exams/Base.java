abstract class prac {
    public String fname = "Hare";
    public int age = 50;
}

class Basic extends prac {
    public void func() {
        System.out.println(fname);
    }
}

public class Base {
    int x = 5;

    static void inner() {
        System.out.println("Inner func called!");
    }

    public static void main(String[] args) {
        // first myObj = new first();
        // Base obj = new Base();
        // System.out.println(myObj.x + " " + obj.y);
        // inner(); // running static function directly
        // obj.func();
        // second n = new second(50);
        // n.func();
        Basic b = new Basic();
        b.func();
    }
}