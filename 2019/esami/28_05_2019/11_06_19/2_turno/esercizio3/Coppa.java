public class Coppa extends Gelato {
      
    public Coppa(int prezzoBase){
        super(prezzoBase, 5);
    }

    @Override
    public int getPrezzoTotale(){  
            return this.prezzoBase + (this.numeroGusti * prezzoPerGusto) * 3;
    }
}