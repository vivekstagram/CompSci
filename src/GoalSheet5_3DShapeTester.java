//Vivek Patel
//A class defining a Circle
//Goal Sheet 5 - 3D Shapes


public class GoalSheet5_3DShapeTester {

	public static void main(String[] args)
	{
		GoalSheet5_3DShape _rp = new GoalSheet5_RectangularPrism(2.0f, 3.0f, 4.0f);
		
		System.out.println("Surface area of rectangular prism: " + _rp.getSurfaceArea());
		System.out.println("Volume of rectangular prism: " + _rp.getVolume());
		
		
		GoalSheet5_3DShape _c = new GoalSheet5_Cube(4.0f);
		
		System.out.println("Surface area of cube: " + _c.getSurfaceArea());
		System.out.println("Volume of cube: " + _c.getVolume());
	}
}
