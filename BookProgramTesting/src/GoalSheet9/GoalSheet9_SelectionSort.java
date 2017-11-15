package GoalSheet9;
/*
 * Name: Vivek Patel
 * Date: 11/14/2017
 * Purpose: Write a modified version of the selection sort algorithm that selects the largest element
			each time and moves it to the end of the array, rather than selecting the smallest element
			and moving it to the beginning. Will this algorithm be faster than the standard selection
			sort? What will its complexity class (big-O) be? (BJP Ch 13 Ex 8)
 */


import java.util.*;

public class GoalSheet9_SelectionSort {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0; i < 30; i++)//Initialize List
		{
			list.add(r.nextInt(100));
		}
		 
		selectionSort(list);
		 
	}
	
	
	public static void selectionSort(List<Integer> toCompare)
	{
		for (int i = toCompare.size()-1 ; i > 0; i--)
		{
			//The index of the largest element thus far
			int largest = i;
			
			for (int j = i - 1; j >= 0; j--)
			{
				if (toCompare.get(j) > toCompare.get(largest))
				{
					largest = j;
				}
			}
			
			swapElements(toCompare, i, largest);
			
		}
		
		System.out.println(toCompare.toString());
		
	}
	
	public static void swapElements(List<Integer> l, int i, int j)
	{
		int temp = l.get(i);
		l.set(i, l.get(j));
		l.set(j, temp);
	}
	
}
	
