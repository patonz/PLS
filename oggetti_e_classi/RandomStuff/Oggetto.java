class Oggetto {
    private int numero = 0;
    private static int staticNumero = 0;
    private static int instanceCounter = 0;


    public Oggetto(int inputNum){
     numero = inputNum;
     staticNumero = staticNumero + inputNum;
     instanceCounter++;

 
    }


    public void ricorsione(int contatore, int inizio, int fine, int numVolte){
      //  System.out.println("numvolte: "+ numVolte);
      
        if(contatore == fine){
            if(numVolte >= 3){
                return;
            } else {
                numVolte++;
                ricorsione(inizio, inizio, fine, numVolte);
                return;
            }
           
        }


        System.out.println(contatore);
        contatore++;
        ricorsione(contatore, inizio, fine, numVolte);
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