import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getCardCount() );
    }

    @Test
    public void canPopulateDeck() {
        deck.shuffle();
        assertEquals(52, deck.getCardCount());
    }

    @Test @Ignore @Deprecated
    public void deckStartsWithAceHearts() {
        assertEquals(Rank.ACE, deck.takeFromBottom().getRank());
        assertEquals(Suit.HEARTS, deck.takeFromBottom().getSuit());
    }

    @Test @Ignore @Deprecated
    public void deckEndsWithKingOfClubs() {
        assertEquals(Rank.KING, deck.takeFromTop().getRank());
        assertEquals(Suit.CLUBS, deck.takeFromTop().getSuit());
    }

    @Test
    public void deckCanShuffle() {
        deck.shuffle();
        assertNotEquals(true, (deck.takeFromTop().getRank() == Rank.KING && deck.takeFromTop().getSuit() == Suit.CLUBS));
    }

    @Test
    public void deckCanDeal() {
        deck.shuffle();
        Card card = deck.dealCard();
        assertEquals(true ,card instanceof Card);
    }




}
