package GoalSheet9;
/*
 * Name: Vivek Patel
 * Date: 11/12/2017
 * Purpose: Write a recursive method called writeSquares that accepts an integer parameter n and
			prints the first n squares separated by commas, with the odd squares in descending order
			followed by the even squares in ascending order. For example, writeSquares(8); prints
			the following output:
			49, 25, 9, 1, 4, 16, 36, 64 (BJP Ch 12 Ex 6)
 */

import java.util.*;

public class GoalSheet9_WriteSquares {

	public static void main(String args[]) {
		writeSquares(600);
	}

	public static void writeSquares(int n) {
		
		List<Integer> lol = new ArrayList<Integer>();
		
		if (n == 1)
		{
			System.out.print("1, ");
			return;
		}
		
		if (n % 2 == 0)
		{
			writeSquares(n-1);
			System.out.print(n*n + ", ");
		}
		
		if (n % 2 == 1)
		{
			System.out.print(n*n + ", ");
			writeSquares(n-1);
		}
	}
}
