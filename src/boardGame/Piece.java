package boardGame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		board = null; //the position of a recently created piece its null
	}

	protected Board getBoard() {
		return board;
	}
}
