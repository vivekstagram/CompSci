package GoalSheet9;
/*
 * Name: Vivek Patel
 * Date: 11/11/2017
 * Purpose: Write a recursive method that takes an integer argument n and gives the first n numbers
			in the Fibonacci series.
 */

import java.util.*;

public class GoalSheet9_RecursiveFibonacci {

	public static void main(String args[])
	{	
		//The number being compared in the looping condition is how many Fibonacci numbers the user wants to output
		for (int i = 1; i <= 20; i++)
		{
			 System.out.println(recursiveFibonacci(i));
		}
	}
	
	//Returns the nth number in the Fibonacci series with the first number being 0
	public static int recursiveFibonacci(int n)
	{
		int currentFibonacci = 0;
		
		//In the first 3 Fibonacci numbers
		if (n < 4)
		{
			//The series begins with 0
			if (n == 1)
			{
				return 0;
			}
			else
			{
				//The 2nd and 3rd numbers in the sequence
				return 1;
			}
		}
		
		//Recursive call to add the two previous Fibonacci numbers
		currentFibonacci = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
		
		return currentFibonacci;
		
	}
}
