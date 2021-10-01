package training.chessington.model.pieces;

import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        ArrayList<Move> moves = new ArrayList<>();
        Move whitePawnUp = new Move(from, from.plus(-1, 0));
        Move blackPawnDown = new Move(from, from.plus(1, 0));
        Move whitePawnUpTwo = new Move(from, from.plus(-2, 0));
        Move blackPawnDownTwo = new Move(from, from.plus(2, 0));

        moves.add(whitePawnUp);
        moves.add(blackPawnDown);
        if (from.getRow() == 6) {
            moves.add(whitePawnUpTwo);
        }
        if (from.getRow() == 1) {
            moves.add(blackPawnDownTwo);
        }
        return moves;
    }
}
