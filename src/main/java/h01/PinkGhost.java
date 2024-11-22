package h01;

import fopbot.Direction;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import fopbot.Robot;
import h01.template.Families;
import h01.template.Ghost;
import h01.template.TickBased;
import h01.template.Util;

/**
 * The {@link PinkGhost} is a {@link Robot} that looks like a pink ghost.
 * It tries to move in a random direction.
 */
public class PinkGhost extends Robot implements Ghost, TickBased {
    /**
     * Creates a new {@link PinkGhost} at the given position.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public PinkGhost(int x, int y) {
        super(x, y, Families.GHOST_PINK);
    }

    /**
     * Finds in how many directions the ghost can move and then turns a random
     * amount of times to the left.
     * The ghost then moves forward or turns to the left until it can move forward.
     */
    @Override
    @StudentImplementationRequired("H2.2")
    public void doMove() {
        Direction[] directions = Direction.values();
        int randomTurns = (int) (Math.random() * directions.length);

        for(int i = 0; i < randomTurns; i++){
            turnLeft();
        }

        while(!isFrontClear()){
            turnLeft();
        }
        move();

        // org.tudalgo.algoutils.student.Student.crash("H2.2 - Remove if implemented");
    }
}
