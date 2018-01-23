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
import java.time.*;

public class GoalSheet9_MergeSort {

	public static void main(String args[]) throws FileNotFoundException {

		long initTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(new File("src/GoalSheet9/WARANDPEACE.txt"));

		List<String> theList = new ArrayList<String>();

		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			theList.add(s);
		}

		theList = mergeSort(theList);
		
		long executionTime = System.currentTimeMillis() - initTime;
		
		System.out.println("sorted in " + executionTime + " ms");

		PrintStream p = new PrintStream(new File("src/GoalSheet9/WARANDPEACE ALPHABETIZED.txt"));

		// Print the lines
		for (String s : theList) {
			p.println(s);
		}

		// For memory leak prevention purposes
		p.close();

		sc.close();
		
		executionTime = System.currentTimeMillis() - initTime;
		
		System.out.println("sorted and written to file in " + executionTime + " ms");
	}

	public static List<String> mergeSort(List<String> theStrings) {
		if (theStrings.size() > 1) {
			// Split into two 'halves'
			List<String> left = theStrings.subList(0, (theStrings.size() / 2));
			List<String> right = theStrings.subList((theStrings.size() / 2), theStrings.size());

			// Recursively split the two halves until we are at lengths of 1
			left = mergeSort(left);
			right = mergeSort(right);

			// Merge the sorted halves
			theStrings = merge(theStrings, left, right);
		}

		return theStrings;
	}

	/*
	 * The linear portion of the program in which the sublists are spliced together with a for loop on the way back through the call stack
	 * 		where the recursive calls are resolved
	 * */
	public static List<String> merge(List<String> container, List<String> left, List<String> right) {

		List<String> emptyContainer = new ArrayList<String>(container.size());

		int indexLeft = 0, indexRight = 0;

		for (int i = 0; i < container.size(); i++) {
			if (indexRight >= right.size() || (indexLeft < left.size()
					&& left.get(indexLeft).compareToIgnoreCase(right.get(indexRight)) < 0)) {
				emptyContainer.add(left.get(indexLeft));
				indexLeft++;
			} else {
				emptyContainer.add(right.get(indexRight));
				indexRight++;
			}
		}

		return emptyContainer;
	}
}