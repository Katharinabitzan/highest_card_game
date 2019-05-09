public enum Rank {
    ACE(1, 1),
    TWO(2, 2),
    THREE(3, 3),
    FOUR(4, 4),
    FIVE(5, 5),
    SIX(6, 6),
    SEVEN(7, 7),
    EIGHT(8, 8),
    NINE(9, 9),
    TEN(10, 10),
    JACK(10, 11),
    QUEEN(10, 12),
    KING(10, 13);

    private final int realValue;
    private final int value;

    Rank(int realValue, int value) {
        this.realValue = realValue;
        this.value = value;
    }

    public int getRealValue() {
        return realValue;
    }

    public int getValue() {
        return value;
    }
}