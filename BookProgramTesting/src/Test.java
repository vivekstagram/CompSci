
public class Test {

	public static void main(String[] args)
	{
		int [] n = {2, 10, 100, 1000, 10000}; //number of steps in each summation
		int a = 0;
		int b = 2;
		double H = 0;
		double x = 0;

		for (int j = 0; j < 4; j++)
		{
		    double dX = (double)(b - a) / (double)n[j];
		    
		    for (int i = 1; i < n[j]; i++)
		    {
		        x = a + ((double)i - 1.0) * dX;
		        H += (x - Math.pow(x, 2.0));               
		    }
		    
		    double solution = H * dX;
		    System.out.println(solution);
		}
	}
}