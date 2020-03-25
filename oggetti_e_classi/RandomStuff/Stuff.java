class Stuff {
    public static void main(String[] args) {

        //

    //   stampaAVideo("stampa getStaticNumero " + Oggetto.getStaticNumero());

        Oggetto miooggetto = new Oggetto(15);
        miooggetto.ricorsione(0, 0, 30, 0, 3);
        /*
        stampaAVideo("stampa getStaticNumero " + Oggetto.getStaticNumero());
        final int numero = miooggetto.getNumero();
        stampaAVideo("stampa getNumero di miooggetto " + numero);
        Oggetto miooggetto2 = new Oggetto(5);
        stampaAVideo("stampa getStaticNumero " + Oggetto.getStaticNumero());

        stampaAVideo("numero oggetti creati: "+ Oggetto.getInstanceCounter());

        int[] numeri = new int[10];
        for(int pappa = 0; pappa < numeri.length; pappa++){
            System.out.println(numeri[pappa]);
        }
        String[] oggetti = new String[10];
        for(int pappa = 0; pappa < numeri.length; pappa++){
            System.out.println(oggetti[pappa]);
        }*/
/*
        System.out.println('a' - 'd');
        int scorrimento = 4;
        String[] alfabeto = {"a", "b"};
        String stringa = "aaaa";
        String decifrata = "";
        int cont = 0;
        while(scorrimento > alfabeto.length){
            scorrimento = scorrimento - alfabeto.length;
        }

            for(int j = 0; j < alfabeto.length; j++){
                
                if(stringa.charAt(cont) == alfabeto[j]){
                    if(j+scorrimento <= alfabeto.length){

                        decifrata = decifrata + alfabeto[j + scorrimento];
                        cont++;
                    } else {

                        // scorrimento 10, lettera t= 20 , alfabeto 26
                        
                        int diff = j + scorrimento - alfabeto.length;
                        // 
                        decifrata = decifrata + alfabeto[diff];
                    }
                 
                }
            }    
        */
    }

    // int, double, char, String, float, void ....
    static public void stampaAVideo(String stringa) {

        System.out.println(stringa);
        return;
    }
}