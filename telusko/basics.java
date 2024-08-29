class Student {
    static String name; // this will be a common variable for all the objects of this class
    int roll;

    static void runMe() {
        System.out.println("Hari");
    }

    // static block for declaring any variables
    // this will be call only once

    // this will be call first before objects instantiated
    // because the class loader in JVM loads the class before initialization of
    // objects
    // and this static block got instialised at the same time

    static {
        name = "Hari Bol";
        System.out.println("I initialized first. Hari Bol!");
    }
}

// Camel Casing - Its easy to write & run code but its difficult to make your code readable

// class & interface -> Calc, Runnable
// variable & method -> marks, show()
// constants -> PIE, BRAND

// for more words -> showMyMarks()
// MyData

class basics {

    static void datatypes() {
        // Data Types
        byte b = 0b101;
        System.out.println(b);

        int h = 10_000;
        System.out.println(h);

        char c = 'f';
        c++;
        System.out.println(c);
    }

    static void typeConversions() {
        // Type Conversion & Casting
        // Narrowing & Widening Casting

        int a = 257;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int) f;

        System.out.println(k + " " + t);

    }

    static void arithematicOperator() {
        int num = 7;
        // int result = num++; // fetch the value & assign then increment
        int result = ++num; // increment & then fetch the value
        System.out.println(result);
    }

    static void arrays() {
        // jagged arrays
        int arr[][] = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];

        // 3D arrays
        int arr2[][][] = new int[1][2][3];
        arr2[0][0][0] = 3;
    }

    static void newSwitch() {
        int day = 5;
        String result = "";

        // OLD SYNTAX
        // switch (day) {
        // case 5, 4:
        // System.out.println("Hari");
        // break;
        // default:
        // System.out.println("Hare Krsna");
        // break;
        // }

        // NEW One with arrow
        // switch (day) {
        // case 5, 4 -> System.out.println("Hari");
        // default -> System.out.println("Hare Krsna");
        // }

        // Return a vlaue with switch
        // result = switch (day) {
        // case 5, 4 -> "9";
        // default -> "0";
        // };

        // return can also be done like
        result = switch (day) {
            case 5, 4:
                yield "9";
            default:
                yield "0";
        };

        System.out.println(result);
    }

    static void strings() {
        // Strings are objects
        // stored in heap memory
        // heap memory contains a sepcial place calls as String Constant Pool
        // where every time we change something a new object is created & referrenced
        // memory
        // is saved to the variable
        String name = new String("Hari");
        // incase if we don't use the old ones
        // that goes into garbage collection

        // so theres other way around where we can use StringBuffer or StringBuilder
        // to store string & dynamically change it within the same location
    }

    static void stringBuffer() {
        StringBuffer s = new StringBuffer("Hari");
        // we got extra 16 spaces to reduce the chances of relocation inside the heap
        // memory
        System.out.println(s.capacity());
        s.append(" Bol");
        System.out.println(s);
        s.deleteCharAt(0);
        String str = s.toString();
        System.out.println(str);
    }

    static void staticVariable() {
        Student s = new Student();
        s.roll = 10;
        s.name = "Hari";

        Student s1 = new Student();
        s1.roll = 10;
        s1.name = "Hari";

        s.name = "Hare"; // here it will impact all objects created this is what static does
    }

    static void staticMethod() {
        Student.runMe(); // we can call this method because it is a static one otherwise we must have
                         // obbject in order to call a method from a class
    }

    static void staticBlock() throws ClassNotFoundException {
        // if we want to load the class but no object
        Class.forName("Student");
    }

    static void anonymousObject() {
        // we can directly initialize any object without holding it somewhere like this
        new Student();
        // we can call any method too
        System.out.println(new Student().roll);
    }

    public static void main(String[] args) { // we have static here becasue its the starting point of execution
        // datatypes();
        // typeConversions();
        // arithematicOperator();
        // newSwitch();
        // strings();
        // stringBuffer();
        // staticVariable();
        // staticMethod();
        // try {
        //     staticBlock();
        // } catch (Exception e) {
        //     System.out.println("Hari");
        // }
        // anonymousObject();
    }
}
