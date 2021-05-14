package BoardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
    }

    // O tabuleiro é acessível apenas para subclasses da classe Peça, o tabuleiro é protegido de ser modificado por outras estruturas do projeto.
    protected Board getBoard() {
        return board;
    }
}
