package game;

import entities.Entity;
import javax.swing.JComponent;
import components.RenderComponent;
import java.awt.Graphics;

/**
 *
 * @author Tech
 */
public class GamePanel extends JComponent {
    
    @Override
    protected void paintComponent (Graphics g) { 
        super.paintComponent(g);
        for (Entity entity : Entity.getEntities()) {
            RenderComponent renderComponent = entity.getComponent(RenderComponent.class);
            if (renderComponent!=null) {
                renderComponent.render(g);
            }
        }
    }
    public void updateEntities() {
        for (Entity entity : Entity.getEntities()) {
            entity.update();
        }
    }
}
