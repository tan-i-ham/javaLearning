import java.util.Scanner;

public class p18_9 {
    public static long power(long base, int exponent) {
        if (exponent == 1) {
            return base;
        } else {

            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.print("Enter a base: ");
        long base = scanner.nextLong();
        System.out.print("Enter a exponent: ");
        int exponent = scanner.nextInt();
        ;

        System.out.printf("%d\n", power(base, exponent));
    }
}