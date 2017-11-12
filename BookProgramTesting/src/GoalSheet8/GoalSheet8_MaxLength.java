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
		//Order doesn't matter so lets use a hashset
		Set<String> theSet = new HashSet<String>();
		
		//The first string in the set should be the longest one with a length of 7
		theSet.add("1111111"); theSet.add("11111"); theSet.add("1"); theSet.add("11"); theSet.add("1111");		
		
		//Print out the result of calling maxLength on the set 'theSet'
		System.out.println(maxLength(theSet));
		
	}
	
	public static int maxLength(Set<String> stringSet)
	{
		//The length of the longest string thus far into the set
		int highScore = 0;
		
		//Loop through the set
		for (String str: stringSet)
		{
			//If the length of the current string is longer than the current longest
			if (str.length() > highScore)
			{
				//Set the variable containing the length of the longest string to the length of the current string
				highScore = str.length();
			}
		}
		
		//Return the length of the longest string
		return highScore;
	}
	
}
