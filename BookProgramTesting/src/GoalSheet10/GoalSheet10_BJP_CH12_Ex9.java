//*******************Vivek Patel - Jan 2018 - BJP Ch 12 Ex 9*****************//
//Write a recursive method called sumTo that accepts an integer parameter n and returns a real number representing
//the sum of the first n reciprocals. In other words, sumTo(n) returns (1 + 1/2 + 1/3 + 1/4 + ... + 1/n). For example,
//sumTo(2) should return 1.5. The method should return 0.0 if it is passed the value 0 and throw an
//IllegalArgumentException if it is passed a value less than 0.
//***************************************************************************//

package GoalSheet10;

public class GoalSheet10_BJP_CH12_Ex9 {

	public static void main(String args[])
	{
		//Use a try-catch block to make sure that any exceptions are handled properly
		try
		{
			System.out.println(sumTo(3));
		}
		//Uh-oh
		catch (Exception e)
		{
			//Print out the message of the exception
			System.out.println(e);
		}
	}
	
	public static double sumTo(int n)
		throws IllegalArgumentException
	{
		if (n < 0)
			throw new IllegalArgumentException("n cannot be less than 0!");
		
		if (n == 0)
			return 0.0;
		else if (n == 1)
			return 1.0;
		else
			return ((1.0f / (double)n) + sumTo(n - 1));
	}
}
