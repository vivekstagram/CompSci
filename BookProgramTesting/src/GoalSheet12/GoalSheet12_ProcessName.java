//*******************Vivek Patel - Mar 2018 - processName*****************//

package GoalSheet12;

import java.util.*;

public class GoalSheet12_ProcessName {

	public static void main(String[] args)
	{
		System.out.println(processName(new Scanner(System.in)));
	}
	
	public static String processName(Scanner console)
	{
		System.out.println("Enter your name m8: ");
		
		String nameRaw = console.nextLine(), nameReversed = "";
		
		List<String> elementHolder = new ArrayList<String>();
		
		Scanner s = new Scanner(nameRaw);
		
		while (s.hasNext())
			elementHolder.add(s.next());
		
		for (int i = elementHolder.size() - 1; i > -1; i--)
			nameReversed += (i != 0) ? (elementHolder.get(i) + " ") : elementHolder.get(i);
		
		return nameReversed;
	}
	
}