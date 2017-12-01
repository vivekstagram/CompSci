package GoalSheet8;
/*
 * Name: Vivek Patel
 * Date: 11/8/2017
 * Purpose: Write a method called rarest that accepts a map whose keys are strings and whose
			values are integers as a parameter and returns the integer value that occurs the fewest
			times in the map. If there is a tie, return the smaller integer value. If the map is empty,
			throw an exception.
 */

import java.util.*;

public class GoalSheet8_Rarest {

	public static void main(String args[])
	{
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		//Put some stuff into the map
		m.put("Vivek", 1738); m.put("Connor", 448); m.put("Jackson", 1738); m.put("Bryce", 1738); m.put("Callum", 448); m.put("LOL", 448); m.put("AP LANG", 6);
		
		//Print out the result of the call, making sure to catch any rogue exceptions
		try
		{
			System.out.println(rarest(m));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static int rarest(Map<String, Integer> m)
		throws IllegalStateException
	{
		//The keys of this map are the values of the map passed into this method
		Map<Integer, Integer> leastOccurences = new HashMap<Integer, Integer>();
		
		if (m.keySet().size() == 0)
		{
			throw new IllegalStateException("Map is empty! Please call rarest with a map that contains values");
		}
		
		//Iterate through the keys
		for (String i: m.keySet())
		{	
			//If our storage array contains the 'key' specified by the value for a certain key from the map passed into the method
			if (leastOccurences.containsKey(m.get(i)))
			{
				//Increase the number of occurences of that integer value
				leastOccurences.put(m.get(i), leastOccurences.get(m.get(i)) + 1);
			}
			else
			{
				//If it's the first occurence
				leastOccurences.put(m.get(i), 1);
			}
		}
		
		//Nothing can be larger than these as far as ints are concerned
		int smallestOccurence = Integer.MAX_VALUE;
		int valueWithSmallestOccurence = Integer.MAX_VALUE;
		
		//The 'keys' of this map are the values of the map passed into the function
		for (Integer i: leastOccurences.keySet())
		{
			//Getting the value from that integer key gives its frequency in the original map
			if (leastOccurences.get(i) < smallestOccurence)
			{
				//How many times i occurs in the original map
				smallestOccurence = leastOccurences.get(i).intValue();
				
				//The number that occurs the least is now i
				valueWithSmallestOccurence = i.intValue();
			}
			
			//If we have a tie
			if (leastOccurences.get(i) == smallestOccurence)
			{
				//return the smaller one
				valueWithSmallestOccurence = (i.intValue() < valueWithSmallestOccurence) ? i.intValue() : valueWithSmallestOccurence;
			}
		}
		
		//RETURN
		return valueWithSmallestOccurence;
	}
	
}