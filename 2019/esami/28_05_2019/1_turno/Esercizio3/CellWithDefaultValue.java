class CellWithDefaultValue extends Cell {

    int defaultValue;

    public CellWithDefaultValue(int input){
        super(input);
        this.defaultValue = input;
    }

    public void setToDefault(){
        this.setVal(defaultValue);
    }

    @Override
    public String toString() {
       
        return super.toString() + " e Valore di Default = "+ this.defaultValue;
    }
}