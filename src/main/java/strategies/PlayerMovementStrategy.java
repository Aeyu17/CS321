package strategies;

import components.MovementComponent;
import entities.Entity;
import game.InputHandler;
import java.awt.Point;

/**
 * Handles player movement based on user input.
 */
public class PlayerMovementStrategy implements MovementStrategy {

    private InputHandler inputhandler;
    Entity parentEntity;
    Point position;
    int velocity = 3;
    
    public PlayerMovementStrategy(Entity parententity, InputHandler inputhandler) {
        this.parentEntity = parententity;
        this.inputhandler = inputhandler;
    }
    /**
     * Moves the player entity according to user input.
     *
     * @param entity The player entity to move.
     */
    @Override
    public void move(Entity entity) {
        MovementComponent movementComponent = parentEntity.getComponent(MovementComponent.class);
        
        if (inputhandler != null) {  // Ensure inputhandler is set before using it
            this.position = movementComponent.getPosition();
            if (inputhandler.isLeftPressed()) {
                this.position.x -= velocity;
                movementComponent.setPosition(this.position.x, this.position.y);
                System.out.println("Moving left: New X = " + position.x);  
            }
            if (inputhandler.isRightPressed()) {
                this.position.x += velocity;
                movementComponent.setPosition(this.position.x, this.position.y);
                System.out.println("Moving right: New X = " + position.x);  
            }
            
        }
    }
    public void setInputHandler(InputHandler inputhandler) {
        this.inputhandler = inputhandler;
    }
}
