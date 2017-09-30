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
		System.out.println("Here is the number: ");
		
		
		for (int i = 0; i < theNumber.size(); i++)
		{
			System.out.print(theNumber.get(i));
		}
		
		System.out.print("\n");
		
		
		Scanner console = new Scanner(System.in);
		
		
		int[] theGuess = new int[4];
		
		//Input. Probably could use a tokener for this thing haha.
		
		System.out.println("Welcome to Mastermind! The number has been generated... Please enter the first digit of your guess!");
		System.out.print(">");
		
		theGuess[0] = console.nextInt();
		
		
		System.out.println("Enter the second digit of your guess: ");
		System.out.print(">");
		
		theGuess[1] = console.nextInt();
		
		
		System.out.println("Enter the third digit of your guess: ");
		System.out.print(">");
		
		theGuess[2] = console.nextInt();
		
		
		System.out.println("Enter the fourth digit of your guess: ");
		System.out.print(">");
		
		theGuess[3] = console.nextInt();
		
		while (guessEvaluator(theGuess) == false)
		{
			System.out.println("Please enter the first digit of your guess: ");
			System.out.print(">");
			
			theGuess[0] = console.nextInt();
			
			
			System.out.println("Enter the second digit of your guess: ");
			System.out.print(">");
			
			theGuess[1] = console.nextInt();
			
			
			System.out.println("Enter the third digit of your guess: ");
			System.out.print(">");
			
			theGuess[2] = console.nextInt();
			
			
			System.out.println("Enter the fourth digit of your guess: ");
			System.out.print(">");
			
			theGuess[3] = console.nextInt();
		}
		
		System.out.println("You win!!!!!!!!");
		
		console.close();
	}
	
	
	public static boolean guessEvaluator(int[] guessDigits)
	{
		int digitsInRightPlace = 0, digitsRight = 0;
		
		//To make sure we don't get duplicates and all
		boolean numbersConfirmed[] = {false, false, false, false};
		boolean duplicatePreventer[] = {false, false, false, false};
		
		
		for (int i = 0; i < 4; i++) 
		{
			if (!numbersConfirmed[i] && (theNumber.get(i).intValue() == guessDigits[i])) 
			{
				//Right digit. Right place.
				digitsInRightPlace++;
				numbersConfirmed[i] = true;
				duplicatePreventer[i] = true;
			}
		}
		
		for (int j = 0; j < 4; j++)
		{
			for (int k = 0; k < 4; k++)
		    {
				//Check for correct numbers in the right place
		    		if ((!duplicatePreventer[k] && !numbersConfirmed[j]) && (guessDigits[k] == theNumber.get(j).intValue()))
		    		{
		    			digitsRight++;
		    			//Make sure we dont check this again
		    			duplicatePreventer[k] = true;
			    		break;
		    		}
		    }
		}
		
		
		//Tell the user how (in)correct they are
		System.out.println("\nDigits in the correct place: " + digitsInRightPlace + "\n" + "Digits that are right, but in the wrong place: " + digitsRight + "\n\n\n\n");
		
		return false;
	}	
}