package components;

import java.awt.Point;
import entities.Entity;

/**
 * Manages position and velocity of an entity.
 */
public class MovementComponent implements Component {

    private Point position;
    private Entity parentEntity;
    
            
    public MovementComponent(){
        this.position = new Point(0,0);
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
     * Updates the position by delegating movement to current strategy
     */
    @Override
    public void update() {
        if(parentEntity.getMovementStrategy()!= null) {
            parentEntity.getMovementStrategy().move(parentEntity);
        }
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
