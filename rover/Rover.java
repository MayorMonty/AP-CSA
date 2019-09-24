
/**
 * Rover simulation game.
 * 
 * @author Brendan McGuire
 * @version 30 Aug 2019
 */

import java.util.List;
import java.util.ArrayList;

public class Rover {

    // Keeps track of all rovers
    static List<Rover> registry = new ArrayList<Rover>();

    // Private Instance Variables
    public static class Position {
        double x;
        double y;
        double rotation; // Angle in radians (0 deg is facing right)

        boolean equals(Position compare) {
            return x == compare.x && y == compare.y;
        }

        double distance(Position compare) {
            return Math.sqrt(Math.pow((y - compare.y), 2) + Math.pow((x - compare.x), 2));
        }

        Position(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Position(double x, double y, double rotation) {
            this.x = x;
            this.y = y;
            this.rotation = rotation;
        }
    }

    private Position position;
    private Position start;

    private int health;
    private int maxHealth;
    private int damageWhenHit;
    private int ammo;
    private int energy;
    private int maxEnergy;

    public Rover(double x, double y, double rotation, int health, int damageWhenHit, int ammo, int energy) {
        this.position = new Position(x, y);
        this.start = new Position(x, y);

        this.health = health;
        this.maxHealth = health;
        this.ammo = ammo;
        this.damageWhenHit = damageWhenHit;
        this.energy = energy;
        this.maxEnergy = energy;

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
        return health > 0 && energy > 0;
    }

    /**
     * Gets the rover's ammo
     * 
     * @return int
     */
    public int ammo() {
        return ammo;
    }

    /**
     * Gets the rover's health
     * 
     * @return int
     */
    public int health() {
        return health;
    }

    /**
     * Gets the rover's energy
     * 
     * @return int
     */
    public int energy() {
        return health;
    }

    /**
     * Gets the rover's maxHealth
     * 
     * @return int
     */
    public int maxHealth() {
        return maxHealth;
    }

    /**
     * Gets the rover's maxEnergy
     * 
     * @return int
     */
    public int maxEnergy() {
        return maxEnergy;
    }

    /**
     * Gets the current position
     * 
     * @return Position current position
     */
    public Position position() {
        return position;
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
     * @param Position target to fire at
     * @return boolean Whether you hit anything (alive)
     */
    public boolean fire(Position target) {

        if (!alive()) {
            return false;
        }

        // Move the robot the max it can with it's given energy
        if (energy < 20) {
            return false;
        }

        boolean didHit = false;

        for (Rover rover : Rover.registry) {
            // See if the shot matters
            boolean hit = rover.position.equals(target) && rover.alive();

            if (hit) {
                rover.hit();
                didHit = true;
            }
        }

        energy -= 20;
        ammo -= 1;

        return didHit;

    };

    /**
     * Drives the robot forward. Note that since the rover is not omnidirectional,
     * this merely moves the rover in the direction that it is pointing
     * 
     * @param amount
     */
    public boolean drive(double amount) {

        if (!alive()) {
            return false;
        }

        // Move the robot the max it can with it's given energy
        if (energy < amount) {
            amount = Math.max(energy, 0);
        }

        double deltaX = amount * Math.cos(position.rotation);
        double deltaY = amount * Math.sin(position.rotation);

        position.x += deltaX;
        position.y += deltaY;

        energy -= amount;

        return true;
    };

    /**
     * Turns to face a specific point
     * 
     * @param position The (x, y) coordinate to face (ignores any specified
     *                 rotation)
     */
    public boolean turnToFace(Position target) {

        // Construct legs of triangle
        double deltaX = target.x - position.x;
        double deltaY = target.y - position.y;

        return turn(Math.atan(deltaY / deltaX));
    }

    /**
     * Rotates the robot a specific amount
     * 
     * @param amount Amount to rotate (in radians)
     */
    public boolean turn(double amount) {

        if (!alive()) {
            return false;
        }

        // Move the robot the max it can with it's given energy
        if (energy < amount) {
            amount = Math.max(energy, 0);
            return false;
        }

        position.rotation += amount;

        // Normalize the angle
        if (position.rotation > 2 * Math.PI) {
            position.rotation -= 2.0 * Math.PI;
        }

        if (position.rotation < 0) {
            position.rotation += 2.0 * Math.PI;
        }

        energy -= amount;
        return true;
    }

    public boolean moveTo(Position target) {
        turnToFace(position);
        return drive(position.distance(target));

    }

    public boolean goHome() {
        return moveTo(this.start);
    }

    /**
     * Uses energy to repair bot
     * 
     * @param amount The amount of energy to consume to repair bot
     */
    public boolean repair(int amount) {

        if (amount > energy) {
            return false;
        }

        health = Math.min(amount + health, maxHealth);
        energy -= amount;

        return true;

    }

    /**
     * Charges bot
     * 
     * @param amount Amount to charge the bot
     */
    public void charge(int amount) {

        if (health <= 0) {
            return;
        }

        energy = Math.min(amount + energy, maxEnergy);
    };

}