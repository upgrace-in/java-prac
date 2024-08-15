// Find the Smallest Element in an Array
public class small {
    public static void main(String[] args) {
        int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
        float avg, sum = 0;

        int length = ages.length;

        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }

        System.out.println(" " + lowestAge);
    }
}
