//*******************Vivek Patel - Jan 2018 - BJP Ch 12 Ex 2*****************//
//Write a method called writeNums that takes an integer n as a parameter and prints to the console the first n integers
//starting with 1 in sequential order, separated by commas. For example, consider the following calls:
//writeNums(5);
//System.out.println(); // to complete the line of output
//writeNums(12);
//System.out.println(); // to complete the line of output
//These calls should produce the following output:
//1, 2, 3, 4, 5
//
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
//
//***************************************************************************//

package GoalSheet10;

public class GoalSheet10_BJP_CH12_Ex2 {

	public static void main(String args[]) 
	{
		//Use a try-catch block to make sure that any exceptions are handled with ease
		try
		{
			writeNums(12);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void writeNums(int n) throws IllegalArgumentException 
	{
		if (n < 1)
			throw new IllegalArgumentException("Argument cannot be less than 1");

		if (n == 1) 
		{
			System.out.print("1");
		}
		else 
		{
			//Delay printing and move on down the call stack
			writeNums(n - 1);
			System.out.print(", " + n);
		}
	}
}
