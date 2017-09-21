import java.util.Scanner;

public class GoalSheet4_ShapeTester 
{
	public static void main(String[] args)
	{
		//Go through interface to create an instance of the circle class
		GoalSheet4_Shape _c = new GoalSheet4_Circle(5.0f);
		
		System.out.println("Area of circle: " + _c.getArea());
		System.out.println("Area of circle: " + _c.getPerimeter());
		
		
		//Go through interface to create an instance of the rectangle class
		GoalSheet4_Shape _r = new GoalSheet4_Rectangle(5.0f, 6.0f);
				
		System.out.println("Area of rectangle: " + _r.getArea());
		System.out.println("Perimeter of rectangle: " + _r.getPerimeter());
		
	}

}
