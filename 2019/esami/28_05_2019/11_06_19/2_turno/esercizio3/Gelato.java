public abstract class Gelato {
    
    private int numeroGusti = 0;
    private int prezzoBase;
    private int gustiMax;
    private int prezzoPerGusto = 50;

    public Gelato(int prezzoBase, int gustiMax){
        this.prezzoBase = prezzoBase;
        this.gustiMax = gustiMax;
    }

    public  abstract int getPrezzoTotale();

    public void addGusto(){
        if(numeroGusti < gustiMax){
            numeroGusti++;
        } else {
            System.out.println("non puoi aggiungere più gusti!");
        }
    }

    public void removeGusto(){
        if(numeroGusti >0){
            numeroGusti--;
        }
    }
}