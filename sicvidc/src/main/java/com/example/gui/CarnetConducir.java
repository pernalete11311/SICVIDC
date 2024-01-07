/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gui;

import com.example.gui.components.Fondo;
import com.example.gui.components.VisualElementsInterface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jorge
 */
public class CarnetConducir extends JFrame {
    public CarnetConducir(){
        
        Panel_Carnet panel = new Panel_Carnet("sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\FondoDeRed1.jpg");
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        setMinimumSize(new Dimension(1020,720));
        setMaximumSize(new Dimension(1020,720));      
        //setResizable(false);
        pack();
        
        add(panel);
    }
        
        
}

class Panel_Carnet extends Fondo{
    String Nombre,Apellido,Cedula,fecha_expedicion,fecha_nacimiento,fecha_vencimiento,Sexo,limitaciones,Tipo,Nro;
    public Panel_Carnet(String filename) {
        super(filename);
        setLayout(new GridBagLayout());
        
        ImageIcon img = new ImageIcon("sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\carnet_de_conducir_Luis _Garavitos_001.png");
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
      gbc.gridx = 1;  
      Sexo = "Masculino";
      JLabel sexo = new JLabel("Sexo: "+Sexo);
      sexo.setForeground(Color.white);
      panel2.add(sexo,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 0;  
      limitaciones = "Ninguna";
      JLabel Limitaciones = new JLabel("Estado Civil: "+limitaciones);
      Limitaciones.setForeground(Color.white);
      panel2.add(Limitaciones,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 0;  
      fecha_expedicion = "26/09/2017";
      JLabel expedicion = new JLabel("Fecha de Vencimiento: "+fecha_expedicion);
      expedicion.setForeground(Color.white);
      panel2.add(expedicion,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 1; 
      fecha_vencimiento = "25/02/2027";
      JLabel vencimiento = new JLabel("Fecha de Expedicion: "+fecha_vencimiento);
      vencimiento.setForeground(Color.white);
      panel2.add(vencimiento,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 1; 
      Tipo = "TERCERA 3";
      JLabel tipo = new JLabel("Tipo: "+Tipo);
      tipo.setForeground(Color.white);
      panel2.add(tipo,gbc);
      
      gbc.gridx = 1;
      gbc.gridx = 0; 
      Nro = "TERCERA 3";
      JLabel nro = new JLabel("Nro Carnet: "+Nro);
      nro.setForeground(Color.white);
      panel2.add(nro,gbc);
      
      
      
      gbc.gridwidth = 2;
      VisualElementsInterface panel2_1 = new VisualElementsInterface();
      panel2_1.setPreferredSize(new Dimension(500,30));
      panel2_1.setLayout(new GridBagLayout());
      
        JButton boton = new JButton("Inf.Personal");
        panel2_1.add(boton);

      panel2.add(panel2_1,gbc);
    }
    
    
}