//Vivek Patel
//A class defining a Circle
//Goal Sheet 4 - Circle and Rectangle

import java.math.*;


public class GoalSheet4_Circle implements GoalSheet4_Shape{

	//instance variables
	float _radius;
	
	//Constructors
	public GoalSheet4_Circle()
	{
		//Default constructor sets all of the instance variables to zero
	}
	
	public GoalSheet4_Circle(float radius)
	{
		//Set the instance variable of this Circle
		_radius = radius;
	}
	
	//Getter methods;
	public float getArea() {
		
		//Pi * r^2
		return (float)(Math.PI * (_radius * _radius));
	}

	public float getPerimeter() {
		//2 * Pi* r
		return (float)(2.0 * Math.PI * _radius);
	}
}
