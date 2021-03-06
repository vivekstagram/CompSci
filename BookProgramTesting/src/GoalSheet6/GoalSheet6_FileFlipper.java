package GoalSheet6;

//Vivek Patel
//Count the words, lines, and characters (excluding whitespace) in a file
//Goal Sheet 6 - FileReversing

import java.util.*;
import java.io.*;

public class GoalSheet6_FileFlipper {

	public static void main(String args[]) throws FileNotFoundException {
		// Open the file
		Scanner sc = new Scanner(new File("src/Test"));

		// A list for the lines
		List<String> fileLines = new ArrayList<String>();

		// A list for the words in A line of the file
		List<String> lineWords = new ArrayList<String>();

		// Get all of the lines
		while (sc.hasNextLine()) {
			// Capture the next line
			String line = sc.nextLine();

			fileLines.add(line);
		}

		// Reverse the lines
		for (int i = 0; i < fileLines.size() / 2; i++) {
			// The current line and the one we need to swap that is the same distance from
			// the center of the array list on the other side
			String current = fileLines.get(i);
			String toBeSwapped = fileLines.get(fileLines.size() - i - 1);

			// SWAP EM
			fileLines.set(i, toBeSwapped);
			fileLines.set(fileLines.size() - i - 1, current);
		}

		// Go through the now reversed lines
		for (int i = 0; i < fileLines.size(); i++) {
			// Used to split the line into words
			Scanner words = new Scanner(fileLines.get(i));

			// A string to store the reversed line
			String totalLine = "";

			// Reinitialize the array list to clear it for each run
			lineWords = new ArrayList<String>();

			// Get the words in the line
			while (words.hasNext()) {
				// Add them to the ArrayList
				lineWords.add(words.next());
			}

			// Flip the words in the line
			for (int j = 0; j < lineWords.size() / 2; j++) {
				// The current word and the one we need to swap that is the same distance from
				// the center of the array list on the other side
				String current = lineWords.get(j);
				String toBeSwapped = lineWords.get(lineWords.size() - j - 1);

				// SWAP EM
				lineWords.set(j, toBeSwapped);
				lineWords.set(lineWords.size() - j - 1, current);
			}

			// Put the words in the string variable
			for (int k = 0; k < lineWords.size(); k++) {
				// Separate the words by space
				totalLine += lineWords.get(k);
				totalLine += " ";
			}

			// Set the flipped line into the current index of the lines ArrayList
			fileLines.set(i, totalLine);

			// Close the scanner used to iterate through the line
			words.close();
		}

		// Out the newly flipped lines into a file
		PrintStream p = new PrintStream(new File("src/testReversed.txt"));

		// Print the lines
		for (int i = 0; i < fileLines.size(); i++) {
			p.println(fileLines.get(i));
		}

		// For memory leak prevention purposes
		p.close();

		// Close the scanner for the file
		sc.close();
	}
}