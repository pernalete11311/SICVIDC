/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import com.example.gui.components.Fondo;
import com.example.gui.components.North_Background;
import com.example.gui.components.ScrollPersonalInf;
import com.example.gui.components.Transparent_Panel;


/**
 *
 * @author Jorge
 */
public class Saime_Database extends JFrame{
    
    
    public Saime_Database(){
        setSize(1224,1024);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(1024,700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        Fondo background_Saime = new Fondo("C:\\Users\\HP\\Desktop\\en caso de emergencia\\Nueva carpeta\\sicvidc\\sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\FondoDeRed1.jpg");
        background_Saime.setPreferredSize(new Dimension(getWidth(),getHeight()));
        background_Saime.setLayout(new BorderLayout(5,5)); 
        add(background_Saime);
        
        North_Background transPanel_north = new North_Background();
        transPanel_north.setPreferredSize(new Dimension(getWidth(),230));
        background_Saime.add(transPanel_north,BorderLayout.NORTH);
        
        JButton button = new JButton("Cedula");
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(Color.decode("#FFFFFF"));
        button.setForeground(Color.BLACK);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton button1 = new JButton("Vehiculos");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBackground(Color.decode("#FFFFFF"));
        button1.setForeground(Color.BLACK);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton button2 = new JButton("LIC.Conducir");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBackground(Color.decode("#FFFFFF"));
        button2.setForeground(Color.BLACK);
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton button3 = new JButton("Antecedentes");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBackground(Color.decode("#FFFFFF"));
        button3.setForeground(Color.BLACK);
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        
        gbc.gridx = 0;
        gbc.gridy = 0 ;        
        Transparent_Panel transPanel_East = new Transparent_Panel();
        transPanel_East.setLayout(new GridBagLayout());
        transPanel_East.add(button,gbc);
        gbc.gridy = 1 ;
        transPanel_East.add(button1,gbc);
        gbc.gridy = 2 ;
        transPanel_East.add(button2,gbc);
        gbc.gridy = 3 ;
        transPanel_East.add(button3,gbc);
        
        background_Saime.add(transPanel_East,BorderLayout.EAST);
        transPanel_East.setPreferredSize(new Dimension(200,getHeight()));
        
        ScrollPersonalInf panelInfo = new ScrollPersonalInf();
        JScrollPane transPanel_Center = new JScrollPane(panelInfo);
        transPanel_Center.setBackground(new Color(0,0,0,150));
        background_Saime.add(transPanel_Center,BorderLayout.CENTER); 
        
    }

}
