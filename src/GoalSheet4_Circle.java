import java.math.*;


public class GoalSheet4_Circle implements GoalSheet4_Shape{

	//instance variables
	float _radius;
	float _area;
	float _circumference;
	
	//Constructors
	public GoalSheet4_Circle()
	{
		//Default constructor sets all of the instance variables to zero
	}
	
	public GoalSheet4_Circle(float radius)
	{
		_radius = radius;
	}
	
	//Getter methods;
	public float getArea() {
		return (float)(Math.PI * (_radius * _radius));
	}

	public float getPerimeter() {
		return (float)(2.0 * Math.PI * _radius);
	}
}
