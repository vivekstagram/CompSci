package GoalSheet14;

import java.util.*;
import java.io.*;

public class EditDistance {

	public static void main(String args[])
		throws FileNotFoundException
	{
		Map<String, ArrayList<String>> wordMap = new HashMap<String, ArrayList<String>>();
	
		Scanner sc = new Scanner(new File("src/GoalSheet11/dictionary.txt"));
		
		while (sc.hasNextLine())
		{
			wordMap.put(sc.nextLine(), new ArrayList<String>());
		}
		
		int count = 1;
		
		for (String s : wordMap.keySet())
		{
			System.out.println(count++ + ": Finding edit-distance of 1 neighbors for " + s);
			
			for (int i = 0; i < wordMap.keySet().size(); i++)
			{
				if (isEditDistanceOne(s, (String)wordMap.keySet().toArray()[i]))
				{
					wordMap.get(s).add((String)wordMap.keySet().toArray()[i]);
				}
			}
		}
		
	
	}
	
	public static boolean isEditDistanceOne(String s1, String s2) {
		// Find lengths of given strings
		int m = s1.length(), n = s2.length();

		// If difference between lengths is
		// more than 1, then strings can't
		// be at one distance
		if (Math.abs(m - n) > 1)
			return false;

		int count = 0; // Count of edits

		int i = 0, j = 0;
		while (i < m && j < n) {
			// If current characters don't match
			if (s1.charAt(i) != s2.charAt(j)) {
				if (count == 1)
					return false;

				// If length of one string is
				// more, then only possible edit
				// is to remove a character
				if (m > n)
					i++;
				else if (m < n)
					j++;
				else // Iflengths of both strings
				// is same
				{
					i++;
					j++;
				}

				// Increment count of edits
				count++;
			}

			else // If current characters match
			{
				i++;
				j++;
			}
		}

		// If last character is extra
		// in any string
		if (i < m || j < n)
			count++;

		return count == 1;
	}

	
	
}
