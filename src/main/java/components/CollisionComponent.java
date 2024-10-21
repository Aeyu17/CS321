package components;

import entities.Entity;

/**
 * Handles collision detection for the entity.
 */
public class CollisionComponent implements Component {

    /**
     * Checks if the entity collides with another entity.
     *
     * @param other The other entity to check collision with.
     * @return True if a collision occurs, false otherwise.
     */
    public boolean checkCollision(Entity other) {
        return false; // Placeholder return
    }

    /**
     * Defines actions to take when a collision occurs.
     *
     * @param other The other entity involved in the collision.
     */
    public void onCollision(Entity other) {
        // Method body intentionally left empty
    }

    /**
     * Updates collision-related data.
     */
    @Override
    public void update() {
        // Method body intentionally left empty
    }

    /**
     * Sets the parent entity for the component.
     *
     * @param entity The parent entity.
     */
    @Override
    public void setEntity(Entity entity) {
        // Method body intentionally left empty
    }
}
