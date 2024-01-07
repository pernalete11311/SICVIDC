package com.example;
import com.example.gui.components.Panel_Principal;

import java.awt.Dimension;
import javax.swing.JFrame;
public class Main extends JFrame{
    private Main(){
         Panel_Principal panel = new Panel_Principal("sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\Fondo1.jpg");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setSize(1224,1024);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1024,700));    
        pack();
        add(panel);
        
    }
    
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
    }
}