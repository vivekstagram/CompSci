//Vivek Patel
//A class defining a cylinder
//Goal Sheet 5 - 3D Shapes

//INTERFACES WOOOOOOOO
public class GoalSheet5_Cylinder implements GoalSheet5_3DShape {

	//Instance variables
	private float _baseRadius, _height;
	
	//Constructors
	public GoalSheet5_Cylinder()
	{
		//Sets all the instance variables to zero
	}
	
	public GoalSheet5_Cylinder(float baseRadius, float height)
	{
		//Set the instance variables
		_baseRadius = baseRadius;
		_height = height;
	}
	
	//Getter methods
	@Override
	//Get the surface area
	public float getSurfaceArea()
	{
		//2 circles as the caps of the cyclinder, and treat the rest as a rectangle that is the circumference multiplied by the height
		return (float)((2 * 2 * Math.PI * _baseRadius) + (2 * Math.PI * _baseRadius * _height));
	}

	@Override
	//Get the volume
	public float getVolume()
	{
		//Pi are squared times height
		return (float)(Math.PI  * _baseRadius * _baseRadius * _height);
	}

	//Return the base radius
	public float getBaseRadius()
	{
		return _baseRadius;
	}
	
	//Return the height of this cylinder
	public float getHeight()
	{
		return _height;
	}
	
	//Setter methods
	//Set the height
	public void setHeight(float height)
	{
		_height = height;
	}
	
	//Set the radius of the base of the cylinder
	public void setBaseRadius(float baseRadius)
	{
		_baseRadius = baseRadius;
	}
}