// Encapsulation

// Importing package
import java.util.*;

// Importing class
import java.util.Scanner;
import mypack.*;

class Test{
    private int x = 10;

    void set(int y){
        x = y;
    }

    int get(){
        return x;
    }
}

class third {
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.get());
    }
}
