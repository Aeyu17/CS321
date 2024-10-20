package utilities;

import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
   

/**
 * Utility class for handling keyboard events.
 */
public class KeyInput {

    private Set<Integer> pressedKeys = new HashSet<>(); // Uses a hashset to track key inputs
    /**
     * Processes a key press event.
     *
     * @param e The key event.
     */
    public void keyPressed(KeyEvent e) {
        pressedKeys.add(e.getKeyCode());
    }

    /**
     * Processes a key release event.
     *
     * @param e The key event.
     */
    public void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());
    }
}
