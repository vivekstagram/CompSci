package GoalSheet11;

import java.util.Comparator;

public class Pr3_Comp_FirstName implements Comparator<Pr3_Student> {

	public int compare(Pr3_Student a, Pr3_Student b)
	{
		return a.getFirstName().compareTo(b.getFirstName());
	}
	
}
