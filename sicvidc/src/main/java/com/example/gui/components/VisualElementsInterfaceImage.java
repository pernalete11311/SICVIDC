package com.example.gui.components;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class VisualElementsInterfaceImage extends JPanel{
        public Image imagebackground;
        public VisualElementsInterfaceImage(){
        imagebackground = new ImageIcon("C:\\Users\\HP\\Documents\\java\\Projecto Sidvic\\sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\_b35bcf88-98fb-47c4-9f2c-549d777985a5.jpg").getImage();

        }
        @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagebackground, 0, 0, getWidth(), getHeight(), this);
    }

    }
