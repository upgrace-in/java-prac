import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        HashSet<String> devs = new HashSet<String>();

        devs.add("HH RNSM");
        devs.add("HH RNSM");
        System.out.println(devs);
        System.out.println(devs.contains("HH LNSM"));

    }
}