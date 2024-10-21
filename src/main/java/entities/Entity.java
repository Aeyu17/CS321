package com.kosmickong.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import com.kosmickong.components.Component;
import com.kosmickong.components.RenderComponent;
import com.kosmickong.strategies.MovementStrategy;


public abstract class Entity {

    private List<Component> components;
    private MovementStrategy movementStrategy;

    public Entity() {
        components = new ArrayList<>();
    }

    
     

    // Adds a component to the entity.
    //@param component The component to add.   
    public void addComponent(Component component) {
        components.add(component);
        component.setEntity(this); // Set this entity to the component
    }

    /**
     * Retrieves a component of the specified class.
     * @param <T>            The type of the component.
     * @param componentClass The class of the component to retrieve.
     * @return The component instance or null if not found.
     */
    public <T extends Component> T getComponent(Class<T> componentClass) {
        for (Component component : components) {
            if (componentClass.isInstance(component)) {
                return componentClass.cast(component);
            }
        }
        return null; // Return null if the component is not found
    }

    
    
     //Sets the movement strategy for the entity.
     // @param strategy The movement strategy to set.  
    public void setMovementStrategy(MovementStrategy strategy) {
        this.movementStrategy = strategy;
    }

    
    
    //  Gets the current movement strategy of the entity.
    // @return The movement strategy. 
    public MovementStrategy getMovementStrategy() {
        return movementStrategy;
    }

    
    
    //  Updates all components of the entity.
    public void update() {
        for (Component component : components) {
            component.update(); // Update each component
        }
        if (movementStrategy != null) {
            movementStrategy.move(this); // Apply the movement strategy
        }
    }

    
    //Renders the entity using its RenderComponent. 
    // @param graphics The graphics context to render on.
    public void render(Graphics graphics) {
        RenderComponent renderComponent = getComponent(RenderComponent.class);
        if (renderComponent != null) {
            renderComponent.render(graphics); // Render the entity using the RenderComponent
        }
    }
}
