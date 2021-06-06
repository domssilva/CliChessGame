package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		// yes a string, not a char. Because this will be printed on the UI grid.
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		// TODO temporaryMatrix is not the final solution... testing stuff 
		boolean[][] temporaryMatrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return temporaryMatrix;
	}
	
}
