//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Pr 3*****************//

package GoalSheet11;

import java.util.Comparator;

public class Pr3_Comp_StudentID implements Comparator<Pr3_Student> {

	@Override
	public int compare(Pr3_Student a, Pr3_Student b) 
	{
		return a.getIDNumber().compareToIgnoreCase(b.getIDNumber());
	}
	
}
