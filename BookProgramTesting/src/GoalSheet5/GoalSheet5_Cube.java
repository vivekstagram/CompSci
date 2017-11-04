package GoalSheet5;
//Vivek Patel
//A class defining a cube
//Goal Sheet 5 - 3D Shapes

public class GoalSheet5_Cube extends GoalSheet5_RectangularPrism {
	
	// Constructors
	public GoalSheet5_Cube() 
	{
		//Default constructor sets all of the instance variables to zero
		super();
	}

	public GoalSheet5_Cube(float s) 
	{
		//All the side lengths are the same
		super(s, s, s);
	}

	//Setter methods
	public void setSideLength(float s) 
	{
		//All side lengths are the same
		setLength(s);
		setHeight(s);
		setWidth(s);
	}
	
	public float getSideLength()
	{
		//All three lengths are the same, return any of them
		return super.getLength();
	}
}
