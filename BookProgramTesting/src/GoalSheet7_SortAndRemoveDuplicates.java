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
		
		//The same values that are presented on the problem definition on Goal Sheet 7
		int[] valuesUnsorted = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
		
		for (int i : valuesUnsorted) //Add values to list from array
		{
			list.add(i);
		}
		
		//Call the method on the unsorted values
		list = sortAndRemoveDuplicates(list);
		
		System.out.println("Original Values Sorted Without Duplicates: "); //print out values
		
		for (Integer i : list)
		{
			System.out.print(i + ", ");
		}
	}
	
	
	public static List<Integer> sortAndRemoveDuplicates(List<Integer> l)
	{
		//Can't contain duplicates and is in ascending order
		SortedSet<Integer> sortedWithoutDuplicates = new TreeSet<Integer>();
		
		//An iteragtor to help us move through the list
		Iterator<Integer> i = l.iterator();
		
		while (i.hasNext())
		{
			//Iterate through list, add to sorted set. It automatically rejects duplicates
			sortedWithoutDuplicates.add(i.next());
		}
		
		//The set automatically determines if an element already exists.
		
		
		//Really weird way to return a list from a sorted set
		return Arrays.asList(sortedWithoutDuplicates.toArray(new Integer[0]));
	}
	
}
