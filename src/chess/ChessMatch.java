package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	
	// método
	public ChessPiece[][] getPieces() {
		// deve acessar apenas a peça de xadrez 
		// e não a peça comum
		ChessPiece[][] mat =
				new ChessPiece
				[board.getRows()][board.getColumns()];
		// percorre a matriz de peças do board
	//e faz um downcasting para chessPiece
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

}
