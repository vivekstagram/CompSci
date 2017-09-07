//Vivek Patel
//Goal Sheet 1 - Twelve Days of Christmas

public class GoalSheet1_TwelveDaysOfChristmas {

	public static void main(String args[])
	{
		christmas(1);
	}
	
	
	public static void christmas(int day)
	{
		if (day > 12)
			return;
		
		System.out.print("On the " + day);
		
		switch(day)
		{
		case 1: System.out.print("st");
			break;
		case 2: System.out.print("nd");
			break;
		case 3: System.out.print("rd");
			break;
		default: System.out.print("th");
			break;
		}
		
		System.out.println(" of Christmas my true love gave to me:");
		
		if (day == 1)
		{
			System.out.println("A partridge in a pear tree");
		}
		else
		{
			switch (day)
	        {
	           case 12:
	              System.out.println ("Twelve drummers drumming,");
	           case 11:
	              System.out.println ("Eleven pipers piping,");
	           case 10:
	              System.out.println ("Ten lords a leaping,");
	           case 9:
	              System.out.println ("Nine ladies dancing,");
	           case 8:
	              System.out.println ("Eight maids a milking,");
	           case 7:
	              System.out.println ("Seven swans a swimming,");
	           case 6:
	              System.out.println ("Six geese a laying,");
	           case 5:
	              System.out.println ("Five golden rings,");
	           case 4:
	              System.out.println ("Four calling birds,");
	           case 3:
	              System.out.println ("Three French hens,");
	           case 2:
	              System.out.println ("Two turtle doves,");
	           default:
	              System.out.println ("And a partridge in a pear tree.");
	        }
		}
		

        System.out.println();
        
        christmas(day + 1);
     }
}