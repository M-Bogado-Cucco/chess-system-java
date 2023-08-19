package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
	}
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	// apenas o getBoard() acessível apenas no mesmo pacote e pelas subclasses
	protected Board getBoard() {
		return board;
	}

}
