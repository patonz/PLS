public class Cono extends Gelato{
    
  
    public Cono(int prezzoBase){
        super(prezzoBase, 3);
    }

    @Override
    public int getPrezzoTotale(){  
            return this.prezzoBase + (this.numeroGusti * prezzoPerGusto) + 74;
    }
}