import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board 
{

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	
	
	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard() 
	{
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) 
	{
		if (selectedCards.size() == 2) 
		{
			return findPairSum11(selectedCards).size() > 0;
        }
        
		if (selectedCards.size() == 3) 
        {
            return findJQK(selectedCards).size() >= 3;
        }
		
        return false;
	}
	
	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false othewise.
	 */
	public boolean playIfPossible() {
		return playPairSum11IfPossible() || playJQKIfPossible();
	}
	
	/**
	 * Looks for a group of three face cards JQK.
	 * If found, replace them with the next three cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a JQK play was found (and made); false othewise.
	 */
	private boolean playJQKIfPossible() {
		if (findJQK(cardIndexes()).size() == 3)
		{
			super.replaceSelectedCards(findJQK(cardIndexes()));
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 11.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 11-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum11IfPossible() {
		if (findPairSum11(cardIndexes()).size() == 2)
		{
			super.replaceSelectedCards(findPairSum11(cardIndexes()));
			return true;
		}
		else
		{
			return false;
		}
	}


	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
        return (findPairSum11(cardIndexes()).size() >= 2) || (findJQK(cardIndexes()).size() >= 3);
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private List<Integer> findPairSum11(List<Integer> selectedCards)
	{	
		List<Integer> sum11 = new ArrayList<Integer>();
		for (int i = 0; i < selectedCards.size(); i++) 
		{
			int i1 = selectedCards.get(i).intValue();
			
			for (int j = i + 1; j < selectedCards.size(); j++) 
			{
				int j2 = selectedCards.get(j).intValue();
				
				if (cardAt(i1).pointValue() + cardAt(j2).pointValue() == 11)
				{
					sum11.add(i1);
					sum11.add(j2);
					return sum11;
				}
			}
		}
		return sum11;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private List<Integer> findJQK(List<Integer> selectedCards) 
	{
		
		boolean containsJack = false, containsQueen = false, containsKing = false;
		
		List<Integer> JQK = new ArrayList<Integer>();
		
		for (int i = 0; i < selectedCards.size(); i++)
		{	
			int j = selectedCards.get(i).intValue();
			
			if (cardAt(j).rank().equals("jack") && !containsJack) 
			{
				containsJack = true;
				JQK.add(j);
			}
			else if (cardAt(j).rank().equals("queen") && !containsQueen) 
			{
				containsQueen = true;
				JQK.add(j);
			}
			else if (cardAt(j).rank().equals("king") && !containsKing) 
			{
				containsKing = true;
				JQK.add(j);
			}
		}
		
		if (containsJack && containsQueen && containsKing)
		{
			return JQK;
		}
		else
		{
			return new ArrayList<Integer>();
		}
	}
}