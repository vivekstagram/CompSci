package GoalSheet8;
/*
 * Name: Vivek Patel
 * Date: 11/8/2017
 * Purpose: Write a method called partition that accepts a list of integers and an integer value E as
			its parameters, and rearranges (partitions) the list so that all elements with values less
			than E occur before all elements with values greater than E. The exact order of the
			elements is unimportant, so long as all elements less than E appear before all elements
			greater than E.
 */

import java.util.*;

public class GoalSheet8_Partition {

	public static void main(String args[])
	{
		List<Integer> theList = new ArrayList<Integer>();
		
		//E = 3
		theList.add(1); theList.add(3); theList.add(5); theList.add(6); theList.add(7); theList.add(0); theList.add(2);
		
		//Partition the list
		List<Integer> l = partition(theList, 3);
		
		for (Integer i: l)
		{
			System.out.println(i);
		}
	}
	
	
	public static List<Integer> partition(List<Integer> l, int E)
	{
		//The iterator of the parameter
		Iterator<Integer> itr = l.iterator();
		
		//The partitioned list
		List<Integer> partitioned = new ArrayList<Integer>();

		while (itr.hasNext())
		{
			int current = itr.next().intValue();
			
			if (current < E)
			{
				//Add to the beginning of the list
				partitioned.add(0, current);
			}
			else
			{
				partitioned.add(current);
			}
			
			//if (current > E)
			//{
			//	//Add to the end
			//	partitioned.add(current);
			//}
			    
			//if (current == E)
			//{
			//	partitioned.add(current);
			//}
		}
		
		
		return partitioned;
	}
	
}
