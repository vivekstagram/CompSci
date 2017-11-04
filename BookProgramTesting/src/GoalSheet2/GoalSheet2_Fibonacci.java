package GoalSheet2;
//Vivek Patel
//Have a user input the number of fibonacci numbers they want, and print that many
//Goal Sheet 2 - Fibonacci Numbers


import java.util.Scanner;

public class GoalSheet2_Fibonacci {

	public static void main(String[] args)
	{
		//Declare some variables
		int n, i;
		
		int firstTerm = 0, secondTerm = 1, nextTerm;
	    
		Scanner sc = new Scanner(System.in);
		
		//Assign the number of terms we want...
		System.out.print("How many numbers of the Fibonacci sequence do you want?: ");
		
		n = sc.nextInt();
		
		
		//Woohoo Fibonacci numbers
		System.out.println("Printing the first "+n+" numbers in THE Fibonacci Series");
		
		for (i = 0; i < n; i++)
	    {
			if (i <= 1)
			{
				nextTerm = i; 
			}
			else
			{
				nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
			
			System.out.println(nextTerm + " ");
	    }
		
		sc.close();
	}
}
