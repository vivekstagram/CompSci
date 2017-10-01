//Vivek Patel
//A class describing a sphere with _radius r
//Goal Sheet 5 - 3D Shapes


public class GoalSheet5_Sphere implements GoalSheet5_3DShape {

	//Instance variables
	float _radius;
	
	//Constructors
	public GoalSheet5_Sphere()
	{
		//Default constructor sets all of the instance variables to zero
	}
	
	public GoalSheet5_Sphere(float r)
	{
		_radius = r;
	}
	
	//Setter methods
	public void setRadius(float r)
	{
		_radius = r;
	}
	
	//Getter methods
	@Override
	public float getSurfaceArea()
	{
		return (float)(4.0f * Math.PI * (_radius * _radius));
	}


	//Volume of a sphere is four thirds multiplied by pi times the radius cubed
	@Override
	public float getVolume()
	{
		return (float)((4.0f/3.0f) * Math.PI * (_radius * _radius * _radius));
	}

	//Get radius le sphere
	public float getRadius()
	{
		return _radius;
	}
	
}
