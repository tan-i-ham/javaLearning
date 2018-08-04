import java.util.Scanner;
public class p16_7{
    public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println( "Enter a sentence and press Enter" );
		String sentence = scanner.nextLine();
		
		String[] tokens = sentence.split(" ");
		System.out.println("<<<<the wired language>>>>");
		for ( String token : tokens )
		{
			String output = printLatinWord(token);
			System.out.println( output );
		}
	}
	public static String printLatinWord(String word) {
		String returnString = word.substring(1, word.length())+ word.substring(0,1)+"ay";
		return returnString;
	}

}