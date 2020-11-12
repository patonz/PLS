public class Deck {
    public static void main(String[] args) {
       magicCube();

       Card[] deck = generateDeck();

       for (int i = 0; i < deck.length; i++) {
           System.out.println(deck[i].toString());
       }

    }

    public static Card[] generateDeck(){
        int numCards = 40;
        String[] seeds = { "spade", "coppe", "bastoni", "denari"};
        Card[] deckTemp = new Card[numCards];

        int cardCount = 0;
        for(int i = 0; i< seeds.length; i++){
            String currentSeed = seeds[i];
            for(int valueCard = 1; valueCard <= 10; valueCard++ ){
                Card card = new Card(valueCard, seeds[i]);

                deckTemp[cardCount] = card;
                cardCount++;
                
            }
        }


        return deckTemp;
    }

    public static void magicCube(){
        int grandezzaMatrice = 4;

        int[][] matrice = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, {4, 15, 14, 1} };

        int sommatoriaPrec = 0;
        int sommatoriaDiagonaleA = 0;
        int sommatoriaDiagonaleB = 0;
        for(int i = 0; i < matrice.length; i++){
            int sommatoriaRiga = 0;
            int sommatoriaColonna = 0;
          
            for (int k = 0; k < matrice[i].length; k++) {
                sommatoriaRiga += matrice[i][k];

                sommatoriaColonna += matrice[k][i];
            }

            sommatoriaDiagonaleA += matrice[i][i];
            sommatoriaDiagonaleB += matrice[i][matrice.length-1 - i];
            if(i == 0){
                sommatoriaPrec = sommatoriaRiga;
            } 
            if(sommatoriaRiga != sommatoriaPrec || sommatoriaColonna != sommatoriaPrec){
               // System.out.println("la matrice non è un 'quadrato magico'");
               // System.exit(0);
            } 
        }
        if(sommatoriaPrec != sommatoriaDiagonaleA || sommatoriaPrec != sommatoriaDiagonaleB){

        }
    }
}
