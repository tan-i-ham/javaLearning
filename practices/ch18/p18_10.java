import javax.sound.midi.SysexMessage;

public class p18_10 {
    // recursive method factorial (assumes its parameter is >= 0)
    public static long factorial(long number) {
        if (number <= 1) // test for base case
        {
            System.out.printf("this is the base case, will return 1\n");
            return 1; // base cases: 0! = 1 and 1! = 1
        } else {
            System.out.printf("%d * %d\n", number, number - 1);
            for (int counter = 0; counter <= 5; counter++) {

            }
            return number * factorial(number - 1);
        }

    } // end method factorial

    public static void main(String[] args) {
        // calculate the factorials of 0 through 21
        for (int counter = 0; counter <= 5; counter++) {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
    } // end main
} // end class FactorialCalculator