/**
 * The {@code ChessPieceImpl} class represents a chess piece with its position on the chess board.
 * It implements the {@link ChessPiece} interface and provides methods to retrieve the cell and character
 * representation of the chess piece.
 */
package com.epam.rd.autotasks.chesspuzzles;

public class ChessPieceImpl implements ChessPiece {

    /**
     * The cell on the chess board where the chess piece is located.
     */
    private final Cell cell;

    /**
     * The character representation of the chess piece.
     */
    private final char piece;

    /**
     * Constructs a new ChessPieceImpl instance with the given cell and character representation.
     *
     * @param cell  The cell on the chess board where the chess piece is located.
     * @param piece The character representation of the chess piece.
     */
    public ChessPieceImpl(Cell cell, char piece) {
        this.cell = cell;
        this.piece = piece;
    }

    /**
     * Constructs a new ChessPieceImpl instance with no specific cell and a default character representation ('.').
     * This is often used to represent empty cells on the chess board.
     */
    public ChessPieceImpl() {
        this.cell = null;
        this.piece = '.';
    }

    /**
     * Retrieves the cell on the chess board where the chess piece is located.
     *
     * @return The cell representing the position of the chess piece on the chess board.
     */
    @Override
    public Cell getCell() {
        return cell;
    }

    /**
     * Retrieves the character representation of the chess piece.
     *
     * @return The character representing the chess piece.
     */
    @Override
    public char toChar() {
        return piece;
    }
}
