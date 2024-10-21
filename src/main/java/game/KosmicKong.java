/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package game;

import components.MovementComponent;
import displays.HomeScreen;
import game.InputHandler;
import utilities.KeyInput;
import entities.*;
import strategies.*;

/**
 *
 * @author Jamie Roberson
 */
public class KosmicKong {

    public static void main(String[] args) {
        
        
        KeyInput keyinput = new KeyInput();
        InputHandler inputhandler = new InputHandler(keyinput);
        
        HomeScreen homescreen = new HomeScreen(keyinput);
        // runs GUI in an async queue
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                homescreen.setVisible(true);
                homescreen.requestFocusInWindow(); 
                
            }
        });
        
        
        // finding screen dimension
        int w = homescreen.getWidth();
        int h = homescreen.getHeight();
        System.out.println("W: "+w+" H: "+h);
        
        
        // testing getting player in center of screen
        Entity player = new Player();
        player.getComponent(MovementComponent.class).setPosition(w/2, h/2);
        PlayerMovementStrategy playerstrat = new PlayerMovementStrategy(player,inputhandler);
        player.setMovementStrategy(playerstrat);
        
        System.out.println("GUI is running.");
        
        
        // main game loop
        while(true){
            homescreen.getGamePanel().updateEntities();
            homescreen.getGamePanel().repaint();
            
            // sleep to maintain 60 fps
            try{
                Thread.sleep(16);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
}
