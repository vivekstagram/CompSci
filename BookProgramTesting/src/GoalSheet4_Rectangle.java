//Vivek Patel
//A class defining a Rectangle
//Goal Sheet 4 - Circle and Rectangle

public class GoalSheet4_Rectangle implements GoalSheet4_Shape {

	//Instance variables
	private float _width, _length;
	
	//Constructors
	public GoalSheet4_Rectangle(float width, float length)
	{
		_width = width;
		_length = length;
	}
	
	public GoalSheet4_Rectangle()
	{
		_width = 0f;
		_length = 0f;
	}
	
	
	//Getter methods
	public float getArea()
	{
		return _length * _width;
	}
	
	public float getPerimeter()
	{
		return (float)(2.0 * (_length + _width));
	}
	
	public float getLength()
	{
		return _length;
	}
	
	public float getWidth()
	{
		return _width;
	}
	
	//Setter methods
	public void setLength(float length)
	{
		_length = length;
	}
	
	public void setWidth(float width)
	{
		_width = width;
	}
}
