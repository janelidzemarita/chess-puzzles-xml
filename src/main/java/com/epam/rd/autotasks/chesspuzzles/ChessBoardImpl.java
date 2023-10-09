package com.epam.rd.autotasks.chesspuzzles;

import java.util.Collection;

public class ChessBoardImpl implements ChessBoard{

    /**
     * Collection of chess pieces present on the chess board.
     */
    private final Collection<ChessPiece> pieces;

    /**
     * Constructs a new ChessBoardImpl instance with the given collection of chess pieces.
     *
     * @param pieces A collection of chess pieces to initialize the chess board.
     */
    public ChessBoardImpl(Collection<ChessPiece> pieces) {
        this.pieces = pieces;
    }

    /**
     * Returns a string representation of the current state of the chess board.
     * Each cell on the chess board is represented by the character of the chess piece
     * present on it or an empty space if no piece is present.
     *
     * @return A string representing the current state of the chess board.
     */
    @Override
    public String state() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number = 8; number >= 1; number--) {
            for (int letter = 'A'; letter <= 'H'; letter++) {
                int finalLetter = letter;
                int finalNumber = number;
                stringBuilder.append(
                        pieces.stream()
                                .filter(piece -> piece.getCell().letter == finalLetter && piece.getCell().number == finalNumber)
                                .findFirst()
                                .orElse(new ChessPieceImpl())
                                .toChar()
                );
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString().trim();
    }
}