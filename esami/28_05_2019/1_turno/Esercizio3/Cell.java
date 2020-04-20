public class Cell {

    private int val;

    public Cell(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int v) {
        val = v;
    }

    @Override
    public String toString() {
        return "Valore Cella = " + this.getVal();
    }
}