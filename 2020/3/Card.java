public class Card {
    
    private int value = 0;
    private String seed = "";

    public Card(int value, String seed){
        this.value = value;
        this.seed = seed;
    }

    private void setValue(int nuovoValue){
        this.value = nuovoValue;
    }

    public int getValue(){
    
        return this.value;
    }

    private void setSeed(String nuovoSeed){
        this.seed = nuovoSeed;
    }

    public String getSeed(){
        return this.seed;
    }
    public String toString(){
        return ""+ this.value+ this.seed;
    }
}
