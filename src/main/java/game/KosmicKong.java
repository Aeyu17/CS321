/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package game;

import displays.HomeScreen;
import game.InputHandler;
import utilities.KeyInput;
/**
 *
 * @author Jamie Roberson
 */
public class KosmicKong {

    public static void main(String[] args) {
        
        
        KeyInput keyinput = new KeyInput();
        InputHandler inputhandler = new InputHandler(keyinput);
        
        
        // runs GUI in an async queue
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeScreen homescreen = new HomeScreen(keyinput);
                homescreen.setVisible(true);
                homescreen.requestFocusInWindow(); 
                
            }
        });
        
        System.out.println("GUI is running.");
        
        // simulate player movement
        int playerX = 0;
        
        // main game loop
        while(true){
            if(inputhandler.isLeftPressed()){
                playerX-=1;
                System.out.println("player moves left to: " + playerX);
            }
            if(inputhandler.isRightPressed()){
                playerX+=1;
                System.out.println("player moves right to: " + playerX);
            }
            
            // sleep to maintain 60 fps
            try{
                Thread.sleep(16);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
}
