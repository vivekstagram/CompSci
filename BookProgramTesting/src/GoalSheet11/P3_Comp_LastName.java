package GoalSheet11;

import java.util.Comparator;

public class P3_Comp_LastName implements Comparator<Pr3_Student> {

	@Override
	public int compare(Pr3_Student a, Pr3_Student b) 
	{
		return a.getLastName().compareTo(b.getLastName());
	}

}
