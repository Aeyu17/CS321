package utilities;

import java.awt.Image;

/**
 * Represents graphical sprites for rendering entities.
 */
public class Sprite {
    private Image image;
    /**
     * Gets the image associated with the sprite.
     *
     * @return The image.
     */
    public Image getImage() {
        return image; // Placeholder return
    }

    /**
     * Sets the image for the sprite.
     *
     * @param image The image to set.
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Updates the sprite animation if applicable.
     */
    public void updateAnimation() {
        // Will implement later when animation complete and movement works
    }
}
