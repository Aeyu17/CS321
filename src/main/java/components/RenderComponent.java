package components;

import java.awt.Graphics;
import utilities.Sprite;
import components.MovementComponent;
import entities.Entity;
import java.awt.Color;
import java.awt.Point;
import utilities.Sprite;

/**
 * Handles rendering of the entity.
 */
public class RenderComponent implements Component {

    private Entity parentEntity;
    private Sprite spriteGraphic;
    
    
    /**
     * Sets the sprite for rendering.
     *
     * @param sprite The sprite to set.
     */
    public void setSprite(Sprite sprite) {
        this.spriteGraphic = sprite;
    }

    /**
     * Gets the current sprite used for rendering.
     *
     * @return The sprite.
     */
    public Sprite getSprite() {
        return this.spriteGraphic;
    }

    /**
     * Renders the entity on the screen based on the entity's position
     *
     * @param graphics The graphics context to render on.
     */
    public void render(Graphics graphics) {
        if(spriteGraphic!= null && parentEntity!=null){
            MovementComponent movementComponent = parentEntity.getComponent(MovementComponent.class);
            if(movementComponent!=null){
                Point position = movementComponent.getPosition();
                graphics.drawImage(spriteGraphic.getImage(),position.x,position.y,null);
            }
            
        }
    }

    /**
     * Updates any animations or sprite changes.
     */
    @Override
    public void update() {
        // Will be used for updating animation frames if we get to that
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
