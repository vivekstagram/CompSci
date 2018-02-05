//*******************Vivek Patel - Jan 2018 - BJP Ch 12 Pr 16*****************//
//The Fibonacci sequence is a sequence of numbers in which the first two numbers are 1 and each subsequent number
//is the sum of the previous two Fibonacci numbers. The sequence is 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on. The following
//is a correct, but inefficient, method to compute the nth Fibonacci number:
//public static int fibonacci(int n) {
//if (n <= 2) {
//return 1;
//} else {
//return fib(n - 1) + fib(n - 2);
//}
//}
//The code shown runs very slowly for even relatively small values of n; it can take minutes or hours to compute even
//the 40th or 50th Fibonacci number. The code is inefficient because it makes too many recursive calls. It ends up
//recomputing each Fibonacci number many times. Write a new version of this method that is still recursive and has
//the same header but is more efficient. Do this by creating a helper method that accepts additional parameters, such as
//previous Fibonacci numbers, that you can carry through and modify during each recursive call.
//***************************************************************************//

package GoalSheet10;

import java.util.*;

public class GoalSheet10_BJP_CH12_Pr16 {

	public static List<Integer> theLookUpTable = new ArrayList<Integer>();
	
	public static void main(String args[])
	{
		long initTime = System.currentTimeMillis();
		
		//The number being compared in the looping condition is how many Fibonacci numbers the user wants to output
		for (int i = 1; i <= 40; i++)
		{
			System.out.println(fibonacci(i));
		}
		
		System.out.println("Execution time: " + (System.currentTimeMillis() - initTime) + " milliseconds");
	}
	
	public static int fibonacci(int n)
	{
		//Determine whether we are at the base case or not
		if (n <= 2)
		{
			//Base case of recursive fibonacci call is always 1
			return 1;
		}
		else
		{
			//Use the more efficient implementation that stores the previous two numbers
			return fib2(n, 3, 1, 1);
		}
	}
	
	//Method that works its way up to the nth number rather than from n downwards
	public static int fib2(int n, int i, int prev, int curr)
	{
		if (n == i)
		{
			return prev + curr;
		}
		else
		{
			return fib2(n, i + 1, curr, prev + curr);
		}
	}
	
	
}
