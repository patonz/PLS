public class Magazzino {
    String nome;
    Pacco[] pacchi;

    public Magazzino(String nome, int capacita){
        this.nome = nome;
        this.pacchi = new Pacco[capacita];
    }


    public boolean inserisciPacco(Pacco pacco){
        boolean paccoInserito = false;
        if(pacco.getPeso() > Pacco.getMaxPeso()){
            System.out.println("Il pacco non può essere inserito, pesa troppo");
            paccoInserito = false;
            return paccoInserito;
        }
        for(int i = 0; i < this.pacchi.length; i++){
            if(this.pacchi[i] == null){
                this.pacchi[i] = pacco;
                paccoInserito = true;
                return paccoInserito;
            }
       
        }
        return paccoInserito;
    }

    public Pacco[] getPacchi(){
        return this.pacchi;
    }

    public String getNome(){
        return this.nome;
    }
}
