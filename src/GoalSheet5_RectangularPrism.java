//Vivek Patel
//A class describing a rectangular prism
//Goal Sheet 5 - 3D Shapes
public class GoalSheet5_RectangularPrism implements GoalSheet5_3DShape {

	//Instance variables
	float _length, _width, _height;
	
	//Constructors
	public GoalSheet5_RectangularPrism()
	{
		//Default constructor sets all of the instance variables to zero
	}
	
	public GoalSheet5_RectangularPrism(float l, float w, float h)
	{
		_length = l;
		_width = w;
		_height  = h;
	}
	
	//Setter methods
	public void setHeight(float h)
	{
		_height = h;
	}
	
	public void setWidth(float w)
	{
		_width = w;
	}
	
	public void setLength(float l)
	{
		_length = l;
	}
	
	//Getter methods
	@Override
	public float getSurfaceArea()
	{
		return (float)((2.0 * _length * _height) + (2.0 * _width * _height) + (2.0 * _length * _width));
	}

	@Override
	public float getVolume()
	{
		return (float)(_width * _length * _height);
	}

}
