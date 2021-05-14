package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.ChessPieces.King;
import ChessLayer.ChessPieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i<board.getRows(); i++){
            for(int j = 0; j<board.getColumns(); j++){
                chessPieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return chessPieces;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 7));
        board.placePiece(new Rook(board, Color.BLACK), new Position(7, 0));
        board.placePiece(new Rook(board, Color.BLACK), new Position(7, 7));
        board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
        board.placePiece(new King(board, Color.BLACK), new Position(7, 4));

    }
}
