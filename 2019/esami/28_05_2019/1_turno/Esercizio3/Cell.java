public class Cell implements Comparable{

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

  @Override
  public int compareTo(Object arg0) {
      if(arg0 instanceof Cell){
          Cell inputCell = (Cell) arg0;
          if(this.val == inputCell.getVal()){
              return 1;
          } else {
              return 0;
          }
      } else return 0;
  }
}