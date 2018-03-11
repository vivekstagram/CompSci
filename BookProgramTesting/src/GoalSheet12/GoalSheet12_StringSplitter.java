package GoalSheet12;

import java.util.*;

public class GoalSheet12_StringSplitter {

	public static void main(String[] args)
	{
		stringSplitter("DakshaPatel", 4);
	}
	
	public static void stringSplitter(String s, int num)
	{
		if (num == 0) return;
		
		int len = s.length() / num;
		int rem = s.length() % num;
		
		int endIndex = len;
		
		for (int i = 0; i < num; i++)
		{
			if (rem > 0 && i == num - 1)
			{
				System.out.println(s.substring(i * len));
				break;
			}
			
			System.out.println(s.substring(i * len, endIndex));
			endIndex += len;
		}
	}
}