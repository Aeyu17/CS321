package entities;

import components.*;
import strategies.PlayerMovementStrategy;
import entities.Entity;
import utilities.Sprite;

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
        
        PlayerMovementStrategy playerMovement;
        // set player's sprite upon creation
        Sprite playerSprite = new Sprite();
        playerSprite.loadImage("/player_bigger.png");
        // assign render component to sprite
        RenderComponent renderComponent = new RenderComponent();
        renderComponent.setSprite(playerSprite);
        
        //add render component to player
        this.addComponent(renderComponent);
        
        
        // movementComponent to handle player movement
        MovementComponent movementComponent = new MovementComponent();
        this.addComponent(movementComponent);

        // healthComponent to manage the player's health
       // this.addComponent(new HealthComponent());

        // Add the CollisionComponent to manage player collision detection
      // this.addComponent(new CollisionComponent());

        // Set the player-specific movement strategy
       // this.setMovementStrategy(new PlayerMovementStrategy());
    }
    
    
}