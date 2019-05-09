import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> shuffled;

    public Deck() {
        this.cards = new ArrayList<>();
        this.shuffled = new ArrayList<>();
        populate();
    }

    public int getCardCount() {
        return shuffled.size();
    }

    public void populate() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                addCard(suit, rank);
            }
        }
    }

    private void addCard(Suit suit, Rank rank) {
        this.cards.add(new Card(suit, rank));
    }

    public Card takeFromTop(){
        return shuffled.get(cards.size() - 1);
    }

    public Card takeFromBottom() {
        return shuffled.get(0);
    }

    public void shuffle() {
        Card[] shuffled = toArray();
        int max = shuffled.length;
        int maxShuffles = 500;
        for(int x = 0; x < maxShuffles; x++) {
            int index1 = getRandomNumber(max);
            int index2 = getRandomNumber(max);
            if (index1 == index2) continue;
            Card card1 = shuffled[index1];
            Card card2 = shuffled[index2];
            shuffled[index1] = card2;
            shuffled[index2] = card1;
        }
        this.shuffled = new ArrayList<>(Arrays.asList(shuffled));
    }

    public Card dealCard() {
        return this.shuffled.remove(shuffled.size() - 1);
    }

    private int getRandomNumber(int max){
        return (int)(Math.random() * max);
    }

    private Card[] toArray(){
        return cards.toArray(new Card[cards.size()]);
    }
}

