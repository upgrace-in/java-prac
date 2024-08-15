/**
 * Encapsulation
 */

class Person{
    private String name;

    // Getter
    public String getName(){
        return name;
    }

    // Setter
    public void setName(String newName){
        this.name = newName;
    }
}

public class Concepts{
    public static void main(String[] args){
        Person Obj = new Person();
        // Obj.name = "HARI"; // error
        // System.out.println(Obj.getName()); // error bcuz name is private

        Obj.setName("HARI");
        System.out.println(Obj.getName());
    }
}