package GoalSheet6;
/*
 * Name: Vivek Patel
 * Date: 10/26/2017
 * Purpose: Write a class that models a list of possibly overlapping rectangular two-
			dimensional window regions, like the windows for the programs open on your
			computer. The order of the rectangles in the list implies the order in which
			they would display on the screen (sometimes called the â€œz-orderâ€?), from 0 on
			the bottom to size()-1 on the top. Each rectangle stores its (x,y) position,
			width, and height. Your rectangle list class should have a method that takes a
			Point as a parameter, treats it as though the user clicked that Point on the
			screen, and moves the topmost rectangle touching that Point to the front of the
			list.
 */


public class GoalSheet6_Point {

	private int x, y;
	
	public GoalSheet6_Point(int _x, int _y)
	{
		x = _x;
		y = _y;
	}
	
	public GoalSheet6_Point()
	{
		x = 0;
		y = 0;
	}
	
	public boolean equals(GoalSheet6_Point other)
	{
		return (this.x == other.x && this.y == other.y);
	}
	
	
	public void setX(int _x)
	{
		x = _x;
	}
	
	public void setY(int _y)
	{
		y = _y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
