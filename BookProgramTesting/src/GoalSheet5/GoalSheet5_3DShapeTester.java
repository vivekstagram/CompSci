package GoalSheet5;
//Vivek Patel
//A program that tests a bunch of classes representing 3D shapes
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
		
		System.out.println("\n\nSurface area of cube: " + _c.getSurfaceArea());
		System.out.println("Volume of cube: " + _c.getVolume());
		
		((GoalSheet5_Cube)_c).setSideLength(3.0f);
		
		System.out.println("Surface area of cube: " + _c.getSurfaceArea());
		System.out.println("Volume of cube: " + _c.getVolume());
		
		
		
		GoalSheet5_3DShape _s = new GoalSheet5_Sphere(4.0f);
		
		System.out.println("\n\nSurface area of sphere: " + _s.getSurfaceArea());
		System.out.println("Volume of sphere: " + _s.getVolume());
		
		((GoalSheet5_Sphere)_s).setRadius(3.0f);
		
		System.out.println("Surface area of sphere: " + _s.getSurfaceArea());
		System.out.println("Volume of sphere: " + _s.getVolume());
		
		
		
		GoalSheet5_3DShape _cyl = new GoalSheet5_Cylinder(4.0f, 2.0f);
		
		System.out.println("\n\nSurface area of cylinder: " + _cyl.getSurfaceArea());
		System.out.println("Volume of cylinder: " + _cyl.getVolume());
		
		((GoalSheet5_Cylinder)_cyl).setBaseRadius(3.0f);
		
		System.out.println("Surface area of cylinder: " + _cyl.getSurfaceArea());
		System.out.println("Volume of cylinder: " + _cyl.getVolume());
		
		
		
		GoalSheet5_3DShape _co = new GoalSheet5_CircularCone(4.0f, 2.0f);
		
		System.out.println("\n\nSurface area of circular cone: " + _co.getSurfaceArea());
		System.out.println("Volume of circular cone: " + _co.getVolume());
		
		((GoalSheet5_Cylinder)_co).setBaseRadius(3.0f);
		
		System.out.println("Surface area of circular cone: " + _co.getSurfaceArea());
		System.out.println("Volume of circular cone: " + _co.getVolume());
		
		
		
		GoalSheet5_3DShape _tp = new GoalSheet5_TriangularPrism(2.0f, 2.0f, 2.0f, 4.0f);
		
		System.out.println("\n\nSurface area of triangular prism: " + _tp.getSurfaceArea());
		System.out.println("Volume of triangular prism: " + _tp.getVolume());
		
		System.out.println("Side length b of the triangular prism: " + ((GoalSheet5_TriangularPrism)_tp).getSideLength(1));
	}
}
