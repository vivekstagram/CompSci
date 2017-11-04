package GoalSheet7;
/*
 * Name: Vivek Patel
 * Date: 11/3/2017
 * Purpose: Write a method removeEvenLength that accepts a set of strings as a 
 * 			parameter and that removes all of the strings of even length from the set.
 */

import java.util.*;

public class GoalSheet7_RemoveEvenLength {

	public static void main (String args[])
	{
		//The collection for the raw strings
		Set<String> theStrings = new TreeSet<String>();
		
		//Some samples. The 2nd 'Even' actually has 5 characters
		theStrings.add("Four");
		theStrings.add("Is");
		theStrings.add("Very");
		theStrings.add("Even");
		theStrings.add("And");
		theStrings.add("Three");
		theStrings.add("Isn't");
		theStrings.add("Odd");
		theStrings.add("Even ");
		
		//Call the function on the set of raw unsorted strings
		theStrings = removeEvenLength(theStrings);
		
		//Used to iterate through the collection
		Iterator<String> itr = theStrings.iterator();
		
		//Print out the set now that the strings with an even length have been removed
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	
	public static Set<String> removeEvenLength(Set strs)
	{
		//Used to iterate through the set
		Iterator<String> itr = strs.iterator();
		
		while (itr.hasNext())
		{
			//Use modulus operator to check if the length is even
			if (itr.next().length() % 2 == 0)
			{
				//Remove the string if that is the case
				itr.remove();
			}
		}
		
		//Gotta satisfy the return type of the program
		return strs;
	}
	
}
