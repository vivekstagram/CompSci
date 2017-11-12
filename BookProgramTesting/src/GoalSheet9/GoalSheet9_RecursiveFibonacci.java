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
		List<Integer> out = new ArrayList<Integer>();
		
		recursiveFibonacci(7, out);
		
		for (Integer i : out)
		{
			System.out.println(i);
		}
	}
	
	public static int recursiveFibonacci(int n, List<Integer> out)
	{
		int currentFibonacci = 0;
		
		if (n < 2)
		{
			out.add(n);
			return n;
		}
		else
		{
			
		}

		currentFibonacci += recursiveFibonacci(n - 1, out) + recursiveFibonacci(n - 2, out);
		
		out.add(currentFibonacci);
		
		
		return currentFibonacci;
		
	}
}
