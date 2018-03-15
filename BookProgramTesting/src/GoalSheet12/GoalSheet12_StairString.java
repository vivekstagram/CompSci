//*******************Vivek Patel - Mar 2018 - stairString*****************//

package GoalSheet12;

public class GoalSheet12_StairString {

	
	public static void main(String args[])
	{
		stairString("abcdefghijklmnopqrstuvwxyz", 3);
	}
	
	
	public static void stairString(String s, int num)
	{
		if (num == 0)
		{
			return;
		}
		
		
		int lines = 0;
		int length = s.length() / num;
		
		int rem = s.length() % num;
		if(rem == num - 1)
		{
			length++;
		}
		
		for(int i = 0; i < s.length(); i += length)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			lines++;
			if(lines == num)
			{
				System.out.print(s.substring(i));
				break;
			}
			else
			{
				System.out.println(s.substring(i, i + length));
			}
		}
	}
}