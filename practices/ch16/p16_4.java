import java.util.Scanner;

public class p16_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ); // create scanner
		System.out.println( "Enter a first string and press Enter:" );
		String s1 = scanner.next();
		System.out.println( "Enter a second string and press Enter:" );
		String s2 = scanner.next();
		System.out.println( "How many characters do you want to compare?" );
		String s_numOfChar = scanner.next();
		System.out.println( "Start from which index?" );
		String s_startIndex = scanner.next();

		int numOfChar = Integer.parseInt(s_numOfChar);
		int startIndex = Integer.parseInt(s_startIndex);
		
		if ( s1.regionMatches( true, startIndex-1, s2, startIndex-1, numOfChar ) )
		{
			System.out.printf("%s and %s matches %d chars starts from %dth index.\n", s1,s2,numOfChar,startIndex);
		}
		else
		{
			System.out.printf("%s and %s not mactches.\n", s1,s2);
		}
    }
}
