package BoardGame;

public class Board {
    private int rows = 8;
    private int columns = 8;
    private Piece[][] pieces;

    public Board(){
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}