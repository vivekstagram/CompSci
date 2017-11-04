package GoalSheet2;
//Vivek Patel
//Take in lengths and determine the angles of a triangle with those side lengths
//Goal Sheet 2 - Triangles

import java.util.Scanner;

public class GoalSheet2_Triangle {

	public static void main(String[] Args)
	{
		//Variables
		float a, b, c;
		
		boolean areLengthsOk = false;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			//Better figure out what those side lengths are!
			System.out.println("Enter Side A: ");
			a = sc.nextFloat();
			
			
			System.out.println("Enter Side B: ");
			b = sc.nextFloat();
			
			
			System.out.println("Enter Side C: ");
			c = sc.nextFloat();
			
			if ((a + b >= c) && (a + c >= b) && (b + c >= a))
			{
				areLengthsOk = true;
			}
			else
			{
				System.out.println("THOSE LENGTHS CANT BE THOSE OF A TRIANGLE!!!!!!\n\n\n\n\n\n\n\n\n");
			}
		}
		while (areLengthsOk == false);
		
		//In Java, you need to *gasp* INSTANTIATE ARRAYS LIKE A CLASS
		double[] angles = new double[3];
		
		//Time to get them angles using a derivation of the Law of Cosines!
		angles = getAnglesFromSides(a, b, c);
		
		
		System.out.println("Angle A: " + angles[0] + "\nAngle B: " + angles[1] + "\nAngle C: " + angles[2]);
		
		//Don't want them memory leaks lol
		sc.close();
	}
	
	public static double[] getAnglesFromSides(float a, float b, float c)
	{
		double[] angles = new double[3];
		
		//Arccosine sounds so much cooler than inverse cosine
		angles[0] = Math.toDegrees(Math.acos( ( (b * b) + (c * c) - (a * a) ) / (2 * b * c) ));
		
		angles[1] = Math.toDegrees(Math.acos( ( (a * a) + (c * c) - (b * b) ) / (2 * a * c) ));
		
		//Pi radians equals 180 degrees!!!
		angles[2] = 180 - angles[0] - angles[1];
		
		//That was fun
		return angles;
	}
	
}
