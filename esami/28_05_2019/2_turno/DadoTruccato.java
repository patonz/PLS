class DadoTruccato extends Dado {

    int lancioPrecedente = 0;

    public DadoTruccato(int input) {
        super(input);
    }

    @Override
    public int lancia() {
        System.out.println("richiamato 'lancia' della sottoclasse DatoTruccato");
        if (lancioPrecedente == 0) {
            lancioPrecedente = 1;
        } else if (lancioPrecedente < this.side) {
            lancioPrecedente++;

        } else {
            lancioPrecedente = 1;
        }
        return lancioPrecedente;
    }

    
}