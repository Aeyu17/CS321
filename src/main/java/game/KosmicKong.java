/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package game;

import displays.HomeScreen;

/**
 *
 * @author Jamie Roberson
 */
public class KosmicKong {

    public static void main(String[] args) {
        
        // runs GUI in an async queue
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
        
        System.out.println("GUI is running.");
    }
}
