
/**
 * Rover simulation game.
 * 
 * @author Brendan McGuire
 * @version 30 Aug 2019
 */

import java.util.List;

public class Rover {

    // Keeps track of all rovers
    static List<Rover> registry;

    // Private Instance Variables
    private int x;
    private int y;
    private int rotation;

    private int health;
    private int damageWhenHit;
    private int ammo;

    public Rover(int x, int y, int health, int damageWhenHit, int ammo) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.ammo = ammo;
        this.damageWhenHit = damageWhenHit;

        // Add to registry
        Rover.registry.add(this);
    }

    // Public interface

    /**
     * Checks if the rover is alive
     * 
     * @return boolean Whether the rover is alive or not
     */
    public boolean alive() {
        return health > 0;
    }

    /**
     * Gets the rover's health
     * 
     * @return int
     */
    public int health() {
        return health;
    }

    private static class Position {
        int x;
        int y;
        int rotation;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Position(int x, int y, int rotation) {
            this.x = x;
            this.y = y;
            this.rotation = rotation;
        }
    }

    /**
     * Gets the current position
     * 
     * @return Position current position
     */
    public Position position() {
        return new Position(x, y, rotation);
    }

    /**
     * Run when the rover gets hit
     */
    public void hit() {
        health -= damageWhenHit;
    }

    // Actions

    /**
     * Fires at a certain xy position (ignores rotation)
     * 
     * @return boolean Whether you hit anything (alive)
     */
    public boolean fire(Position target) {

        boolean didHit = false;

        Rover.registry.forEach(rover -> {

            // See if the shot matters
            boolean hit = rover.x == target.x && rover.y == target.y && rover.alive();

            if (hit) {
                rover.hit();
                didHit = true;
            }

        });

        return didHit;

    };

    public void drive(int amount) {

    };

}