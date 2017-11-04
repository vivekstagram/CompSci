/*
 * Name: Vivek Patel
 * Date: 10/25/2017
 * Purpose: Write a method called removeInRange that accepts four parameters: a LinkedList, an
			element value, a starting index, and an editing index. The method's behavior is to
			remove all occurrences of the given element that appear in the list between the starting
			index (inclusive) and the ending index (exclusive). Other values and occurrences of the
			given value that appear outside the given index range are not affected.
 */

import java.util.*;

public class GoalSheet7_RemoveInRange {

	public static void main(String args[])
	{
		LinkedList<Integer> theList = new LinkedList<Integer>();
		
		//Add some numbers to the list
		theList.add(0);
		theList.add(0);
		theList.add(2);
		theList.add(0);
		theList.add(4);
		theList.add(0);
		theList.add(6);
		theList.add(0);
		theList.add(8);
		theList.add(0);
		theList.add(10);
		theList.add(0);
		theList.add(12);
		theList.add(0);
		theList.add(14);
		theList.add(0);
		theList.add(16);
		
		//Remove zeros in between indexes 5 and 13
		theList = removeInRange(theList, 0, 5, 13);
		
		//Iterator used to print out the list with the omitted values
		Iterator<Integer> itr = theList.iterator();
		
		//print out the elements in the list
		while (itr.hasNext())
		{
			System.out.print(itr.next() + ", ");
		}
		
		
	}
	
	public static LinkedList<Integer> removeInRange(LinkedList<Integer> l, int element, int lowerBound, int upperBound)
	{
		if (lowerBound < l.size() && upperBound < l.size())
		{
			//Create an iterator
			Iterator<Integer> itr = l.iterator();
			
			int i;
			
			//Loop until the iterator is at the starting index
			for (i = 0; i < lowerBound; i++)
			{
				itr.next();
			}
			
			
			while (i < upperBound)
			{
				//the current integer. Used for comparison
				int current = itr.next().intValue();
				
				//remove the current index using the iterator if it matches the element passed in by the user
				if (current == element)
					itr.remove();
				
				//increment
				i++;
			}
			
		}
		
		return l;
		
	}
}
