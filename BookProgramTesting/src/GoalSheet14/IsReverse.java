package GoalSheet14;

public class IsReverse {

	public static void main(String args[])
	{
		//should print out true
		System.out.println(isReverse("Vivek", "Keviv"));
	}
	
	public static boolean isReverse(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		
		if (s1.length() == 1 && s2.length() == 1)
			if (s1.compareToIgnoreCase(s2) == 0)
				return true;
			
			
		return false;
	}
}
