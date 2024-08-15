// String Buffer
import java.io.*;

public class strings {
    public static void main(String[] args){
        StringBuffer b = new StringBuffer("Hari ");

        b.append("Bol");
        b.insert(0, "Krsna ");
        b.replace(0, 5, "Madhusudana");
        b.delete(16, 21); // does counts the space

        System.out.println(b);
    }    
}
