package game;

import java.awt.event.KeyEvent;
import utilities.KeyInput;

/**
 * Captures and processes player input.
 */
public class InputHandler {

    private final KeyInput keyInput;  // Reference to KeyInput

    /**
     * Constructor for InputHandler
     * @param keyInput the KeyInput instance that tracks key presses
     */
    public InputHandler(KeyInput keyInput) {
        this.keyInput = keyInput;
    }

    /**
     * Checks if a specific key is currently pressed.
     *
     * @param keyCode The code of the key to check.
     * @return True if the key is pressed, false otherwise.
     */
    public boolean isKeyPressed(int keyCode) {
        return keyInput.isKeyPressed(keyCode);
    }

    /**
     * Checks if left movement keys are pressed.
     * @return True if any of the left movement keys are pressed, false otherwise.
     */
    public boolean isLeftPressed() {
        return keyInput.isKeyPressed(KeyEvent.VK_LEFT) || keyInput.isKeyPressed(KeyEvent.VK_A);
    }

    /**
     * Checks if right movement keys are pressed.
     * @return True if any of the right movement keys are pressed, false otherwise.
     */
    public boolean isRightPressed() {
        return keyInput.isKeyPressed(KeyEvent.VK_RIGHT) || keyInput.isKeyPressed(KeyEvent.VK_D);
    }

    /**
     * Checks if up movement keys are pressed.
     * @return True if any of the up movement keys are pressed, false otherwise.
     */
    public boolean isUpPressed() {
        return keyInput.isKeyPressed(KeyEvent.VK_UP) || keyInput.isKeyPressed(KeyEvent.VK_W);
    }

    /**
     * Checks if space key is pressed (for jumping).
     * @return True if space is pressed, false otherwise.
     */
    public boolean isSpacePressed() {
        return keyInput.isKeyPressed(KeyEvent.VK_SPACE);
    }
}
