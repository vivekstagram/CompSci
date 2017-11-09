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
		
		m.put("Vivek", 1738); m.put("Connor", 448); m.put("Jackson", 1738); m.put("Bryce", 1738); m.put("Callum", 448); m.put("LOL", 448); m.put("AP LANG", 6);
		
		System.out.println(rarest(m));
		
	}
	
	public static int rarest(Map<String, Integer> m)
	{
		Map<Integer, Integer> leastOccurences = new HashMap<Integer, Integer>();
		
		for (String i: m.keySet())
		{
			if (leastOccurences.containsKey(m.get(i)))
			{
				leastOccurences.put(m.get(i), leastOccurences.get(m.get(i)) + 1);
			}
			else
			{
				leastOccurences.put(m.get(i), 1);
			}
		}
		
		int smallestOccurence = Integer.MAX_VALUE;
		int valueWithSmallestOccurence = Integer.MAX_VALUE;
		
		for (Integer i: leastOccurences.keySet())
		{
			if (leastOccurences.get(i) < smallestOccurence)
			{
				smallestOccurence = leastOccurences.get(i).intValue();
				valueWithSmallestOccurence = i.intValue();
			}
			
			if (leastOccurences.get(i) == smallestOccurence)
			{
				valueWithSmallestOccurence = (i.intValue() < valueWithSmallestOccurence) ? i.intValue() : valueWithSmallestOccurence;
			}
		}
		
		return valueWithSmallestOccurence;
	}
	
}
