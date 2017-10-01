/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card _1 = new Card("A", "King", 13);
		Card _2 = new Card("B", "Queen", 12);
		Card _3 = new Card("C", "Jack", 11);
		
		System.out.println(_1.rank() + " " + _1.suit() + " " + _1.pointValue());
		System.out.println(_2.rank() + " " + _2.suit() + " " + _2.pointValue());
		System.out.println(_3.rank() + " " + _3.suit() + " " + _3.pointValue());
		
	}
}
