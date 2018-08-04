import java.util.Scanner;

public class p16_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ); // create scanner
		System.out.println( "Enter a first string and press Enter" );
		String firstString = scanner.next();
		System.out.println( "Enter a second string and press Enter" );
		String secondString = scanner.next();;
		
		//Output whether the first string is less than, equal to or greater than the second
		
		System.out.printf("result : %d \n",firstString.compareTo(secondString));
		int result = firstString.compareTo(secondString);
		if(result > 0)
		{
			System.out.println("firstString is greater than second string");
		}
		else if(result == 0)
		{
			System.out.println("firstString is equal to second string");
		}
		else
		{
			System.out.println("second string is less than firstString");
		}
    }
}
