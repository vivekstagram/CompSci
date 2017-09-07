import java.util.Scanner;


public class GoalSheet3_PrintRange {
	
	public static void main(String args[])
	{
		int start, end;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		start = sc.nextInt();
		
		System.out.println("Enter the ending number: ");
		end = sc.nextInt();
		
		printRange(start, end);
		
		sc.close();
	}
	
	public static void printRange(int a, int b)
	{
		if (a == b)
		{
			System.out.println("[ " + a + " ]");
		}
		
		if (a < b)
		{
			System.out.print("[ ");
			
			for (int i = a; i <= b; i++)
			{
				System.out.print(i + " ");
			}
			
			System.out.print("]");
		}
		
		if (a > b)
		{
			System.out.print("[ ");
			
			for (int i = a; i >= b; i--)
			{
				System.out.print(i + " ");
			}
			
			System.out.print("]");
		}
		
	}
	
}
