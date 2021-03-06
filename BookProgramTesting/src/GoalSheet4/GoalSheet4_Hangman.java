package GoalSheet4;
//Vivek Patel
//Issa hangman program
//Goal Sheet 4 - Hangman

import java.util.ArrayList;
import java.util.Scanner;

public class GoalSheet4_Hangman {

	
	private static String[] _wordBank = {"java", "lose", "advanced", "placement", "computer", "science" };
	
	
	private static String _word = _wordBank[(int) (Math.random() * _wordBank.length)];
	
	
	private static String asterisk = new String(new char[_word.length()]).replace("\0", "*");
	
	
	private static int count = 0;

	
	private static ArrayList<Character> guesses = new ArrayList<Character>();
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (count < 7 && asterisk.contains("*")) 
		{
			System.out.print("Guesses so far: [");
			for (int i = 0; i < guesses.size(); i++)
			{
				System.out.print(guesses.get(i) + ", ");
			}
			System.out.println("]");
			
			
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			
			String guess = sc.next();
			
			if (guesses.contains(guess.toCharArray()[0]))
			{
				System.out.println("Your guess was invalid. TRY AGAIN LOL!!!!");
				continue;
			}
			
			guesses.add(new Character(guess.toCharArray()[0]));
			
			hang(guess);
			
			System.out.println();
		}
		
		sc.close();
	}

	public static void hang(String guess) 
	{
		String newasterisk = "";
		
		for (int i = 0; i < _word.length(); i++) 
		{
			if (_word.charAt(i) == guess.charAt(0))
			{
				newasterisk += guess.charAt(0);
				
			}
			else if (asterisk.charAt(i) != '*') 
			{
				newasterisk += _word.charAt(i);
			} 
			else 
			{
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) 
		{
			count++;
			hangmanImage();
		} 
		else 
		{
			asterisk = newasterisk;
		}
		
		if (asterisk.equals(_word)) 
		{
			System.out.println("WOOOOOOOOOOOOO YOU IS A WINNER!!!!!!! THE WORD WAS " + _word.toUpperCase());
		}
	}

	//a LOT of ASCII art
	public static void hangmanImage()
	{
		System.out.println("\n\n\n\n\n\n\n\n");
		
		if (count == 1) 
		{
			System.out.println("WRONG. TRY AGAIN!");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		
		if (count == 2) 
		{
			System.out.println("WRONG. TRY AGAIN!");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		
		if (count == 3) 
		{
			System.out.println("WRONG. TRY AGAIN!");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		
		if (count == 4) 
		{
			System.out.println("WRONG. TRY AGAIN!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		
		if (count == 5) 
		{
			System.out.println("WRONG. TRY AGAIN!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		
		if (count == 6) 
		{
			System.out.println("WRONG. TRY AGAIN!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		
		if (count == 7) 
		{
			System.out.println("GAME OVER! YOU ARE AWFUL AT HANGMAN! NEVER PLAY AGAIN!!!!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("ARE YOU SERIOUS?!?!?!?!?! THE WORD WAS " + _word.toUpperCase());
		}
	}
}