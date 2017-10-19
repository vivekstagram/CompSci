

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