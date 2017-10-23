/*
 * Name: Vivek Patel
 * Date: 10/18/2017
 * Purpose: Write a method called sortAndRemoveDuplicates that accepts a list of integers as its
			parameter and rearranges the list�s elements into sorted ascending order, as well as
			removing all duplicate values from the list. For example, the list {7, 4, -9, 4, 15, 8, 27,
			7, 11, -5, 32, -9, -9} would become {-9, -5, 4, 7, 8, 11, 15, 27, 32} after a call to your
			method. Use a Set as part of your solution.
 */

import java.util.*;

public class GoalSheet7_SortAndRemoveDuplicates 
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		int[] unsortedA = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
		
		for (int i : unsortedA)//Add values to list from array
		{
			list.add(i);
		}
		
		
		list = sortAndRemoveDuplicates(list);
		
		System.out.println("Main List: "); //print out values
		
		for (Integer i : list)
		{
			System.out.print(i + ", ");
		}
	}
	
	
	public static List<Integer> sortAndRemoveDuplicates(List<Integer> l)
	{
		SortedSet<Integer> sortedWithoutDuplicates = new TreeSet<Integer>();
		
		Iterator<Integer> i = l.iterator();
		
		while (i.hasNext())
		{
			//Iterate through list, add to sorted set
			sortedWithoutDuplicates.add(i.next());
		}
		
		return Arrays.asList(sortedWithoutDuplicates.toArray(new Integer[0]));
	}
	
}
