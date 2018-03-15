//*******************Vivek Patel - Mar 2018 - printReverse*****************//

package GoalSheet12;

public class GoalSheet12_StringReverse {

	public static void main(String args[])
	{
		printReverse("evenlength");
	}
	
	public static void printReverse(String s)
	{
		char holder[] = s.toCharArray();
		
		for (int i = 0; i < holder.length / 2; i++)
		{
			char temp = holder[i];
			
			holder[i] = holder[holder.length -i -1];
			
			holder[holder.length -i -1] = temp;
		}
		
		System.out.print(new String(holder));
	}
}
