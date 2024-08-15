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

    static void arrays(){
        // jagged arrays
        int arr[][] = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];

        // 3D arrays
        int arr2[][][] = new int [1][2][3];
        arr2[0][0][0] = 3;
    }

    static void newSwitch() {
        int day = 5;
        String result = "";

        // OLD SYNTAX
        // switch (day) {
        //     case 5, 4:
        //         System.out.println("Hari");
        //         break;
        //     default:
        //         System.out.println("Hare Krsna");
        //         break;
        // }

        // NEW One with arrow
        // switch (day) {
        //     case 5, 4 -> System.out.println("Hari");
        //     default -> System.out.println("Hare Krsna");
        // }

        // Return a vlaue with switch
        // result = switch (day) {
        //     case 5, 4 -> "9";
        //     default -> "0";
        // };

        // return can also be done like
        result = switch (day) {
            case 5, 4: yield "9";
            default: yield "0";
        };

        System.out.println(result);
    }

    static void strings(){
        // Strings are objects
        // stored in heap memory
        // heap memory contains a sepcial place calls as String Constant Pool
        // where every time we change something a new object is created & referrenced memory 
        // is saved to the variable
        String name = new String("Hari");
        // incase if we don't use the old ones 
        // that goes into garbage collection

        // so theres other way around where we can use StringBuffer or StringBuilder
        // to store string & dynamically change it within the same location
    }

    public static void main(String[] args) {
        // datatypes();
        // typeConversions();
        // arithematicOperator();
        // newSwitch();
        strings();
    }
}
