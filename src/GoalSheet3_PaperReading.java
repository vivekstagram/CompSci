import java.util.*;
import java.io.*;
import java.io.File;

public class GoalSheet3_PaperReading {

	public static void main(String args[])
		throws FileNotFoundException
		{
			Scanner sc = new Scanner(new File("src/Hamlet.txt"));
			
			int count = 0;
			
			
			
			while (sc.hasNext())
			{
				String word = sc.next();
				count++;
			}
			
			System.out.println("Word Count: " + count);
			
			sc.close();
		}
}
