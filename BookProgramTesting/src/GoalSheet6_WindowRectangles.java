import java.util.*;


public class GoalSheet6_WindowRectangles {

	public static void main(String[] args)
	{
		ArrayList<GoalSheet6_WindowClass> theWindows = new ArrayList<GoalSheet6_WindowClass>();
		
		Scanner console = new Scanner(System.in);
		
		int choice = 0;
		
		do
		{
			System.out.println("Choose an option:\n\t1: Open a New Window\n\t2: Click on an Existing Window\n\t0: Quit");
		
			choice = console.nextInt();
			
			if (choice == 1)
			{
				System.out.println("Enter X Position of New Window: ");
				int newX = console.nextInt();
				
				System.out.println("Enter Y Position of New Window: ");
				int newY = console.nextInt();
				
				System.out.println("Enter Width of New Window: ");
				int newWidth = console.nextInt();
				
				System.out.println("Enter Length of New Window: ");
				int newLength = console.nextInt();
				
				theWindows.add(new GoalSheet6_WindowClass(new GoalSheet6_Point(newX, newY), newLength, newWidth));//construct window object, push to list
				
				System.out.println("Done.");
			}
			else if (choice == 2)
			{
				System.out.println("Enter X Position of Click: ");
				int clickX = console.nextInt();
				
				System.out.println("Enter Y Position of Click: ");
				int clickY = console.nextInt();
				
				boolean exists = false;
				
				for (int i = theWindows.size() - 1; i >= 0; i--)//loop backwards through list
				{
					GoalSheet6_WindowClass check = theWindows.get(i);
					
					int checkX = check.getPosition().getX();
					
					int checkY = check.getPosition().getY();
					
					double checkWidth = check.getWidth();
					
					double checkLength = check.getLength();
					
					if (clickX >=  checkX && clickX <= checkX + checkWidth && clickY >= checkY && clickY <= checkY + checkLength)
					{//Check if click is within bounds
						check.moveToCursor(new GoalSheet6_Point(clickX, clickY));//Pass new corner point
						theWindows.remove(i);
						theWindows.add(check);//remove and append
						
						
						System.out.println("Success");
						exists = true;
						
						break;
					}
				}
				
				
				if (!exists)
				{
					System.out.println("There isn't a window at that position");
				}
			}
			else
			{
				System.out.println("That is invalid");
			}
		}
		while (choice != 0);
		
		
		System.out.println("Program finished");
	}
	
}
