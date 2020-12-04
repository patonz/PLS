public class Pacco {
    
    private static int maxPeso = 5000;

    private int peso; // espresso in grammi
    private String contenuto; // nome del prodotto corto
    private String descrizione; // descrizione del prodotto

    private String tipo; // tecnologia, alimentare, cartoleria .....

    public Pacco(){

    }

    public Pacco(String contenuto){
        this.contenuto = contenuto;
        this.descrizione = contenuto;
        this.tipo = "generico";
        this.peso = maxPeso;
    }

    public Pacco(String contenuto, String descrizione){
        this.contenuto = contenuto;
        this.descrizione = descrizione;
        this.tipo = "generico";
        this.peso = maxPeso;
    }

    public Pacco(String contenuto, String descrizione, int peso, String tipo){
            this.contenuto = contenuto;
            this.descrizione = descrizione;
            this.peso = peso;
            this.tipo = tipo;
        
     
    }

    public static int getMaxPeso(){
        return maxPeso;
    }

    public static void setMaxPeso(int peso){
        maxPeso = peso;
    }
    public int getPeso(){
        return this.peso;
    }

    public String getInfo(){
        return this.contenuto + " " + this.peso + " " + this.tipo;
    }
}
