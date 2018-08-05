import java.util.Scanner;

// GCD : Greatest Commom Deviser 最大公因數
public class p18_11 {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            // System.out.printf("%d / %d \n", x, y);
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.print("Enter a first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int secondNum = scanner.nextInt();
        scanner.close();
        System.out.printf("these two numbers' GCD is : %d\n", gcd(firstNum, secondNum));
    }
}