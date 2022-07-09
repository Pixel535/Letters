import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		String NazJas = "";
		String NazMal = "";
		char[] NazJasChar;
		char[] NazMalChar;
		Character letterM;
		Character letterJ;
		char temp;
		int idx;
		int ChangeCounter = 0;
		
		n = scanner.nextInt();
		
		if(n < 2 || n > 1000000)
		{
			System.out.println("n must be <= 1 000 000 and >= 2");
		}
		else
		{
			NazJas = scanner.next();
			NazMal = scanner.next();
			
			NazJas.toUpperCase();
			NazMal.toUpperCase();
			
			NazJasChar = NazJas.toCharArray();
			NazMalChar = NazMal.toCharArray();
			
			for(int i = 0; i < n; i++)
			{
				letterM = NazMalChar[i];
				for(int j = i; j < n; j++)
				{
					letterJ = NazJasChar[j];
					if(letterM.equals(letterJ) && NazMalChar[i] != NazJasChar[i])
					{
						idx = j - i;
						for(int x = 0; x < idx; x++)
						{
							temp = NazJasChar[j];
							NazJasChar[j] = NazJasChar[j-1];
							NazJasChar[j-1] = temp;
							ChangeCounter++;
							j--;
						}
						break;
					}
				}
			}
			System.out.println(ChangeCounter);
		}
	}

}
