package dz5;

public class Main {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        sum1 = calculateSums(2, 7);
        sum2 = calculateSums(3, 6);

        compareSums(sum1, sum2);

        compareSums(sum1 + 1, sum2 - 2);

        compare(sum1, sum2);

    }
// method calculates sums of two given integers:
    public static int calculateSums(int a, int b) {
        return a + b;
    }
// method prints true if sum1 is greater than sum2:
    public static void compareSums(int sum1, int sum2) {
        if (sum1 > sum2) {
            System.out.println("Sum1 is greater than sum2: true");
        }

    }
// method prints the result of search for even numbers between the two:
    public static void compare(int a, int b) {
        System.out.println(a % 2 == 0 || b % 2 == 0);
    }
}
