public class Test {

	public static void main(String[] args)
	{
		Sub s3 = new Sub(5);
	}
	
	
	public static class Base
	{
		private int myVal;
		
		public Base()
		{
			myVal = 0;
		}
		
		public Base(int x)
		{
			myVal = x;
		}
	}
	
	public static class Sub extends Base
	{
		public Sub()
		{
			super(0);
		}
	}
	
	
	
}