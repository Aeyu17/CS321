package utilities;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for handling keyboard events.
 */
public class KeyInput implements KeyListener {

    private Set<Integer> pressedKeys = new HashSet<>();  // Track key inputs

    /**
     * Processes a key press event.
     *
     * @param e The key event.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        pressedKeys.add(e.getKeyCode());
    }

    /**
     * Processes a key release event.
     *
     * @param e The key event.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used, but required by KeyListener
    }

    /**
     * Checks if a key is currently pressed.
     *
     * @param keyCode The key code to check.
     * @return True if the key is pressed, false otherwise.
     */
    public boolean isKeyPressed(int keyCode) {
        return pressedKeys.contains(keyCode);
    }
}
