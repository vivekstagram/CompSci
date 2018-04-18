package GoalSheet14;

import java.io.*;
import java.util.*;

public class EditDistance {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("Words must be same length");
		System.out.print("First word: \n>");
		String word1 = console.next();
		System.out.print("\nSecond word: \n>");
		String word2 = console.next();
		console.close();
		
		if(word1.length() == word2.length()) {
			System.out.printf("\nLoading...\n");
			
			long init = System.currentTimeMillis();
			
			Map<String, Set<String>> map = getWordsInMap("src/GoalSheet11/wordsSorted.txt", word1.length());
			
			System.out.println("Map loaded in " + (System.currentTimeMillis() - init) + " ms");
			System.out.println("Edit distance: " + findEditDistance(word1, word2, map));
		}
		else {
			System.out.println("Error: Words aren't same length.");
		}
	}

	public static Map<String, Set<String>> getWordsInMap(String file, int len) throws FileNotFoundException {
		HashMap<String, Set<String>> m = new HashMap<String, Set<String>>();
		Scanner _file = new Scanner(new File(file));
		Set<String> words = new HashSet<String>();
		while (_file.hasNextLine())
		{
			String s = _file.nextLine().toLowerCase();
			if (s.length() == len)
				words.add(s);
		}
		for (String s : words) {
			Set<String> toAdd = new HashSet<String>();
			
			for (int i = 0; i < s.length(); i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					String holder = "";
					
					for (int g = 0; g < s.length(); g++) 
					{
						if (g != i)
							holder += s.charAt(g);
						else
							holder += c;
					}
					
					if (words.contains(holder))
						toAdd.add(holder);		
				}
			}
			m.put(s, toAdd);
		}
		
		
		_file.close();
		return m;
	}
	
	public static int findEditDistance(String word, String target, Map<String, Set<String>> map) {
		LinkedList<String> thisList = new LinkedList<String>();
		thisList.add(word);
		for(int i = 0; i <= 100; i++) {
			for(String s : thisList) {
				if(s.equals(target)) {
					return i;
				}
			}
			LinkedList<String> newList = new LinkedList<String>();
			for(String s : thisList) {
				newList.addAll(map.get(s));
			}
			thisList.clear();
			thisList.addAll(newList);
			
		}
		return -1;
		
	}
}