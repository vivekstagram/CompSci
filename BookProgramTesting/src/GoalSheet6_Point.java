
public class GoalSheet6_Point {

	private int x, y;
	
	public GoalSheet6_Point(int _x, int _y)
	{
		x = _x;
		y = _y;
	}
	
	public GoalSheet6_Point()
	{
		
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
