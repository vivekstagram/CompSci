package GoalSheet11;

import java.util.Comparator;

public class Pr3_Comp_Percentage implements Comparator<Pr3_Student> {

	@Override
	public int compare(Pr3_Student o1, Pr3_Student o2) {
		return (o1.getPercentage() > o2.getPercentage()) ? 1 : 0;
	}

}
