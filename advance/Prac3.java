import java.util.Scanner;

class Prac3{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // to take input we will use System.in
        System.out.println("Enter Username: ");

        String userName = myObj.nextLine();
        System.out.println("Username is " + userName);
    }
}