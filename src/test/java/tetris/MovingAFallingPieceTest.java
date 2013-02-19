// Copyright (c) 2008-2012  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

import net.orfjackal.nestedjunit.NestedJUnit;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(NestedJUnit.class)
public class MovingAFallingPieceTest extends Assert {

    private final Board board = new Board(4, 8);

    @Test
    public void a_falling_piece_can_be_moved_left() {
        board.drop(Tetromino.T_SHAPE);
        assertEquals("" +
                "....T...\n" +
                "...TTT..\n" +
                "........\n" +
                "........\n", board.toString());

        board.moveLeft();

        assertEquals("" +
                "...T....\n" +
                "..TTT...\n" +
                "........\n" +
                "........\n", board.toString());
    }


    // TODO: a falling piece can be moved right
    // TODO: a falling piece can be moved down
    // TODO: it will not move left over over the board
    // TODO: it will not move right over over the board
    // TODO: it will not move down over over the board (will stop falling)
    // TODO: it can not be moved left if another piece is in the way
    // TODO: it can not be moved right if another piece is in the way
    // TODO: it can not be moved down if another piece is in the way (will stop falling)

    // P.S. Take into consideration, that part of the piece's area may be empty cells.
    // Only non-empty cells should take part in the collision checks.
}
