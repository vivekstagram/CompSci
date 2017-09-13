//Vivek Patel
//Goal Sheet 3 - Replicate String


import java.util.Scanner;


public class GoalSheet3_ReplicateString {

	public static void main(String args[])
	{
		String repTemplate;
		
		int repetitions;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the string that you want to replicate: ");
		repTemplate = sc.next();
		
		System.out.println("Input the amount of times that you want to replicate the input: ");
		repetitions = sc.nextInt();
		
		String _new = repl(repTemplate, repetitions);
		
		System.out.println(_new);
		
		sc.close();
	}
	
	public static String repl(String template, int rep)
	{
		String out = "";
		
		if (rep <= 0)
		{
			out = "";
			return out;
		}
		else
		{
			for (int i = 0; i < rep; i++)
			{
				out += template;
			}
			
			return out;
		}
		
	}
	
}
