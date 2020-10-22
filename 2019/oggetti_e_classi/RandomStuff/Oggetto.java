class Oggetto implements Comparable {
    private int numero = 0;
    private static int staticNumero = 0;
    private static int instanceCounter = 0;


    public Oggetto(int inputNum) {

     numero = inputNum;
     staticNumero = staticNumero + inputNum;
     instanceCounter++;

 
    }

    @Override
    public int compareTo(Object input) {
        if(input instanceof Oggetto){
            Oggetto inputOggetto = (Oggetto) input;
            System.out.println("è i tipo 'Oggetto'");
            if(this.numero == inputOggetto.getNumero()){
                return 1;
            } else {
                return 0;
            }
          
        } else {
            return 0;
        }
    }


    public void ricorsione(int contatore, int inizio, int fine, int numVolte, int numMaxVolte){
      
        if(contatore == fine){
            if(numVolte >= numMaxVolte){
                return;
            } else {
                numVolte++;
                ricorsione(inizio, inizio, fine, numVolte, numMaxVolte);
                return;
            }
           
        }
        System.out.println(contatore);
        contatore++;
        ricorsione(contatore, inizio, fine, numVolte, numMaxVolte);
    }

     // get + NomeVariabile
    public int getNumero(){
     
        return numero;
    }

    public static int getInstanceCounter(){
        return instanceCounter;
    }

    public void setNumero(int inputNumero){
        numero = inputNumero;
    }

    public static int getStaticNumero(){
        return staticNumero;
    }

    public int getTen(){
        return 10;
    }

    public static String getCiao(){
        return "ciao";
    }

    
    
}