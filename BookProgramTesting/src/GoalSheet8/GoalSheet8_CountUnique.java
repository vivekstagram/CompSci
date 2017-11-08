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
		
		//The arguments to be passed into the function
		ArrayList<Integer> l = new ArrayList<Integer>();

		//Populate the list with integers
		l.add(5); l.add(4); l.add(4); l.add(3); l.add(-1); l.add(2); l.add(2); l.add(0); l.add(0); l.add(0); l.add(6);

		//unique should be assigned the value of 7 given the integers that are in the list
		int unique = countUnique(l);

		//Print it out to confirm
		System.out.println(unique);

	}

	public static int countUnique(ArrayList<Integer> _list) {
		
		//A set to store the unique numbers, order doesnt matter
		Set<Integer> uniqueIntegers = new HashSet<Integer>();

		//Used to go through the elements in the list
		Iterator<Integer> itr = _list.iterator();

		//GO THROUGH THE LIST
		while (itr.hasNext()) {
			//Add the next item in the list to the set, which will ignore duplicates
			uniqueIntegers.add(itr.next());
		}

		//The size of the set is the number of unique integers in the list
		return uniqueIntegers.size();
	}
}