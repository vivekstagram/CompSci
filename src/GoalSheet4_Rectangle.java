


public class GoalSheet4_Rectangle implements GoalSheet4_Shape {

	//Instance variables
	private float _width, _length;
	
	public GoalSheet4_Rectangle(float width, float length)
	{
		_width = width;
		_length = _length;
	}
	
	public GoalSheet4_Rectangle()
	{
	}
	
	
	public float getArea()
	{
		return _length * _width;
	}
	
	public float getPerimeter()
	{
		return (float)(2.0 * (_length * _width));
	}
}
