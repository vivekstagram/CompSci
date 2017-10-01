//Vivek Patel
//A class defining a triangular prism
//Goal Sheet 5 - 3D Shapes

public class GoalSheet5_TriangularPrism implements GoalSheet5_3DShape {

	//The lengths of the sides of the base
	private float _a, _b, _c;
	//The height of the triangular prism
	private float _height;
	
	//Constructors
	public GoalSheet5_TriangularPrism()
	{
		//Default constructor sets all instance variables to zero/null state
	}
	
	public GoalSheet5_TriangularPrism(float a, float b, float c, float height)
	{
		//Call the default constructor in case some of the parameters are not valid
		this();
		
		//Check if the base lengths are valid
		if (!(a + b > c) && !(b + c > a) && !(c + a > b))
		{
			return;
		}
		
		//Set the base lengths if they can form a triangle
		_a = a;
		_b = b;
		_c =c;
		
		//Set the height too
		_height = height;
	}
	
	
	//Getter methods
	@Override
	public float getSurfaceArea() 
	{
		//Determine area of triangle base using Heron's formula
		float s = (_a + _b + _c) / 2.0f;
		float totalBaseArea = (float)(2.0 * Math.sqrt(s * (s - _a) * (s - _b) * (s - _c)));
		
		///Height multiplied by the sum of all the side lengths of the bases
		float lateralSurfaceArea = (float)(_height * (_a + _b + _c));
		
		//Total surface area of the triangluar prism
		float completeSurfaceArea = totalBaseArea + lateralSurfaceArea;
		
		return completeSurfaceArea;
	}

	@Override
	public float getVolume() 
	{
		//Determine area of triangle base using Heron's formula
		float s = (_a + _b + _c) / 2.0f;
		float totalBaseArea = (float)(2.0 * Math.sqrt(s * (s - _a) * (s - _b) * (s - _c)));
		
		//Base area times height
		float volume = _height * totalBaseArea;
		
		
		return volume;
	}

	//Returns the perimeter of the base of the triangular prism
	public float getBasePerimeter()
	{
		return (_a + _b + _c);
	}
	
	//Return a side length based upon a specified index on the interval [0, 2]. Returns zero if the argument is out of those bounds
	public float getSideLength(int side)
	{
		switch (side)
		{
		case 2: return _c;
		case 1: return _b;
		case 0: return _a;
		default: return 0f;
		}
	}
}
