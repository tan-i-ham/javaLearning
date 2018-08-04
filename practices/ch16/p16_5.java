import java.util.Scanner;

public class p16_5{
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		StringBuilder buffer = new StringBuilder();
		
		for(int i=0; i<6; i++)
		{
			int r =(int)(Math.random()*5);
			String currrntStr = "";
			if( (i%4) ==0)
			{
				currrntStr = article[r];
			}
			else if((i%4)==1)
			{
				currrntStr = noun[r];
			}
			else if((i%4)==2)
			{
				currrntStr = verb[r];
			}
			else if((i%4)==3)
			{
				currrntStr = preposition[r];
			}
			buffer.append(currrntStr);
			buffer.append(" ");
		}
		System.out.printf( "buffer contains: %s\n", buffer.toString() );
    }
}
