package components;

import java.awt.Graphics;
import utilities.Sprite;

/**
 * Handles rendering of the entity.
 */
public class RenderComponent implements Component {

    /**
     * Sets the sprite for rendering.
     *
     * @param sprite The sprite to set.
     */
    public void setSprite(Sprite sprite) {
        // Method body intentionally left empty
    }

    /**
     * Gets the current sprite used for rendering.
     *
     * @return The sprite.
     */
    public Sprite getSprite() {
        return null; // Placeholder return
    }

    /**
     * Renders the entity on the screen.
     *
     * @param graphics The graphics context to render on.
     */
    public void render(Graphics graphics) {
        // Method body intentionally left empty
    }

    /**
     * Updates any animations or sprite changes.
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
    public void setEntity(entities.Entity entity) {
        // Method body intentionally left empty
    }
}
