//*******************Vivek Patel - Jan 2018 - BJP Ch 12 Ex 1*****************//
//Write a recursive method called starString that accepts an integer as a parameter and prints to the console a string
//of stars (asterisks) that is 2^n (i.e., 2 to the nth power) long. For example,
//� starString(0) should print * (because 2^0 == 1)
//� starString(1) should print ** (because 2^1 == 2)
//� starString(2) should print **** (because 2^2 == 4)
//� starString(3) should print ******** (because 2^3 == 8)
//� starString(4) should print **************** (because 2^4 == 16)
//The method should throw an IllegalArgumentException if passed a value less than 0.
//***************************************************************************//

package GoalSheet10;

public class GoalSheet10_BJP_CH12_Ex1 {
	
	public static void main(String args[])
	{
		//Use a try-catch block to make sure that any exceptions are handled with ease
		try
		{
			starString(4);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void starString(int n)
		throws IllegalArgumentException
	{
		if (n < 0)
			throw new IllegalArgumentException("Cannot take a negative number as an argument!");
		
		if (n == 0)
			System.out.print("*");
		else
		{
			//Just print 2 of starString(n - 1)
			starString(n - 1);
			starString(n - 1);
	
		}
	}
}