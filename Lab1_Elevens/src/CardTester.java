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
		
		Card c1 = new Card("ace", "hearts", 1);
		Card c2 = new Card("ace", "hearts", 1);
		Card c3 = new Card("ace", "hearts", 2);
		Card c4 = new Card("ace", "spades", 1);
		Card c5 = new Card("king", "hearts", 1);
		Card c6 = new Card("queen", "clubs", 3);
		
		
		assert c1.rank().equals("ace") : "Wrong rank: " + c1.rank();
		assert c1.suit().equals("hearts") : "Wrong suit: " + c1.suit();
		assert c1.pointValue() == 1 : "Wrong point value: "
		 + c1.pointValue();
		assert c6.rank().equals("queen") : "Wrong rank: " + c6.rank();
		assert c6.suit().equals("clubs") : "Wrong suit: " + c6.suit();
		assert c6.pointValue() == 3: "Wrong point value : "
		 + c6.pointValue();
		
		assert c1.toString().equals("ace of hearts (point value = 1)")
		 : "Wrong toString: " + c1;
		assert c6.toString().equals("queen of clubs (point value = 3)")
		 : "Wrong toString: " + c6;
		
		
		System.out.println("All tests passed!");
	}
}
