/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gui;

import com.example.gui.components.Fondo;
import com.example.gui.components.VisualElementsInterface;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Jorge
 */
public class Cedula extends JFrame {
    public Cedula(){
        Panel_Cedula panel = new Panel_Cedula("sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\FondoDeRed1.jpg");
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        setMinimumSize(new Dimension(1020,720));
        setMaximumSize(new Dimension(1020,720));      
        //setResizable(false);
        pack();
        
        add(panel);
    }
}

class Panel_Cedula extends Fondo{
    String Nombre,Apellido,Cedula,fecha_nacimiento,estado_civil,Nacionalidad;
    public Panel_Cedula(String filename) {
        super(filename);
        setLayout(new GridBagLayout());
        
        ImageIcon img = new ImageIcon("sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\C.I Luis Alfredo .png");
        JLabel cedula = new JLabel();
        cedula.setIcon(new ImageIcon(img.getImage().getScaledInstance(500, 250, Image.SCALE_SMOOTH)));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridx = 0;
                
        
        VisualElementsInterface panel1 = new VisualElementsInterface();
        panel1.setPreferredSize(new Dimension(500,250));
        panel1.add(cedula);
        add(panel1,gbc);
        
        gbc.gridx = 1;
        gbc.gridx = 0;
        VisualElementsInterface panel2 = new VisualElementsInterface();
        panel2.setLayout(new GridBagLayout());
        panel2.setPreferredSize(new Dimension(600,300));
        add(panel2,gbc); 
        
      gbc.insets = new Insets(10, 10, 10, 10);  
      gbc.gridx = 0;
      gbc.gridx = 0;  
      Nombre = "Luis Alfredo";
      JLabel nombre = new JLabel("Nombre: "+Nombre);
      nombre.setForeground(Color.white);
      panel2.add(nombre,gbc);
      
      gbc.gridx = 0;
      gbc.gridx = 1;  
      Apellido = "Garavoto Cubillos";
      JLabel apellido = new JLabel("Apellido: "+Apellido);
      apellido.setForeground(Color.white);
      panel2.add(apellido,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 0;  
      Nacionalidad = "Venezolano";
      JLabel nacionalidad = new JLabel("Nacionalodad: "+Nacionalidad);
      nacionalidad.setForeground(Color.white);
      panel2.add(nacionalidad,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 1;  
      Cedula = "8.539.541";
      JLabel CI = new JLabel("Cedula: "+Cedula);
      CI.setForeground(Color.white);
      panel2.add(CI,gbc);
      
      gbc.gridx = 0;
      gbc.gridx = 1;  
      fecha_nacimiento = "20/01/1957";
      JLabel nacimiento = new JLabel("Fecha de nacimiento: "+fecha_nacimiento);
      nacimiento.setForeground(Color.white);
      panel2.add(nacimiento,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 0;  
      estado_civil = "Soltero";
      JLabel estado = new JLabel("Estado Civil: "+estado_civil);
      estado.setForeground(Color.white);
      panel2.add(estado,gbc);
      
      gbc.gridwidth = 2;
      VisualElementsInterface panel2_1 = new VisualElementsInterface();
      panel2_1.setPreferredSize(new Dimension(500,30));
      panel2_1.setLayout(new GridBagLayout());
      
        JButton boton = new JButton("Inf.Personal");
        panel2_1.add(boton);
      panel2.add(panel2_1,gbc);
    }
    
    
}
