package GoalSheet11;

import java.util.*;
import java.io.*;

public class GoalSheet11_BJP_Ch13_Pr3 {

	public static void main(String args[])
		throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		List<Pr3_Student> studentList = new ArrayList<Pr3_Student>();
		Scanner file = null;
		try//Get in file
		{
			file = new Scanner(new File("src/GoalSheet11/students.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		while (file.hasNextLine())
		{
			String inLine = file.nextLine();//Get in one student
			Scanner lineScanner = new Scanner(inLine);//Input string into scanner
			//Break up string, use as constructor variables, add to list
			studentList.add(new Pr3_Student(lineScanner.next(), lineScanner.next(), lineScanner.next(), lineScanner.nextDouble(), lineScanner.next()));
			lineScanner.close();
		}
		
		file.close();
		
		while (true)
		{
			System.out.println("View List By:\n\tFirst Name:\n\t\t1: Ascending\n\t\t2: Descending\n\tLast Name:\n\t\t3: Ascending\n\t\t4: Descending\n\tID Number:\n\t\t5: Ascending\n\t\t6: Descending\n\tPercentage:\n\t\t7: Ascending\n\t\t8: Descending\n\tLetter Grade:\n\t\t9: Ascending\n\t\t10: Descending");
			int choice = console.nextInt();
			switch(choice)
			{
			case 1:
				Collections.sort(studentList, new Pr3_Comp_FirstName());//First Ascending
				break;
			case 2:
				Collections.sort(studentList, Collections.reverseOrder(new Pr3_Comp_FirstName()));//First Descending
				break;
			case 3:
				Collections.sort(studentList, new Pr3_Comp_LastName());//Last Ascending
				break;
			case 4:
				Collections.sort(studentList, Collections.reverseOrder(new Pr3_Comp_LastName()));//Last Descending
				break;
			case 5:
				Collections.sort(studentList, new Pr3_Comp_StudentID());//ID Ascending
				break;
			case 6:
				Collections.sort(studentList, Collections.reverseOrder(new Pr3_Comp_StudentID()));//ID Descending
				break;
			case 7:
				Collections.sort(studentList, new Pr3_Comp_Percentage());//Percentage Ascending
				break;
			case 8:
				Collections.sort(studentList, Collections.reverseOrder(new Pr3_Comp_Percentage()));//Percentage Descending
				break;
			case 9:
				Collections.sort(studentList, new Pr3_Comp_LetterGrade());//Letter Ascending
				break;
			case 10:
				Collections.sort(studentList, Collections.reverseOrder(new Pr3_Comp_LetterGrade()));//Letter Descending
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			for(Pr3_Student s : studentList)//Print out list
			{
				System.out.println(s.getFirstName() + "\t" + s.getLastName() + "\t" + s.getIDNumber() + "\t" + s.getPercentage() + "\t" + s.getLetterGrade());
			}
		}
	}
}