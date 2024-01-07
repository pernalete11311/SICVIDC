package com.example.gui.components;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class Fondo extends JPanel {
    
    private Image FondoDelPanel;
    
    public Fondo(String filename){
        this(new ImageIcon(filename).getImage());
    }
    
    public Fondo(Image Img){
        FondoDelPanel = Img;
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g){
    g.drawImage(FondoDelPanel, 0, 0, getWidth(), getHeight(), this);
    }
}
