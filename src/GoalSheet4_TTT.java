//Vivek Patel
//Play tic-tac-toe using 2 dimensional arrays
//Goal Sheet 4 - Tic-Tac-Toe

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoalSheet4_TTT {

	private static char[][] grid = new char[3][3];

	private static int player;

	private static Scanner input = new Scanner(System.in);

	private static List<int[]> moveMemory = new ArrayList<int[]>();
	
	public static void main(String[] args)
	{
		boolean isThereWinner = false;
		
		boolean playerOneTurn = true;
		
		while(!isThereWinner)
		{
			if (playerOneTurn)
			{
				
			}
			else
			{
				
			}
			
			
			playerOneTurn = !playerOneTurn;
		}
	}
	
	private static void placeMove(int player, int[] move)
	{
		
	}
	
	
	private static void populateBoard()
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.println();
			
			for (int j = 0; j < 3; j++)
			{
				grid[i][j] = '-';
			}
		}
	}
	
	
	private static void printGameBoard()
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.println();
			
			for (int j = 0; j < 3; j++)
			{
				System.out.print(grid[i][j] + " ");
			}
		}
	}
}