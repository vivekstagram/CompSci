package GoalSheet8;


import java.util.*;

public class GoalSheet8_Partition {

	public static void main(String args[])
	{
		List<Integer> theList = new ArrayList<Integer>();
		
		//E = 3
		theList.add(1); theList.add(3); theList.add(5); theList.add(6); theList.add(7); theList.add(-1); theList.add(2);
		
		List<Integer> l = partition(theList, 3);
		
		for (Integer i: l)
		{
			System.out.println(i);
		}
	}
	
	
	public static List<Integer> partition(List<Integer> l, Integer E)
	{
		Iterator<Integer> itr = l.iterator();
		
		l.sort(null);

		/*while (itr.hasNext())
		{
			//int current;// = itr.next().intValue();
			int current = itr.next();
			
			
			if (current < E)
			{
				l.set(0, current);
				//itr.remove();
			}
			
			if (current > E)
			{
				l.set(l.size() -1, current);
				//itr.remove();
			}
				
		}
		*/
		
		/*
		for (int i = 0; i < l.size(); i++)
		{
			
			if (l.get(i) < E)
			{
				l.set(0, l.get(i));
				l.remove(i);
			}
		*/
		
		
		return l;
	}
	
}
