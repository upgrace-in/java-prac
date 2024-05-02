import java.util.ArrayList;
import java.util.Collections;

public class Prac5{
    public static void main(String[] args){
        ArrayList<String> devs = new ArrayList<String>();
        devs.add("SHRILA PRABHUPADA");
        devs.add("HH TAMALA KRSNA SWAMI MAHARAJA");
        devs.add("HH RADHANATH SWAMI MAHARAJA");
        devs.add("HH LOKNATH SWAMI MAHARAJA");
        devs.add("HH GOPAL KRSNA GOSWAMI MAHARAJA");
        devs.add("YS PRINCE");

        // System.out.println(devs);
        // System.out.println(devs.get(2));

        // CHANGING DATA
        // devs.set(2, "HG RADHESHYAM PRJI");
        // System.out.println(devs.get(2));

        devs.remove(5);
        // devs.clear();
        // System.out.println(devs);

        // FOREACH 
        Collections.sort(devs);
        for(String i: devs){
            System.out.println(i);
        }
    }
}