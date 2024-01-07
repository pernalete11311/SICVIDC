package com.example;
import com.example.gui.components.Panel_Principal;

import java.awt.Dimension;
import javax.swing.JFrame;
public class Main extends JFrame{
    private Main(){
         Panel_Principal panel = new Panel_Principal("C:\\Users\\HP\\Desktop\\en caso de emergencia\\Nueva carpeta\\sicvidc\\sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\_b35bcf88-98fb-47c4-9f2c-549d777985a5.jpg");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setMinimumSize(new Dimension(1020,720));
        setMaximumSize(new Dimension(1020,720));      
        //setResizable(false);
        pack();
        
        add(panel);
        
    }
    
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
    }
}