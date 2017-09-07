import java.util.Scanner;

/*

public class GoalSheet2_Squares {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many square numbers would you like? ");
		
		int goUpTo = sc.nextInt();
		
		System.out.println("Printing the first "+goUpTo+" square numbers...");
		
		for (int i = 1; i <= goUpTo; i++)
		{
			System.out.print(i * i + " ");
		}
		
		sc.close();
	}
}
*/


public class GoalSheet2_Squares {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many square numbers would you like? ");
		
		int goUpTo = sc.nextInt();
		
		int n = 1, r = 3;
		
		int sum;
		
		System.out.println("Printing the first "+ goUpTo +" square numbers...");
		
		for (int i = 1; i <= goUpTo; i++)
		{
			if (i == 1)
			{
				System.out.print(i + " ");
			}
			else
			{
				sum = n + r;
				System.out.print(sum + " ");
				
				n = sum;
				r += 2;
			}
		}
		
		sc.close();
	}
}