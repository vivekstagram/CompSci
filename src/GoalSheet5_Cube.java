//Vivek Patel
//A class defining a cube
//Goal Sheet 5 - 3D Shapes

public class GoalSheet5_Cube extends GoalSheet5_RectangularPrism implements GoalSheet5_3DShape {

	// Constructors
	public GoalSheet5_Cube() 
	{
		//Default constructor sets all of the instance variables to zero
		super();
	}

	public GoalSheet5_Cube(float s) 
	{
		super(s, s, s);
	}

	//Setter methods
	public void setSideLength(float s) 
	{
		super._length = s;
		super._height = s;
		super._width = s;
	}

	//Getter methods
	@Override
	public float getSurfaceArea()
	{
		return (float) ((2.0 * _length * _height) + (2.0 * _width * _height) + (2.0 * _length * _width));
	}

	@Override
	public float getVolume()
	{
		return (float) (_width * _length * _height);
	}
}
