package entities;

import components.*;
import strategies.PlayerMovementStrategy;
import entities.Entity;

/**
 * Represents the player character in the game.
 */

 // Represents the player character in the game.

public class Player extends Entity {

    /**
     * Constructs a new Player entity with necessary components and movement strategy.
     */

     // Constructs a new Player entity with necessary components and movement strategy.

    public Player() {
        // Constructor body intentionally left empty
        // rovementComponent to handle player movement
        this.addComponent(new MovementComponent());

        // renderComponent to handle how the player is drawn on the screen
        this.addComponent(new RenderComponent());

        // healthComponent to manage the player's health
       // this.addComponent(new HealthComponent());

        // Add the CollisionComponent to manage player collision detection
      // this.addComponent(new CollisionComponent());

        // Set the player-specific movement strategy
       // this.setMovementStrategy(new PlayerMovementStrategy());
    }
    
    
}