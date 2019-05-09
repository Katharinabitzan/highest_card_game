import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card1;

    @Before
    public void before() {
        card1 = new Card(Suit.HEARTS, Rank.THREE);
    }

    @Test
    public void hazSuit() {
        assertEquals(Suit.HEARTS, card1.getSuit());
    }

    @Test
    public void hazRank() {
        assertEquals(Rank.THREE, card1.getRank());
    }


}
