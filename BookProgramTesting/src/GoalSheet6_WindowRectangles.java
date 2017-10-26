/*
 * Name: Vivek Patel
 * Date: 10/26/2017
 * Purpose: Write a class that models a list of possibly overlapping rectangular two-
			dimensional window regions, like the windows for the programs open on your
			computer. The order of the rectangles in the list implies the order in which
			they would display on the screen (sometimes called the “z-order”), from 0 on
			the bottom to size()-1 on the top. Each rectangle stores its (x,y) position,
			width, and height. Your rectangle list class should have a method that takes a
			Point as a parameter, treats it as though the user clicked that Point on the
			screen, and moves the topmost rectangle touching that Point to the front of the
			list.
 */

import java.util.*;


public class GoalSheet6_WindowRectangles {

	public static void main(String[] args)
	{
		List<GoalSheet6_WindowClass> theWindows = new ArrayList<GoalSheet6_WindowClass>();
		
		Scanner _sc = new Scanner(System.in);
		
		//Keep track of the user's insignificant choice
		int menuChoice = 0;
		
		do
		{
			//A menu to entertain the user
			System.out.println("Whaddya want:");
			System.out.println("1: Open another window because there isn't enough already");
			System.out.println("2: Click to move a window that already exists since you settled on a point you didn't like");
			System.out.println("3: Move to quittersville");
		
			menuChoice = _sc.nextInt();
			
			if (menuChoice == 1)
			{
				//Ask for the X coordinate of the top left point of the window
				System.out.println("Enter the X coordinate of the top left of the window: ");
				int newWindowX = _sc.nextInt();
				
				//Ask for the Y coordinate of the top left point of the window
				System.out.println("Enter the Y coordinate of the top left of the window: ");
				int newWindowY = _sc.nextInt();
				
				//Ask for the width of the new window
				System.out.println("Enter the width of the new window: ");
				int newWindowWidth = _sc.nextInt();
				
				//Ask for the length of the new window
				System.out.println("Enter the length of the new window: ");
				int newWindowLength = _sc.nextInt();
				
				//Add a new window of the new specified window to the list
				theWindows.add(new GoalSheet6_WindowClass(new GoalSheet6_Point(newWindowX, newWindowY), newWindowLength, newWindowWidth)); //construct window object, push to list
				
				System.out.println("Done.");
			}
			else if (menuChoice == 2)
			{
				System.out.println("Enter X Position of Click: ");
				int clickX = _sc.nextInt();
				
				System.out.println("Enter Y Position of Click: ");
				int clickY = _sc.nextInt();
				
				boolean windowExists = false;
				
				for (int i = theWindows.size() - 1; i >= 0; i--)//loop backwards through list
				{
					//The current window we are working with here
					GoalSheet6_WindowClass current = theWindows.get(i);
					
					
					//Stuff about the rectangle of the current window we are checking
					int currentX = current.getPosition().getX();
					
					int currentY = current.getPosition().getY();
					
					double currentWidth = current.getWidth();
					
					double currentLength  = current.getLength();
					
					
					//Is the click in the area of the window?
					if (clickX >=  currentX && clickX <= currentX + currentWidth && clickY >= currentY && clickY <= currentY + currentLength)
					{
						//Move the current window to the point of the click if the click was in its area
						current.moveToCursor(new GoalSheet6_Point(clickX, clickY));
						
						
						//Get rid of the current window at its old position
						theWindows.remove(i);
						
						//Add the new and improved 2017 version to the list
						theWindows.add(current);
						
						//Let the user know that their window was moved to the point of the click
						System.out.println("Window was moved to the point of the click");
						
						//Assign the value of true to a boolean called windowExists
						windowExists = true;
						
						break;
					}
				}
				
				//If the window does not exist
				if (!windowExists)
				{
					System.out.println("THERE IS NO WINDOW THERE! WHAT ARE YOU DOING?!?!?!?!");
				}
			}
			else
			{
				//If the user doesn't know what the numbers 1, 2, and 3 are
				System.out.println("THAT IS INVALID");
			}
		}
		while (menuChoice != 3);
		
		//Avoid memory leaks
		_sc.close();
	}
	
}