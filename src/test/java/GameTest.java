import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void player1CanWin() {
        Card card1 = new Card(Suit.CLUBS, Rank.KING);
        Card card2 = new Card(Suit.HEARTS, Rank.THREE);
        String expectedOutcome = "Player 1 has won with a " + card1.getRank().toString()  + " of " + card1.getSuit().toString() +
                ". Player 2 lost with a sad " + card2.getRank().toString() + " of " + card2.getSuit().toString();
        assertEquals(expectedOutcome, game.determineWinner(card1, card2));
    }

    @Test
    public void player2CanWin() {
        Card card1 = new Card(Suit.CLUBS, Rank.THREE);
        Card card2 = new Card(Suit.HEARTS, Rank.KING);
        String expectedOutcome = "Player 2 has won with a " + card2.getRank().toString()  + " of " + card2.getSuit().toString() +
                ". Player 1 lost with a sad " + card1.getRank().toString() + " of " + card1.getSuit().toString();
        assertEquals(expectedOutcome, game.determineWinner(card1, card2));
    }

    @Test
    public void gameCanTie() {
        Card card1 = new Card(Suit.CLUBS, Rank.THREE);
        Card card2 = new Card(Suit.HEARTS, Rank.THREE);
        assertEquals(true, game.isTie(card1, card2));
    }
}
