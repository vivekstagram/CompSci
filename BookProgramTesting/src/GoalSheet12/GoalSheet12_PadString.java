//*******************Vivek Patel - Mar 2018 - padString*****************//

package GoalSheet12;

public class GoalSheet12_PadString {
	
	public static void main(String args[])
	{
		System.out.println("\"" + padString("hello", 8) + "\"");
	}
	
	public static String padString(String s, int padUpTo)
	{
		if (s.length() >= padUpTo)
		{
			return s;
		}
		
		int curLength = s.length();
		
		while (curLength < padUpTo)
		{
			s += " ";
			curLength++;
		}
		
		return s;
	}
}