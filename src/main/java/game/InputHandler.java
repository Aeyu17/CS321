package game;

import java.awt.event.KeyEvent;

/**
 * Captures and processes player input.
 */
public class InputHandler {
    private boolean leftPressed;
    private boolean rightPressed;
    private boolean upPressed;
    private boolean spacePressed;

    /**
     * Checks if a specific key is currently pressed.
     *
     * @param keyCode The code of the key to check.
     * @return True if the key is pressed, false otherwise.
     */
    public boolean isKeyPressed(int keyCode) {
        return switch (keyCode) {
            case KeyEvent.VK_LEFT, KeyEvent.VK_A -> leftPressed;
            case KeyEvent.VK_RIGHT, KeyEvent.VK_D -> rightPressed;
            case KeyEvent.VK_UP, KeyEvent.VK_W -> upPressed;
            case KeyEvent.VK_SPACE -> spacePressed;
            default -> false;
        }; 
    }

    /**
     * Updates the input states.
     */
    public void update() {
        // Method body intentionally left empty
    }
}
