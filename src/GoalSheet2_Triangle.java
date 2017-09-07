import java.util.Scanner;

public class GoalSheet2_Triangle {

	public static void main(String[] Args)
	{
		//Variables
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		
		//Better figure out what those side lengths are!
		System.out.println("Enter Side A: ");
		a = sc.nextFloat();
		
		
		System.out.println("Enter Side B: ");
		b = sc.nextFloat();
		
		
		System.out.println("Enter Side C: ");
		c = sc.nextFloat();
		
		//In Java, you need to *gasp* INSTANTIATE ARRAYS LIKE A CLASS
		double[] angles = new double[3];
		
		//Time to get them angles using a derivation of the Law of Cosines!
		angles = getAnglesFromSides(a, b, c);
		
		
		//Convert to degree measures, because who measures the angles of a triangle in radians??
		for (int i  = 0; i < angles.length; i++)
		{
			angles[i] *= (double)(180.0 / Math.PI);
		}
		
		System.out.println("Angle A: " + angles[0] + "\nAngle B: " + angles[1] + "\nAngle C: " + angles[2]);
		
		//Don't want them memory leaks lol
		sc.close();
	}
	
	public static double[] getAnglesFromSides(float a, float b, float c)
	{
		double[] angles = new double[3];
		
		//Arccosine sounds so much cooler than inverse cosine
		angles[0] = Math.acos( ( (b * b) + (c * c) - (a * a) ) / (2 * b * c) );
		
		angles[1] = Math.acos( ( (a * a) + (c * c) - (b * b) ) / (2 * a * c) );
		
		//Pi radians equals 180 degrees!!!
		angles[2] = Math.PI - angles[0] - angles[1];
		
		//That was fun
		return angles;
	}
	
}
