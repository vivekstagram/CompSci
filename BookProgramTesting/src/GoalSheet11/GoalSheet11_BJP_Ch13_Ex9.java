//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Ex 9*****************//


package GoalSheet11;

import java.util.ArrayList;
import java.util.List;

public class GoalSheet11_BJP_Ch13_Ex9
{
	public static void main(String args[])
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++)
		{
			l.add((int)(Math.random() * 100));
		}
		
		l = dualSelectionSort(l);
		
		System.out.println(l);
	}
	
	public static ArrayList<Integer> dualSelectionSort(ArrayList<Integer> l)
	{
		int largest, smallest;
		
		for (int i = 0; i < l.size() - 1; i++)
		{
			
			if (i >= l.size() - i - 1)
				break;
			
			largest = l.size() - i - 1;
			smallest = i;
			
			for (int j = i; j < l.size() -i; j++)
			{
				if (l.get(j) < l.get(smallest))
				{
					smallest = j;
				}
				
				if (l.get(j) > l.get(largest))
				{
					largest = j;
				}
			}
			
			swapElements(l, i, smallest);
			
			if (i == largest) 
			{
				largest = smallest;
			}
			
		    swapElements(l, (l.size() - i - 1), largest);
		}
		
		
		return l;
	}
	
	public static void swapElements(List<Integer> l, int i, int j)
	{
		int temp = l.get(i);
		l.set(i, l.get(j));
		l.set(j, temp);
	}
}