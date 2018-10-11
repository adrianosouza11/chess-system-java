package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serailVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}
