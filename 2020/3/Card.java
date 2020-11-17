public class Card {

    private int value = 0;
    private String seed = "";

    public Card(int value, String seed) {
        this.value = value;
        this.seed = seed;
    }

    public int getValue() {

        return this.value;
    }

    public String getSeed() {
        return this.seed;
    }

    @Override
    public String toString() {
        return "" + this.value + " " + this.seed;
    }

}
