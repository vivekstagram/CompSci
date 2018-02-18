//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Ex 4*****************//
//Do Stuff
//***************************************************************************//

package GoalSheet11;

import java.io.*;
import java.util.*;

public class GoalSheet11_BJP_CH13_Ex4 {

	public static void main(String args[])
		throws FileNotFoundException
	{
		Scanner sc1 = new Scanner(new File("src/GoalSheet11/words.txt"));

		List<String> theList = new ArrayList<String>();

		while (sc1.hasNextLine()) {
			String s = sc1.nextLine();
			theList.add(s);
		}
		
		theList.sort(String.CASE_INSENSITIVE_ORDER);
		
		
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.println("What's the first word?: ");
		String w1 = sc2.nextLine();
		
		
		System.out.println("What's the second word?: ");
		String w2 = sc2.nextLine();
		
		
		int ind1 = binarySearch(theList, w1);
		int ind2 = binarySearch(theList, w2);
		
		
		if (ind1 < 0)//Not found
		{
			System.out.println("First word not found");
		}
		
		if (ind2 < 0)
		{
			System.out.println("Second word not found");
		}
		
		if(ind2 >= 0 && ind1 >= 0)//Print number of words (exclusive)
		{
			System.out.println("There are " + (Math.abs(ind2 - ind1) - 1) + " words between " + w1 + " and " + w2);
		}
		
		
		sc1.close();
		sc2.close();
	}
	
	
	public static int binarySearch(List<String> dictionary, String target)
	{
		if(dictionary.size() <= 1)
		{
			if(dictionary.get(0).compareToIgnoreCase(target) == 0)
				return 0;//Word Found
			else
				throw new IllegalArgumentException("Word Not Found");
		}
		
		int compare = dictionary.get(dictionary.size() / 2).compareToIgnoreCase(target);
		
		if(compare < 0)//Target comes after partition
		{
			return (int)Math.ceil((double)dictionary.size() / 2) + binarySearch(dictionary.subList(dictionary.size() / 2 + 1, dictionary.size()), target);
			//Return number of indexes before partition, recursion with sub list
		}
		else if(compare > 0)
		{
			return binarySearch(dictionary.subList(0, dictionary.size() / 2), target);
			//recursion with sub list
		}
		else
		{
			return (int)(dictionary.size() / 2);
			//Index of target found
		}
	}
}