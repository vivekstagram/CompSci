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
		super.setLength(s);
		super.setHeight(s);
		super.setWidth(s);
	}

	//Getter methods
	@Override
	public float getSurfaceArea()
	{
		return (float) ((2.0 * super.getLength() * super.getHeight()) + (2.0 * super.getWidth() * super.getHeight()) + (2.0 * super.getLength() * super.getWidth()));
	}

	@Override
	public float getVolume()
	{
		return (float) (super.getLength() * super.getHeight() * super.getWidth());
	}
	
	public float getSideLength()
	{
		//all three lengths are the same, return any of them
		return super.getLength();
	}
}
