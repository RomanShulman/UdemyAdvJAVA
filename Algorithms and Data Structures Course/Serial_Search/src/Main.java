
import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NewJFrame Fr = new NewJFrame();
        

        Fr.setVisible(true);
        Fr.setLocationRelativeTo(null);        
        Fr.setSize(530, 445);
        Fr.getContentPane().setBackground(Color.white);
        Fr.setResizable(false);
    }
    
}
