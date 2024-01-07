/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gui.components;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Jorge
 */
public class North_Background extends Transparent_Panel{
    public North_Background(){
        
        setOpaque(false);
        setBorder(null);
        setLayout(new BorderLayout(5,5));
        setPreferredSize(new Dimension(400,230));
        
        
       Transparent_Panel TransPanelWest = new Transparent_Panel();
       
       TransPanelWest.setLayout(new BorderLayout());
       TransPanelWest.setPreferredSize(new Dimension(200,getHeight()));
       add(TransPanelWest,BorderLayout.WEST);
       
       Transparent_Panel TransPanelCenter = new Transparent_Panel();
       TransPanelCenter.setLayout(new GridBagLayout());
       GridBagConstraints Cons = new GridBagConstraints();
       
       Cons.fill = GridBagConstraints.HORIZONTAL;
       Cons.anchor = GridBagConstraints.WEST;
       Cons.insets = new Insets(10,20,10,10);
       Cons.weightx = 1.0;
       
       Cons.gridx = 0;
       Cons.gridy = 0;
       String nombres = "Anna Paula"; 
       JLabel Nombre = new JLabel("Nombre: "+nombres);
       Nombre.setForeground(Color.white);
       TransPanelCenter.add(Nombre,Cons);
       
       Cons.gridx = 0;
       Cons.gridy = 1;
       String apellidos = "Gaspacho Rojo"; 
       JLabel Apellidos = new JLabel("Apellidos: "+apellidos);
       Apellidos.setForeground(Color.white);
       TransPanelCenter.add(Apellidos,Cons);
       
       Cons.gridx = 1;
       Cons.gridy = 0;
       String cedula = "27.886.312"; 
       JLabel Cedula = new JLabel("Cedula: "+cedula);
       Cedula.setForeground(Color.white);
       TransPanelCenter.add(Cedula,Cons);
       
       Cons.gridx = 1;
       Cons.gridy = 1;
       String estado_civil = "Casado"; 
       JLabel Estado_Civil = new JLabel("Estado Civil: "+estado_civil);
       Estado_Civil.setForeground(Color.white);
       TransPanelCenter.add(Estado_Civil,Cons);
       
       Cons.gridx = 0;
       Cons.gridy = 2;
       String fecha_n = "10/09/1999"; 
       JLabel Fecha_N = new JLabel("Fecha de Nacimiento: "+fecha_n);
       Fecha_N.setForeground(Color.white);
       TransPanelCenter.add(Fecha_N,Cons);
       
       Cons.gridx = 0;
       Cons.gridy = 3;
       String genero = "Femenino"; 
       JLabel Genero = new JLabel("Genero: "+genero);
       Genero.setForeground(Color.white);
       TransPanelCenter.add(Genero,Cons);
       
       Cons.gridx = 1;
       Cons.gridy = 2;
       String nacionalidad = "Venezolana"; 
       JLabel Nacionalidad = new JLabel("Nacionalidad: "+nacionalidad);
       Nacionalidad.setForeground(Color.white);
       TransPanelCenter.add(Nacionalidad,Cons);
       
       Cons.gridx = 1;
       Cons.gridy = 3;
       String res_act = "Caracas, Distrito Capital Av. Santiago De León La California"; 
       JLabel Res_Act = new JLabel("Direccion: "+res_act);
       Res_Act.setForeground(Color.white);
       TransPanelCenter.add(Res_Act,Cons);
       
       
       
       
       add(TransPanelCenter,BorderLayout.CENTER);
       
       
       
        ImageIcon img = new ImageIcon("Images/images.jpg");
        JLabel Foto = new JLabel("",SwingConstants.CENTER);
        //Cedula.setSize(200, 200);
        Foto.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        TransPanelWest.add(Foto,BorderLayout.CENTER);
    }
}
