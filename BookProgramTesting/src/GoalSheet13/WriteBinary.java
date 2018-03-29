//*******************Vivek Patel - Mar 2018 - Goal Sheet 13 - Choice Program*****************//

package GoalSheet13;

public class WriteBinary {

	public static void main(String args[])
	{	
		System.out.println(writeBinary(65));
	}
	
	public static int writeBinary(int dec)
	{
		if (dec == 0)
			return 0;
		else
			return (dec % 2) + 10 * writeBinary(dec / 2);
	}
}