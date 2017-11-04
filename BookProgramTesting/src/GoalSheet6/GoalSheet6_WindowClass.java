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

public class GoalSheet6_WindowClass 
{
	private int l, w;

	private GoalSheet6_Point p;
	
	public GoalSheet6_WindowClass(GoalSheet6_Point _p, int _l, int _w)
	{
		p = _p;
		l = _l;
		w = _w;
	}
	
	public GoalSheet6_WindowClass()
	{
		
	}

	public void setPointX(int _x)
	{
		p.setX(_x);
	}
	
	public void setPointY(int _y)
	{
		p.setY(_y);
	}
	
	
	public GoalSheet6_Point getPoint()
	{
		return p;
	}
	
	public void setPoint(GoalSheet6_Point _p)
	{
		p = _p;
	}

	public GoalSheet6_Point getPosition() 
	{
		return p;
	}
	
	public int getWidth()
	{
		return w;
	}
	
	public int getLength()
	{
		return l;
	}
	
	public void moveToCursor(GoalSheet6_Point cursor)
	{
		p.setX(cursor.getX());
		p.setY(cursor.getY());
	}
	
}