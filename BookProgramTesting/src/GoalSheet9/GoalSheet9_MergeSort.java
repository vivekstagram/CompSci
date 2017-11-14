package GoalSheet9;
/*
 * Name: Vivek Patel
 * Date: 11/12/2017
 * Purpose: Write a program that reads a series of input lines and sorts them into alphabetical order,
			ignoring the case of words. The program should use the merge sort algorithm so that it
			efficiently sorts even a large file. (BJP Ch 13 Proj 1)
 */

import java.util.*;
import java.io.*;

public class GoalSheet9_MergeSort {

	public static void main(String args[])
	{
		List<String> theList = new ArrayList<String>();
		List<String> cont = new ArrayList<String>();
		
		theList.add("Connor");
		theList.add("Amy");
		theList.add("Vivek");
		theList.add("Jackson");
		theList.add("Callum");
		
		
		theList = mergeSort(theList);
		
		System.out.println("Sorted: " + theList.toString());
		
	}
	
	public static List<String> mergeSort(List<String> theStrings)
	{
		System.out.println("In mergeSort we are sorting " + theStrings.toString());
		
		if (theStrings.size() > 1)
		{
			//Split into two 'halves'
			List<String> left = theStrings.subList(0, theStrings.size() / 2);
			List<String> right = theStrings.subList(theStrings.size() / 2, theStrings.size());
		
			//Recursively sort the two halves
			mergeSort(left);
			mergeSort(right);
			
			//Merge the sorted halves
			merge(theStrings, left, right);
		}
		
		return theStrings;
	}
	
	public static void merge(List<String> container, List<String> left, List<String> right)
	{
		System.out.println("In merge we are merging " + left.toString() + " and " + right.toString());
		
		
		int indexLeft = 0, indexRight = 0;
		
		for (int i = 0; i < container.toArray().length; i++)
		{
			if ( indexRight >= right.toArray().length || ( indexLeft < left.toArray().length && left.get(indexLeft).compareTo(right.get(indexRight)) < 0 ) )
			{	
				container.toArray()[i] = left.get(indexLeft);
				indexLeft++;
			}
			else
			{
				container.toArray()[i] = right.get(indexRight);
				indexRight++;
			}
		}
	}
}
