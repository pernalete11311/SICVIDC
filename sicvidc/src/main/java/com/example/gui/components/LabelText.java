package com.example.gui.components;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;



public class LabelText extends JLabel {
    public LabelText(){
        setOpaque(false);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0),10));
        setHorizontalAlignment(SwingConstants.CENTER);
        Font font = new Font("Arial",Font.BOLD,20);
        setFont(font);
    }
    
}
