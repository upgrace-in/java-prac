 /**
 * Access Modifiers: public, private, protected
 * No Access Modifiers: final, abstract, static, transient, synchronized, volatile
 * Follow: https://www.w3schools.com/java/java_modifiers.asp
 */

abstract class Main{
    public String name = "Hari";
}

class Student extends Main {
    public void study(){
        System.out.println(name);
    }
}

class Modifier {
    public static void main(String[] args)
    {
        Student Obj = new Student();
        // Obj.name = "Hari Bol";
        Obj.study();
    }
}