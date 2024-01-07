package com.example.gui.components;

import java.awt.BorderLayout;



/**
 *
 * @author Jorge
 */
public class Panel_Principal extends Fondo {
    
    public Panel_Principal(String fileImage){
        
        super(fileImage);
        setLayout(new BorderLayout());
        Panel_West Panel_Derecho = new Panel_West();
        add(Panel_Derecho,BorderLayout.EAST);
        
    }
    
    
}