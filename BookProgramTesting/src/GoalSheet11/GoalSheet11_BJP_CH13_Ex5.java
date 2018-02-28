//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Ex 5*****************//

package GoalSheet11;

import java.util.Arrays;

public class GoalSheet11_BJP_CH13_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5_Point[] Ex5_PointArray = {//Create Ex5_Point Array
			new Ex5_Point(8, -2),
			new Ex5_Point(2, 6),
			new Ex5_Point(1, 2),
			new Ex5_Point(0, 0)
		};
		
		for (Ex5_Point p : Ex5_PointArray)//Print unsorted Array
		{
			System.out.println(p);
		}
		System.out.println();
		
		Arrays.sort(Ex5_PointArray, new Ex5_PointComparator());//Sort using comparator
		
		for (Ex5_Point p : Ex5_PointArray)//Print sorted
		{
			System.out.println(p);
		}
	}
	
}