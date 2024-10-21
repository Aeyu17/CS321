package components;

import java.awt.Point;
import entities.Entity;
import game.InputHandler;
import utilities.KeyInput;

/**
 * Manages position and velocity of an entity.
 */
public class MovementComponent implements Component {

    private Point position;
    private final int velocity = 5;
    private Entity parentEntity;
    private InputHandler inputHandler;
            
    public MovementComponent(){
        this.position = new Point(0,0);
    }
    
    /**
     * Sets the InputHandler for handling key inputs
     */
    
    public void setInputHandler(InputHandler inputhandler){
        this.inputHandler = inputhandler;
    }
    
    /**
     * Sets the position of the entity.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     */
    public void setPosition(int x, int y) {
        this.position = new Point(x,y);
    }

    /**
     * Gets the current position of the entity.
     *
     * @return The position as a Point object.
     */
    public Point getPosition() {
        return this.position;
    }

    /**
     * Updates the position based on velocity.
     */
    @Override
    public void update() {
        if(inputHandler.isLeftPressed()){
            this.position.x-=velocity;
            System.out.println("X: " + position.x);
        }
        if(inputHandler.isRightPressed()){
            this.position.x+=velocity;
            System.out.println("X: " + position.x);
        }
        // still need to add case for space bar but will require collision detection
    }

    /**
     * Sets the parent entity for the component.
     *
     * @param entity The parent entity.
     */
    @Override
    public void setEntity(Entity entity) {
        this.parentEntity = entity;
    }
}
