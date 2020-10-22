public class Palla {
    String colore;
    double diametro; // in cm
    double peso; // in grammi
    boolean gonfio = false;
    int numPalleggi = 0;

    public Palla(String inputColore, double inputDiametro, double inputPeso) {
        colore = inputColore;
        diametro = inputDiametro;
        peso = inputPeso;

        System.out.println("una palla è stata creata");
    }

    public void stampaAttributi() {
        System.out.println("attributi palla: colore " + colore + ", diametro " + diametro + ", peso " + peso);
    }

    public boolean valoreGonfio() {
        return gonfio;
    }

    public void gonfiaPalla() {
        if (!gonfio) {
            gonfio = true;
            System.out.println("palla gonfiata!!");
        } else {
            System.out.println("la palla è gia gonfia!!!");
        }

    }

    private void palleggio(){
        if(gonfio){
            numPalleggi++;
        }
    }

    // fa palleggiare la palla n volte
    public void palleggi(int inputNumPalleggi) {

        if (gonfio) {
            if (inputNumPalleggi >= 0) {
                for( int i = 0; i< inputNumPalleggi; i++){
                    palleggio();
                }
                System.out.println("la palla ha effettuato: " + numPalleggi + " pallleggi");
            } else {
                System.out.println("il numero di palleggi non può essere negativo!!");
            }

        } else {
            System.out.println("non posso palleggiare se sono sgonfio!!");
        }

    }
}