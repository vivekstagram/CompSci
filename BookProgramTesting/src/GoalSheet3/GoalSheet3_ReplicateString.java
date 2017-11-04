package GoalSheet3;
//Vivek Patel
//Replicate a string input the by the user an amount of times specified by the user
//Goal Sheet 3 - Replicate String


import java.util.Scanner;


public class GoalSheet3_ReplicateString {

	public static void main(String args[])
	{
		//The string to be replicated
		String repTemplate;
		
		//How many times to repliclate it
		int repetitions;
		
		//Get those variables in
		Scanner sc = new Scanner(System.in);
		
		//Get the template
		System.out.println("Input the string that you want to replicate: ");
		repTemplate = sc.next();
		
		//Get the number of repetitions
		System.out.println("Input the amount of times that you want to replicate the input: ");
		repetitions = sc.nextInt();
		
		//Get the replicated string
		String _new = repl(repTemplate, repetitions);
		
		//Print it out!
		System.out.println(_new);
		
		sc.close();
	}
	
	public static String repl(String template, int rep)
	{
		String out = "";
		
		//Check if the replication number is valid, if not then return an empty string;
		if (rep <= 0)
		{
			return out;
		}
		else
		{
			//Loop through and replicate the string the specified number of times
			for (int i = 0; i < rep; i++)
			{
				out += template;
			}
			
			//Return it
			return out;
		}
		
	}
	
}
