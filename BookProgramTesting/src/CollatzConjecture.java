
public class CollatzConjecture {

	public static void main(String args[])
	{
		int n = 6;
		
		Integer counter = 0;
		
		
		System.out.println(collatz(n, counter) + " " + counter);
		
	}
	
	public static int collatz(int n, Integer i)
	{
		if (n % 2 == 0)
		{
			i++;
			return collatz(n / 2, i);
		}
		else
		{
			i++;
			return collatz((3 * n) + 1, i);
		}
	}
	
}
