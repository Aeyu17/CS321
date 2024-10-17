package com.kosmickong.entities;

import java.awt.Graphics;
import com.kosmickong.components.Component;
import com.kosmickong.strategies.MovementStrategy;

/**
 * Abstract base class for all game entities.
 */
public abstract class Entity {

    /**
     * Adds a component to the entity.
     *
     * @param component The component to add.
     */
    public void addComponent(Component component) {
        // Method body intentionally left empty
    }

    /**
     * Retrieves a component of the specified class.
     *
     * @param <T>            The type of the component.
     * @param componentClass The class of the component to retrieve.
     * @return The component instance.
     */
    public <T extends Component> T getComponent(Class<T> componentClass) {
        return null; // Placeholder return
    }

    /**
     * Sets the movement strategy for the entity.
     *
     * @param strategy The movement strategy to set.
     */
    public void setMovementStrategy(MovementStrategy strategy) {
        // Method body intentionally left empty
    }

    /**
     * Gets the current movement strategy of the entity.
     *
     * @return The movement strategy.
     */
    public MovementStrategy getMovementStrategy() {
        return null; // Placeholder return
    }

    /**
     * Updates all components of the entity.
     */
    public void update() {
        // Method body intentionally left empty
    }

    /**
     * Renders the entity using its RenderComponent.
     *
     * @param graphics The graphics context to render on.
     */
    public void render(Graphics graphics) {
        // Method body intentionally left empty
    }
}
