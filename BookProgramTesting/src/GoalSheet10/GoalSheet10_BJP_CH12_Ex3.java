//*******************Vivek Patel - Jan 2018 - BJP Ch 12 Ex 3*****************//
//Write a method called writeSequence that accepts an integer n as a parameter and prints to the console a symmetric
//sequence of n numbers composed of descending integers that ends in 1, followed by a sequence of ascending
//integers that begins with 1. The following table indicates the output that should be produced for various values of n:
//Method call 		Output produced
//-----------------------------------------
//writeSequence(1); 1
//writeSequence(2); 1 1
//writeSequence(3); 2 1 2
//writeSequence(4); 2 1 1 2
//writeSequence(5); 3 2 1 2 3
//writeSequence(6); 3 2 1 1 2 3
//writeSequence(7); 4 3 2 1 2 3 4
//writeSequence(8); 4 3 2 1 1 2 3 4
//writeSequence(9); 5 4 3 2 1 2 3 4 5
//writeSequence(10); 5 4 3 2 1 1 2 3 4 5
//Notice that when n is odd the sequence has a single 1 in the middle, while for even values it has two 1s in the
//middle. Your method should throw an IllegalArgumentException if it is passed a value less than 1.
//***************************************************************************//

package GoalSheet10;

public class GoalSheet10_BJP_CH12_Ex3 {
	
	public static void main(String args[])
	{
		writeSequence(17);
	}
	
	public static void writeSequence(int n)
		throws IllegalArgumentException
	{
		if (n < 1) throw new IllegalArgumentException();
		
		if (n == 1)
		{
			System.out.print("1");
		} 
		else if (n == 2) 
		{
			System.out.print("1 1");
		} 
		else 
		{
			int m = (n + 1) / 2;
			
			System.out.print(m + " ");
			
			writeSequence(n - 2);
			
			System.out.print(" " + m);
		}
	}

}
