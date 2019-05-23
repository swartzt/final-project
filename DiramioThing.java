
package diramiothing;

import DLibX.DConsole;
import DLibX.*;
import java.awt.event.KeyEvent;
import java.awt.Event;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class DiramioThing {
    
    public static void main(String[] args) {

        DConsole dc;
        dc = new DConsole();

        int dcX = 350;
        int dcY = 200;

        while (true) {
            dc.clear();
             
            // --- MOVE THINGS ------------
            
                if (dc.isKeyPressed('d')) {
                
                dcX++;
                dcX++;
                dcX++;
                
            }
                
            if (dc.isKeyPressed('a')) {
                do{
                dcX--;
                dcX--;
                dcX--;
                } while (dcX <= 899);
            }
            if (dc.isKeyPressed('w')) {
                do{
                dcY--;
                dcY--;
                dcY--;
                } while (dcY <= 599);
            }
            if (dc.isKeyPressed('s')) {
                do{
                dcY++;
                dcY++;
                dcY++;
                } while (dcY <= 599);
            }
            
            
            
            
            

            // ---- DRAW THINGS -------
            
            dc.fillEllipse(dcX, dcY, 50, 50);
            
            
            dc.redraw();
            dc.pause(20);
            String size = dc.getCanvas().getSize().toString();  
            dc.setTitle(size);
          
        }
    }

    
}
