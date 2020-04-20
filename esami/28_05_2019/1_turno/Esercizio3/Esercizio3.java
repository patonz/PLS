class Esercizio3 {
    public static void main(String[] args) {

        Cell[] cells = { new CellWithBackup(5), new Cell(6), new Cell(44), new CellWithDefaultValue(8),
                new CellWithBackup(78) };

            cells[0].setVal(77);
            cells[1].setVal(4);
            cells[2].setVal(200);
            cells[3].setVal(34);
            cells[4].setVal(1);

        for (Cell cell : cells) {
            System.out.println(cell.toString());
        }
    }
}