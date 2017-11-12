package GoalSheet9;
/*
 * Name: Vivek Patel
 * Date: 11/12/2017
 * Purpose: Write a recursive method called writeSquares that accepts an integer parameter n and
			prints the first n squares separated by commas, with the odd squares in descending order
			followed by the even squares in ascending order. For example, writeSquares(8); prints
			the following output:
			49, 25, 9, 1, 4, 16, 36, 64 (BJP Ch 12 Ex 6)
 */

import java.util.*;

public class GoalSheet9_WriteSquares {

	public static void main(String args[]) {
		writeSquares(8);
	}

	/*
	 * Prints out the first n square numbers in the order specified at the top of
	 * the file n is the number of squares to work with
	 
	public static void writeSquares(int n) {
		int[] values = new int[n];
		
		
		for (int i = n; i > 0; i--) 
		{
			if (i % 2 == 1) 
			{
				for (int j = 0; j < (values.length / 2); j++) 
				{
					if (values[j] == 0) 
					{
						values[j] = i ^ i;
					}
				}
			} 
			
			if (i % 2 == 0)
			{
				for (int j = n - 1; j >= (values.length / 2); j--) 
				{
					if (values[j] == 0)
					{
						values[j] = i * i;
					}
				}
			}
		}
		
		for (Integer i: values)
		{
			System.out.print(i + ", ");
		}
	
	}
	*/
	
	public static void writeSquares(int n)//Method with Singular parameter for user ease.
	{
		if (n == 1)//base case
		{
			System.out.print("1, ");
			return;
		}
		if (n % 2 == 1)
		{
			System.out.print(n * n + ", ");
			writeSquares(n - 1);//Printing has to wait until base case is reached
		}
		else
		{
			writeSquares(n - 1);
			System.out.print(n * n + ", ");//Prints out even squares before recursing. Allows for intermittent printing while functions are stacking up
		}
		
	}
	
}
