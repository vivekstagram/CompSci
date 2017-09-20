

public class GoalSheet4_Rectangle implements GoalSheet4_Shape {

	//Instance variables
	private float _width, _length;
	
	//Constructors\
	public GoalSheet4_Rectangle(float width, float length)
	{
		_width = width;
		_length = _length;
	}
	
	public GoalSheet4_Rectangle()
	{
		//Sets everything to zero since it is the default
	}
	
	
	//Getter methods
	public float getArea()
	{
		return _length * _width;
	}
	
	public float getPerimeter()
	{
		return (float)(2.0 * (_length * _width));
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
