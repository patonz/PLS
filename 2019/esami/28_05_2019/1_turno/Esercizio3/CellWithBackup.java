class CellWithBackup extends Cell {

    int previousValue;

    public CellWithBackup(int input){
        super(input);
        this.previousValue = input;
    }


   
    // ho bisogno del setVal della superclasse
    @Override
    public void setVal(int val){

        this.previousValue = this.getVal();
        super.setVal(val);
    }

    public void setToPreviousValue(){
        this.setVal(previousValue);
    }


    public int getPreviousValue() {
        return previousValue;
    }

    @Override
    public String toString() {
        return super.toString() + " e Valore di Backup = "+ this.previousValue;
    }

    @Override
    public int compareTo(Object input){
        if(super.compareTo(input) == 1){
            
            CellWithBackup inpWithBackup = (CellWithBackup) input;
            if(this.previousValue == inpWithBackup.getPreviousValue()){
                return 1;
            } return 0;
        } return 0;
    }
}