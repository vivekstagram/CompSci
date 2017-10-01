import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		
		//Scanner to receive input in the form of a string
		Scanner sc = new Scanner(System.in);
		
		//The string to be input
		String s = sc.next();
		
		//Is this a palindrome?
		boolean isPalindrome = true;
		
		char[] sToCharArray = s.toCharArray();
		
		for (int i  = 0; i < (s.length() / 2); i++)
		{
			if (sToCharArray[i] == sToCharArray[s.length() - i - 1])
			{
				continue;
			}
			else
			{
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome)
		{
			System.out.println("\nThe string is a palindrome.");
		}
		else
		{
			System.out.println("\nThe string is not a palindrome.");
		}
		
		
		sc.close();
	}

}
