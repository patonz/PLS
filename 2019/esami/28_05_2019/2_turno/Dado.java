import java.util.Random;

class Dado {
    int side;

    public Dado(int input) {
        if (input >= 1) {
            this.side = input;
        } else {
            this.side = 1;
        }

    }

    // ritorna un numero tra 1 e n( quindi valore "side");
    public int lancia() {
        System.out.println("richiamato 'lancia' della classe Dado");
        // logica random
        Random rnd = new Random();
        // 0-5 dal random e quindi + 1 finale.
        int diceValue = rnd.nextInt(this.side) + 1;
        return diceValue;
    }
}