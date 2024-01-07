package com.example.gui.components;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.example.gui.User_access;


public class Panel_West extends VisualElementsInterface {
    public Panel_West(){
        
        
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400,getHeight()));
        
       
        ImageIcon img = new ImageIcon("sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\Police_SICVIDC.png");
        JLabel IconSICVIDC = new JLabel();
        IconSICVIDC.setSize(300, 300);
        IconSICVIDC.setIcon(new ImageIcon(img.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        JPanel Panel_NORTH = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Panel_NORTH.setOpaque(false);
        Panel_NORTH.add(IconSICVIDC);
        add(Panel_NORTH,BorderLayout.NORTH);
        
        // Crear un nuevo panel para los campos de usuario y contraseña
        JPanel Panel_Center = new JPanel(new BorderLayout());
        Panel_Center.setOpaque(false);
        
        JPanel P_User_Password = new JPanel(new GridBagLayout());
        P_User_Password.setOpaque(true);
        //P_User_Password.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        P_User_Password.setBackground(new Color(255,255,255,200));
        P_User_Password.setBorder(BorderFactory.createLineBorder(new Color(10,10,10,100)));

        
        JLabel userLabel = new JLabel("Usuario");
        JTextField userField = new JTextField();
        userField.setPreferredSize(new Dimension(130,20));


        JLabel passwordLabel = new JLabel("Contraseña");
        JTextField passwordField = new JTextField();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        P_User_Password.add(userLabel, gbc);

        gbc.gridy = 1;
        P_User_Password.add(userField, gbc);

        gbc.gridy = 2;
        P_User_Password.add(passwordLabel, gbc);

        gbc.gridy = 3;
        P_User_Password.add(passwordField, gbc);
        
        JButton Entrar = new JButton("Entrar");
        
        JPanel Boton_Entrar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Boton_Entrar.setOpaque(false);
        Boton_Entrar.add(Entrar);
        Panel_Center.add(Boton_Entrar,BorderLayout.CENTER);
        
        Panel_Center.add(P_User_Password, BorderLayout.NORTH);
        add(Panel_Center, BorderLayout.CENTER);
        
        Entrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String Usuario = userField.getText();
                String Contraseña = passwordField.getText();
                
                //if(usuarioCorrecto(Usuario) && contrasenaCorrecta(Contraseña)){
                User_access acceso = new User_access();
                acceso.setVisible(true);
                SwingUtilities.getWindowAncestor(Panel_Center).dispose();
                
                //}
                
            }
        });
    }
    
    boolean usuarioCorrecto(String usuario) {
    return usuario.equals("Abbisats");
}

boolean contrasenaCorrecta(String contrasena) {
    return contrasena.equals("Fdn3010$%");
}
}
