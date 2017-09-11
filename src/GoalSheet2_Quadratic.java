//Vivek Patel
//Find the roots of a polynomial
//Goal Sheet 2 - Polynomials

import java.util.Scanner;

public class GoalSheet2_Quadratic {

	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean isAZero = true;
		
		//The first coefficient of the equation, put in a loop since it can not be 0, or else you would have a linear equation.
		double a;
		
		do
		{
			System.out.print("Input A: ");
			a = sc.nextDouble();
			
			if (a != 0.0)
			{
				isAZero = false;
			}
		}
		while (isAZero == true);
		
		System.out.println();
		
		System.out.print("Input B: ");
		double b = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Input C: ");
		double c = sc.nextDouble();
		
		double[] roots = quadratic(a, b, c);
		
		System.out.println("The roots of the polynomial "+a+"x^2 + "+b+"x + "+c+" are "+roots[0]+" and "+roots[1]+"");
		
		sc.close();
	}
	
	public static double[] quadratic(double a, double b, double c)
	{
		double[] roots = new double[2];
		
		roots[0] = (-b + Math.sqrt( (b * b) - (4 * a * c) ) ) / (2 * a);
		
		roots[1] = (-b - Math.sqrt( (b * b) - (4 * a * c) ) ) / (2 * a);
		
		return roots;
	}
	
}
