//Vivek Patel
//A class defining a Circle
//Goal Sheet 5 - 3D Shapes
      

public class GoalSheet5_3DShapeTester {

	public static void main(String[] args)
	{
		GoalSheet5_3DShape _rp = new GoalSheet5_RectangularPrism(2.0f, 3.0f, 4.0f);
		
		System.out.println("Surface area of rectangular prism: " + _rp.getSurfaceArea());
		System.out.println("Volume of rectangular prism: " + _rp.getVolume());
		
		((GoalSheet5_RectangularPrism) _rp).setLength(6.0f);
		((GoalSheet5_RectangularPrism) _rp).setWidth(5.0f);
		((GoalSheet5_RectangularPrism) _rp).setHeight(4.0f);
		
		System.out.println("Surface area of rectangular prism: " + _rp.getSurfaceArea());
		System.out.println("Volume of rectangular prism: " + _rp.getVolume());
		
		
		
		
		GoalSheet5_3DShape _c = new GoalSheet5_Cube(4.0f);
		
		System.out.println("Surface area of cube: " + _c.getSurfaceArea());
		System.out.println("Volume of cube: " + _c.getVolume());
		
		((GoalSheet5_Cube)_c).setSideLength(3.0f);
		
		System.out.println("Surface area of cube: " + _c.getSurfaceArea());
		System.out.println("Volume of cube: " + _c.getVolume());
		
		
		
		
		GoalSheet5_3DShape _s = new GoalSheet5_Sphere(4.0f);
		
		System.out.println("Surface area of sphere: " + _s.getSurfaceArea());
		System.out.println("Volume of sphere: " + _s.getVolume());
		
		((GoalSheet5_Sphere)_s).setRadius(3.0f);
		
		System.out.println("Surface area of sphere: " + _s.getSurfaceArea());
		System.out.println("Volume of sphere: " + _s.getVolume());
	}
}
