//Vivek Patel
//Convert an integer to Roman Numerals
//Goal Sheet 3 - Roman Numerals

import java.util.Scanner;
import java.util.TreeMap;

public class GoalSheet3_RomanNumeral {

	public static TreeMap<Integer, String> romanNumberMap = new TreeMap<Integer, String>();
	
	public static void main(String[] args)
	{
		romanNumberMap.put(1000, "M");
		romanNumberMap.put(900, "CM");
		romanNumberMap.put(500, "D");
		romanNumberMap.put(400, "CD");
		romanNumberMap.put(100, "C");
	    romanNumberMap.put(90, "XC");
	    romanNumberMap.put(50, "L");
	    romanNumberMap.put(40, "XL");
	    romanNumberMap.put(10, "X");
	    romanNumberMap.put(9, "IX");
	    romanNumberMap.put(5, "V");
	    romanNumberMap.put(4, "IV");
	    romanNumberMap.put(1, "I");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What number do you want in Roman Numerals?: ");
		
		int romanNumber = sc.nextInt();
        
		String finalNum = "";
		
		finalNum = toRoman(romanNumber);
		
		System.out.println(romanNumber + " " + "in Roman Numerals is: " + finalNum.toString());
        
		sc.close();
	}
	
	
	public final static String toRoman(int number) 
	{
		if (number > 3999 || number < 0)
		{
			return "OUT OF MEMORY LOL!!!";
		}
		
		
        int l =  romanNumberMap.floorKey(number);
        
        if ( number == l ) 
        {
            return romanNumberMap.get(number);
        }
        
        return romanNumberMap.get(l) + toRoman(number-l);
    }
	
	
}
