package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	// construtor
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating "
					+ " ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

// somente getters	
	public char getColumn() {
		return column;
	}

	
	public int getRow() {
		return row;
	}

	
	// método para a posição da matriz, retorna a posição normal
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// método para a posição do xadrez
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow()); //no xadrez primeiro fala a linha, depois a coluna
	}
	
	@Override
	public String toString() {
		return "" + column + row; //"" para forçar a concatenação de Strings
	}
	
}


















