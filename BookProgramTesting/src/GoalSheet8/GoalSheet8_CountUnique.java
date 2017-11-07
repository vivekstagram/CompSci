package GoalSheet8;
/*
 * Name: Vivek Patel
 * Date: 11/5/2017
 * Purpose: Write a method called countUnique that accepts a list of integers as a parameter and
			returns the number of unique integer values in the list. Use a set as auxiliary storage to
			help you solve this problem.
 */

import java.util.*;

public class GoalSheet8_CountUnique {

	public static void main(String args[]) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(5); l.add(4); l.add(4); l.add(3); l.add(-1); l.add(2); l.add(2); l.add(0); l.add(0); l.add(0); l.add(6);

		int unique = countUnique(l);

		System.out.println(unique);

	}

	public static int countUnique(ArrayList<Integer> _list) {
		Set<Integer> uniqueIntegers = new TreeSet<Integer>();

		Iterator<Integer> itr = _list.iterator();

		while (itr.hasNext()) {
			uniqueIntegers.add(itr.next());
		}

		return uniqueIntegers.size();
	}
}