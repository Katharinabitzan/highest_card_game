public class Game {

    private Deck deck;
    private Card player1;
    private Card player2;

    public Game() {
        this.deck = new Deck();
        this.deck.shuffle();
        this.player1 = deck.dealCard();
        this.player2 = deck.dealCard();
        play();
    }

    public void play() {
        if(isTie(player1, player2) ) {
            System.out.println("tie mate");
            return;
        }
        System.out.println(determineWinner(player1, player2));

    }

    public boolean isTie(Card card1, Card card2){
        return card1.getRank().getValue() == card2.getRank().getValue();
    }

    public String determineWinner(Card card1, Card card2){
       if( card1.getRank().getValue() > card2.getRank().getValue())
           return "Player 1 has won with a " + card1.getRank().toString()  + " of " + card1.getSuit().toString() +
                   ". Player 2 lost with a sad " + card2.getRank().toString() + " of " + card2.getSuit().toString();

        return "Player 2 has won with a " + card2.getRank().toString() + " of " + card2.getSuit().toString() +
                ". Player 1 lost with a sad " + card1.getRank().toString() + " of " + card1.getSuit().toString();

    }

}
