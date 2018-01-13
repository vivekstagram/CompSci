//*******************Vivek Patel - Jan 2018 - BJP Ch 12 Pr 16*****************//
//The Fibonacci sequence is a sequence of numbers in which the first two numbers are 1 and each subsequent number
//is the sum of the previous two Fibonacci numbers. The sequence is 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on. The following
//is a correct, but inefficient, method to compute the nth Fibonacci number:
//public static int fibonacci(int n) {
//if (n <= 2) {
//return 1;
//} else {
//return fib(n – 1) + fib(n - 2);
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

	public static void main(String args[])
	{
		long initTime = System.currentTimeMillis();
		
		//The number being compared in the looping condition is how many Fibonacci numbers the user wants to output
		for (int i = 1; i <= 20; i++)
		{
			System.out.println(fibonacci(i));
		}
		
		System.out.println("Execution time: " + (System.currentTimeMillis() - initTime) + " milliseconds");
	}
	
	public static int fibonacci(int n)
	{
		List<Integer> theLookUpTable = new ArrayList<Integer>();
		
		if (n < 3)
		{
			return 1;
		}
		else if (n < theLookUpTable.size() && (theLookUpTable.get(n - 1) != null && theLookUpTable.get(n - 2) != null))
		{
			return theLookUpTable.get(theLookUpTable.size() - 1) + theLookUpTable.get(theLookUpTable.size() - 2);
		}
		else
		{
			fibStore(fibonacci(n - 1), fibonacci(n - 2), theLookUpTable);
			return theLookUpTable.get(theLookUpTable.size() - 1) + theLookUpTable.get(theLookUpTable.size() - 2);

		}
	}
	
	public static void fibStore(int one, int two, List<Integer> lookUpTable)
	{
		lookUpTable.add(one);
		lookUpTable.add(two);
	}
	
	
}
