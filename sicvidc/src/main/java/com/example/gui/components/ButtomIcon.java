package com.example.gui.components;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ButtomIcon extends JButton {
    
    public ButtomIcon(){
        
        setPreferredSize(new Dimension(70,70));
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Documents\\java\\Projecto Sidvic\\sicvidc\\src\\main\\java\\com\\example\\assets\\Icon\\UI_CAPE.png");
        setIcon(new ImageIcon(img.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        

        

    }
    
}
