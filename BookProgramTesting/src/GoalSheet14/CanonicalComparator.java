/**
 * Vivek Patel
 * Apr 2018
 * CanonicalComparator.java
 * All Rights Reserved
 */

package GoalSheet14;

import java.util.Arrays;
import java.util.Comparator;

public class CanonicalComparator implements Comparator<String> {
	@Override
	public int compare(String arg0, String arg1) {
		
		char[] temp0 = arg0.toCharArray();
        Arrays.sort(temp0);
        String str0 = new String(temp0).toLowerCase();
		
        char[] temp1 = arg1.toCharArray();
        Arrays.sort(temp1);
        String str1 = new String(temp1).toLowerCase();
		
		return str0.compareToIgnoreCase(str1);
	}
}
