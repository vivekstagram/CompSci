//Vivek Patel
//Count the words, lines, and characters (excluding whitespace) in a file
//Goal Sheet 3 - File Reading

import java.util.*;
import java.io.*;

public class GoalSheet3_PaperReading {

	public static void main(String args[])
		throws FileNotFoundException
		{
			Scanner sc = new Scanner(new File("src/Test"));
			
			int lineCount = 0;
			
			int wordCount = 0;
			
			int charCount = 0;
			
			while (sc.hasNextLine())
			{
				//Increment the line count
				lineCount++;
				
				//Capture the next line
				String line = sc.nextLine();
				
				//Create a scanner for the line
				Scanner lineScanner = new Scanner(line);
				
				//Move through the line
				while (lineScanner.hasNext())
				{
					//Store the current word in the line
					String word = lineScanner.next();
					
					//Increment the word count
					wordCount++;
					
					//Increment character count with the length of the word
					charCount += word.length();
					
				}
				
				//Close the scanner
				lineScanner.close();
				
			}
			
			
			//Report the final counts of all the variables
			System.out.println("Total words: " + wordCount + " Total lines: " + lineCount + " Total characters: " + charCount);
			
			//Close the scanner for the file
			sc.close();
		}
}
