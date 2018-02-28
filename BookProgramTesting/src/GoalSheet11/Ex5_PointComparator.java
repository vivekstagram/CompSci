//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Ex 5*****************//

package GoalSheet11;

import java.util.Comparator;

public class Ex5_PointComparator implements Comparator<Ex5_Point> {

	@Override
	public int compare(Ex5_Point arg0, Ex5_Point arg1)
	{
		return (int)(arg0.getDist() - arg1.getDist());
	}
}
