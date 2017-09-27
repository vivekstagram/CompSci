//Vivek Patel
//Find the roots of a polynomial
//Goal Sheet 2 - Polynomials - CORRECTION


import java.util.Scanner;

public class GoalSheet2_Quadratic {

	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean isAZero = true;
		
		//The first coefficient of the equation, put in a loop since it can not be 0, or else you would have a linear equation.
		System.out.print("Input A: ");
		double a = sc.nextDouble();
		
		
		System.out.print("Input B: ");
		double b = sc.nextDouble();
		
		
		System.out.print("Input C: ");
		double c = sc.nextDouble();
		
		double[] roots = quadratic(a, b, c);
		
		
		System.out.print("\nThe roots of the polynomial "+a+"x^2 + "+b+"x + "+c+" are ");
		
		for (int i = 0; i <= roots.length - 1; i++)
		{
			System.out.print(roots[i] + " ");
		}
		
		
		sc.close();
	}
	
	public static double[] quadratic(double a, double b, double c)
	{
		double[] roots = new double[2];
		
		if (a == 0.0)
		{
			double[] root = new double[1];
			
			root[0] = (double)(-c / b);
			return root;
		}
		
		
		roots[0] = (-b + Math.sqrt( (b * b) - (4 * a * c) ) ) / (2 * a);
		
		roots[1] = (-b - Math.sqrt( (b * b) - (4 * a * c) ) ) / (2 * a);
		
		return roots;
	}
	
}
