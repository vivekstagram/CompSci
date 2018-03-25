//*******************Vivek Patel - Mar 2018 - maxOccurrences*****************//

package GoalSheet13;

import java.util.*;

public class maxOccurrences {

	public static void main(String args[])
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < 20; i++)
		{
			l.add((int)(Math.random() * 10));
		}
		
		System.out.println(l.toString());
		System.out.println(_maxOccurrences(l));
	}
	
	public static int _maxOccurrences(ArrayList<Integer> list)
	{
		if (list.size() == 0)
			return 0;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for (Integer i : list)
			m.put(i, 0);
		
		for (Integer i : list)
			m.put(i, m.get(i) + 1);
		
		List<Integer> k = new ArrayList<Integer>(m.values());
		
		Collections.sort(k);
		
		return k.get(k.size() - 1);
	}
}