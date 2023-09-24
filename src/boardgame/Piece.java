package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	// Construtor
	public Piece(Board board) {
		this.board = board;
		position = null; // opcional, posição inicial da peça é nulo, já fica implícito por ser um objeto
	}
	
	// apenas o getBoard()
	// acessível apenas no mesmo pacote e pelas subclasses
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		
		boolean[][] mat = possibleMoves();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true; // sendo verdadeiro, já existe um movimento possível
				}
			}
		}
		return false;
		
	}

}





























