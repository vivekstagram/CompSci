package GoalSheet3;
//Vivek Patel
//Print out numbers in between a first and second bound, which are specified by the user.
//If the lower and upper bounds are the same, print out the number.
//Print the numbers in order from the first to second bounds, whether it is ascending or descending.
//Goal Sheet 3 - Print Range

import java.util.Scanner;


public class GoalSheet3_PrintRange {
	
	public static void main(String args[])
	{
		//Get the bounds
		int start, end;
		
		//Get those variables
		Scanner sc = new Scanner(System.in);
		
		//Starting bound
		System.out.println("Enter the starting number: ");
		start = sc.nextInt();
		
		//Ending bound
		System.out.println("Enter the ending number: ");
		end = sc.nextInt();
		
		//Pretty self explanatory
		printRange(start, end);
		
		//Close the scanner
		sc.close();
	}
	
	public static void printRange(int a, int b)
	{
		//If the bounds are the same
		if (a == b)
		{
			System.out.println("[ " + a + " ]");
		}
		
		//Print out accordingly
		if (a < b)
		{
			System.out.print("[ ");
			
			for (int i = a; i <= b; i++)
			{
				System.out.print(i + " ");
			}
			
			System.out.print("]");
		}
		
		if (a > b)
		{
			System.out.print("[ ");
			
			for (int i = a; i >= b; i--)
			{
				System.out.print(i + " ");
			}
			
			System.out.print("]");
		}
		
	}
	
}
