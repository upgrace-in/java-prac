// Function Overloading
public class Prac2{

    static int plusMethod(int a, int b){
        return a+b;
    }

    static double plusMethod(double a, double b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(plusMethod(4, 7));
        System.out.println(plusMethod(4.7, 7.4));
    }
}