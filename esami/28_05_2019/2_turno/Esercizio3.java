class Esercizio3 {
    public static void main(String[] args) {

        Dado dice = new Dado(20);
        DadoTruccato diceTruccato = new DadoTruccato(6);
        // array di tipo Dado
        Dado[] dadi = { dice, diceTruccato };

        for(int i = 0; i < dadi.length; i ++){
            int lancio1 = ((Dado) dadi[i]).lancia();
            int lancio2 = dadi[i].lancia();
            System.out.print(lancio1 +" "+ lancio2+"\n");
        }

    }
}