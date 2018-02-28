//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Ex 5*****************//

package GoalSheet11;

public class Ex5_Point
{
	private int x;
	private int y;
	
	public Ex5_Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Ex5_Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public double getDist()
	{
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}
	
	public String toString()
	{
		return ("[" + x + ", " + y + "]: " + getDist());
	}
}