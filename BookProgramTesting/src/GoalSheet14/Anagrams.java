/**
 * Vivek Patel
 * Apr 2018
 * Anagrams.java
 * All Rights Reserved
 * ----------------------------- 
 * Find all anagrams of a word from a text file
 */ 
package GoalSheet14;

import java.util.*;
import java.io.*;
import GoalSheet14.CanonicalComparator;

public class Anagrams {

	public static void main(String[] args)
		throws FileNotFoundException
	{
		Scanner s = new Scanner(new File("src/GoalSheet11/wordsSorted.txt"));

        ArrayList<String> words = new ArrayList<String>();
        while (s.hasNext()) {
            words.add(s.next());
        }
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : words) {
            char[] temp = str.toLowerCase().toCharArray();
            Arrays.sort(temp);
            String key = new String(temp).toLowerCase();
            if (map.get(key) != null) {
                map.get(key).add(str.toLowerCase());
            } else {
                ArrayList<String> anagramList = new ArrayList<String>();
                anagramList.add(str);
                map.put(key, anagramList);
            }
        }
        
        // Open a scanner to get the user's input
        Scanner input = new Scanner(System.in);
        
        // Get the canonical
        String str = input.next();
        char[] key = str.toCharArray();
        Arrays.sort(key);
        
        // Check if canonical exists within the map
        str = new String(key).toLowerCase();
        if (!map.containsKey(str)) {
        	
            System.out.print("word not found");
        } else if (map.get(str).size() != 1) {
            for (String p : map.get(str)) {
                System.out.print(p + " ");
            }
        } else {
            System.out.print("No anagrams found");
        }
        
        // Avoid memory leaks
        s.close();
        input.close();
	}
}
