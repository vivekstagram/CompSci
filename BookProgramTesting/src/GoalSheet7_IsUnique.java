/*
 * Name: Vivek Patel
 * Date: 11/3/2017
 * Purpose: Write a method isUnique that accepts a map whose keys and values are strings as a
			parameter and returns true if no two keys map to the same value (and false if any two or
			more keys do map to the same value).
 */

import java.util.*;

public class GoalSheet7_IsUnique {

	public static void main(String args[])
	{
		//Using a HashMap as order doesn't matter that much
		HashMap<String, String> theMap = new HashMap<String, String>();
		
		//Add some keys and values
		theMap.put("Washington", "Olympia");
		theMap.put("AP Lang", "F");
		theMap.put("High School", "No Sleep");
		theMap.put("Finals Week", "No Sleep");
		
		//Should return false
		System.out.println(isUnique(theMap));
	}
	
	//Is the set unique?
	public static boolean isUnique(HashMap<String, String> toBeJudged)
	{
		//CAN'T CONTAIN DUPLICATES
		Set<String> checker = new HashSet<String>();
		
		for (String str : toBeJudged.values())
		{
			//WON'T ADD DUPLICATES
			checker.add(str);
		}
		
		//If they are the same size then the array is unique. If the keySet.size is larger, then the condition will be false
		return checker.size() == toBeJudged.size();
	}
	
}
