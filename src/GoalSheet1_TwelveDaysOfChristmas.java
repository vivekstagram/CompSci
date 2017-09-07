

/*On the first day of Christmas
my true love sent to me:
A Partridge in a Pear Tree

On the second day of Christmas
my true love sent to me:
2 Turtle Doves
and a Partridge in a Pear Tree

On the third day of Christmas
my true love sent to me:
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the fourth day of Christmas
my true love sent to me:
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the fifth day of Christmas
my true love sent to me:
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the sixth day of Christmas
my true love sent to me:
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the seventh day of Christmas
my true love sent to me:
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the eighth day of Christmas
my true love sent to me:
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the ninth day of Christmas
my true love sent to me:
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the tenth day of Christmas
my true love sent to me:
10 Lords a Leaping
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the eleventh day of Christmas
my true love sent to me:
11 Pipers Piping
10 Lords a Leaping
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the twelfth day of Christmas
my true love sent to me:
12 Drummers Drumming
11 Pipers Piping
10 Lords a Leaping
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree*/

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

        System.out.println();
        
        christmas(day + 1);
     }
}