package components;

/**
 * Base interface for all components that can be attached to an Entity.
 */
public interface Component {

    /**
     * Updates the component's state.
     */
    void update();

    /**
     * Sets the parent entity for the component.
     *
     * @param entity The parent entity.
     */
    void setEntity(entities.Entity entity);
}
