package boardgame;

public abstract class Piece {
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
	
	/**
	 * Available positions for each ChessPiece contains a matrix of type boolean
	 * containing all the possible moves marked as 'true' for its coordinate.
	 */
	public abstract boolean[][] possibleMoves();
	
	// Hook method: (read about design patterns - template method)
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
