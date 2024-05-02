package boardgame;

public class Board {

    private int rows;
    private int columns;

    private Piece[][] pieces;

    public Board(int rown, int columns) {
        this.rows = rown;
        this.columns = columns;
        this.pieces = new Piece[rown][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
