package chess;

import boardgame.Board;

/**
 * holds the game logic
 */
public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	/**
	 * Abstraction of the Piece class, suited for the chess layer.
	 * @return matrix of ChessPieces
	 */
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matrix[i][j] /* row[i] column[j] */ = (ChessPiece) board.piece(i, j);
			}
		}
		return matrix;
	}
}
