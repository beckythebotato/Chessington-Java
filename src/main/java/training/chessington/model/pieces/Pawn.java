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
        int direction = 1;
        int initialRow = 1;

        if (this.getColour() == PlayerColour.WHITE) {
            direction = -1;
            initialRow = 6;
        }

        Coordinates oneSpaceForward = from.plus(direction, 0);
        Coordinates twoSpacesForward = from.plus(2 * direction, 0);

        if (board.get(oneSpaceForward) == null) {
            moves.add(new Move(from, oneSpaceForward));
        }

        if (board.get(twoSpacesForward) == null && from.getRow() == initialRow) {
            moves.add(new Move(from, twoSpacesForward));
        }

        return moves;



//
//        Move whitePawnUp = new Move(from, from.plus(-1, 0));
//        Move blackPawnDown = new Move(from, from.plus(1, 0));
//        Move whitePawnUpTwo = new Move(from, from.plus(-2, 0));
//        Move blackPawnDownTwo = new Move(from, from.plus(2, 0));
//
//        Coordinates to = from.plus(-2, 0);
//
//        moves.add(whitePawnUp);
//        moves.add(blackPawnDown);
//        if (from.getRow() == 6 && board.get(to) == null) {
//
//            moves.add(whitePawnUpTwo);
//        }
//        if (from.getRow() == 1) {
//            moves.add(blackPawnDownTwo);
//        }
//
//        return moves;
    }
}
