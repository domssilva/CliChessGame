package boardgame;

public class Piece {
	protected Position position; // holds the matrix address
	private Board board;
	
	/**
	 * When first created, the position of a Piece is null.
	 * @param board
	 */
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	/**
	 * Board should only be accessed by the board layer components
	 * @return board
	 */
	protected Board getBoard() {
		return board;
	}
}
