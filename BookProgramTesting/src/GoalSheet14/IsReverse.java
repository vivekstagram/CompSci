package GoalSheet14;

public class IsReverse {

	public static void main(String args[])
	{
		//should print out true
		System.out.println(isReverse("stack", "KcAtS"));
	}
	
	public static boolean isReverse(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		
		//Makes comparisons a lot easier
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		//Base case, if strings are 1 character in length
		if (s1.length() == 1 && s2.length() == 1)
		{
			if (s1.equals(s2))
				return true;
		}
		else
		{
			if (s1.charAt(0) == s2.charAt(s2.length() - 1))
				return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
		}
		
		return false;
	}
}
