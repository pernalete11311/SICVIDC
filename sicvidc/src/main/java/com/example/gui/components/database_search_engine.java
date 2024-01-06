package com.example.gui.components;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.example.gui.User_access;

public class database_search_engine extends JDialog {
    private User_access userAccess;
    public database_search_engine(User_access userAccess){
        this.userAccess = userAccess;
        GridBagConstraints gbc = new GridBagConstraints();
        setModal(true);
        setLayout(new GridBagLayout());
        setSize(500,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel Search = new JLabel();
        Search.setText("Buscar");
        Search.setPreferredSize(new Dimension(50,50));
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(Search,gbc);

        JTextField DS_TEXT = new JTextField();
        DS_TEXT.setPreferredSize(new Dimension(250,50));
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(DS_TEXT,gbc);

        JButton accept = new JButton();
        accept.setPreferredSize(new Dimension(100,50));
        accept.setText("Aceptar");
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(accept,gbc);

            accept.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                    if(userAccess.Search_Opcion == 1){
                        
                    }
                    else if (userAccess.Search_Opcion == 2) {
                       
                        
                    }
                    else if(userAccess.Search_Opcion == 3){

                    }
                    else if(userAccess.Search_Opcion == 4){

                    }
                }
                
                
            });




        
    }

    
    
}
