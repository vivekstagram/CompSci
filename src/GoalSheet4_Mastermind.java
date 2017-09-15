//Vivek Patel
//Have a user input a 4 digit number, and compare it to a random 4 digit number as follows:
//Tell the user how many digits are in the correct place, and how many are correct but in the wrong place.
//Goal Sheet 4 - Mastermind

import java.math.*;
import java.util.*;

public class GoalSheet4_Mastermind {

	//The number to be generated
	private static ArrayList<Integer> theNumber = new ArrayList<Integer>(4);
	
	static
	{
		Random rand = new Random(System.nanoTime());
		
		//Make the number
		for (int i = 0; i < 4; i++)
		{
			theNumber.add(i, rand.nextInt(10));
		}
	}
	
	//The guess that the user inputs
	private static String guess;
	
	//The number of digits in the guess that are in the correct place
	private static int correctPlace;
	
	//The number of digits in the guess that are also present in the number
	private static int correctNumbers;
	
	
	public static void main(String[] args)
	{	
		int test = 0;
		
		for (int k = 0; k < theNumber.toArray().length; k++)
		{
			test += (int)(theNumber.get(k).intValue() * Math.pow(10.0, k));
		}
		
		System.out.println("Here is the number: " + test);
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Welcome to Mastermind! The number has been generated... Please enter your guess!");
		
		
		
		console.close();
	}
	
	
	
	
}
