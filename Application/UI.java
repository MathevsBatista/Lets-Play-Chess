package Application;

import BoardLayer.Board;
import ChessLayer.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for(int i = 0; i < pieces.length; i++){
            System.out.print((8-i) + " ");
            for(int j = 0; j < pieces[i].length; j++){
                printPiece(pieces[i][j]);
            }
        }
        for (int i = 0; i < pieces[0].length; i++) {
            System.out.println("  a b c d e f g h");
        }
    }

    public static void printPiece(ChessPiece piece) {
        if(piece == null) {
            System.out.print("-");
        }else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
