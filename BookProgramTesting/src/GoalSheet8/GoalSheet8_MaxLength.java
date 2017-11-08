package GoalSheet8;
/*
 * Name: Vivek Patel
 * Date: 11/8/2017
 * Purpose: Write a method maxLength that accepts a set of strings as a parameter and that returns
			the length of the longest string in the list. If your method is passed an empty set, it
			should return 0.
 */

import java.util.*;

public class GoalSheet8_MaxLength {

	public static void main(String args[])
	{
		Set<String> theSet = new HashSet<String>();
		
		theSet.add("1111111"); theSet.add("11111"); theSet.add("1"); theSet.add("11"); theSet.add("1111");		
		
		System.out.println(maxLength(theSet));
		
	}
	
	public static int maxLength(Set<String> stringSet)
	{
		int highScore = 0;
		
		for (String str: stringSet)
		{
			if (str.length() > highScore)
			{
				highScore = str.length();
			}
		}
		
		return highScore;
	}
	
}
