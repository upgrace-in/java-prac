public class Prac1{
    public static void main(String[] args) {
        // Widening Casting (automatically)
        // converting a smaller type to a larger type size
        int myInt = 9;
        double myDouble = myInt; // Automatic Casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting (manually)
        // converting bigger to smaller type
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // manual casting: double to int

        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}