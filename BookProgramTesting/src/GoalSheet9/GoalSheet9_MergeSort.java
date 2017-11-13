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
		
		
		theList.add("Amy");
		theList.add("Connor");
		theList.add("Vivek");
		theList.add("Jackson");
		theList.add("Callum");
		
		
		cont = mergeSort(theList);
		
		System.out.println("Sorted: " + cont.toString());
		
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
		
		for (int i = 0; i < container.size(); i++)
		{
			if ( indexRight >= right.size() || ( indexLeft < left.size() && left.get(indexLeft).compareToIgnoreCase(right.get(indexRight)) <= 0 ) )
			{
				container.set(i, left.get(indexLeft));
				indexLeft++;
			}
			else
			{
				container.set(i, right.get(indexRight));
				indexRight++;
			}
		}
		
	}
}
