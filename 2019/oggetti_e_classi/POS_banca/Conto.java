public class Conto {
    private int pin; // max 4 cifre
    private String numero; // 8 caratteri massimi
    private double saldo; // in EURO
    private int prelievi = 0;

    public Conto(int pin, String numero, double saldo) {

        this.pin = pin;
        this.numero = numero;
        this.saldo = saldo;

    }

    public int getPin() {
        System.out.println("è stato richiamato getPin del conto "+ this.numero);
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNumero() {
        return this.numero;
    }

    // Non voglio che il numero venga cambiato
   /* public void setNumero(String numero) {
        this.numero = numero;
    }*/

    public double getSaldo() {


        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void preleva(double quantita){
        if(quantita > 250){
            System.out.println("non puoi ritirare piu di 250 EURO");
            return;
        }
        else if(getSaldo() - quantita < 0) {
            System.out.println("non hai quella cifra sul conto!");
            return;
        } else {
            setSaldo(this.saldo - quantita);
            System.out.println("hai ritirato "+ quantita);

        }

        System.out.println("grazie per aver usato il nostro sistema prelievo");
    }

    public int getPrelievi(){
        return this.prelievi;
    }

    public void incrementaPrelievi(){
        this.prelievi++;
    }


}