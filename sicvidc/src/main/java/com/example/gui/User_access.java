    package com.example.gui;
    import com.example.gui.components.*;
    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;
    import java.awt.GridBagConstraints;
    import java.awt.GridBagLayout;
    import java.awt.Insets;
    import java.awt.event.MouseEvent;
    import java.awt.event.MouseListener;
    import javax.swing.ImageIcon;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    

    public class User_access extends JFrame {
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Arial",Font.BOLD,20);
        public int Search_Opcion;
       public User_access(){
            setSize(1224,1024);
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setMinimumSize(new Dimension(1024,700));
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            VisualElementsInterfaceImage BackgroundFrame = new VisualElementsInterfaceImage();
            BackgroundFrame.setLayout(new BorderLayout());
            add(BackgroundFrame);
            
            VisualElementsInterface rightelementblock = new VisualElementsInterface();
            rightelementblock.setLayout(new BorderLayout());
            rightelementblock.setPreferredSize(new Dimension(500,getHeight()));
            BackgroundFrame.add(rightelementblock,BorderLayout.EAST);

                VisualElementsInterface north_PU_elementinterface = new VisualElementsInterface();
                GridBagConstraints gbc_nortg_pu = new GridBagConstraints();
                north_PU_elementinterface.setLayout(new GridBagLayout());
                north_PU_elementinterface.setPreferredSize(new Dimension(500,300));
                north_PU_elementinterface.setOpaque(false);
                rightelementblock.add(north_PU_elementinterface,BorderLayout.NORTH);
                
                    JLabel Perfil_user_ofical_img = new JLabel();
                    ImageIcon Img_oficial = new ImageIcon("C:\\Users\\HP\\Documents\\java\\Projecto Sidvic\\sicvidc\\src\\main\\java\\com\\example\\assets\\perfil_police.jpg");
                    Perfil_user_ofical_img.setIcon(new ImageIcon(Img_oficial.getImage().getScaledInstance(160, 200, ABORT)));
                    Perfil_user_ofical_img.setPreferredSize(new Dimension(180,170));
                    gbc_nortg_pu.gridx = 0;
                    gbc_nortg_pu.gridy = 0;
                    north_PU_elementinterface.add(Perfil_user_ofical_img,gbc_nortg_pu);

                    VisualElementsInterface Suth_PU_elementinterface = new VisualElementsInterface();
                    Suth_PU_elementinterface.setLayout(new GridBagLayout());
                    Suth_PU_elementinterface.setOpaque(false);
                    GridBagConstraints gbc_PU_EI = new GridBagConstraints(); ;
                    rightelementblock.add(Suth_PU_elementinterface,BorderLayout.CENTER); 
                    gbc_PU_EI.insets = new Insets(10, 10, 40, 50);
                
                
                        LabelText ST_opcion1 = new LabelText();
                        ST_opcion1.setText("Datos Oficial");
                        ST_opcion1.setBackground(new Color(0,0,0,170));
                        ST_opcion1.setPreferredSize(new Dimension(250,60));
                        ST_opcion1.setOpaque(true);
                        gbc_PU_EI.gridx = 1;
                        gbc_PU_EI.gridx = 0;
                        Suth_PU_elementinterface.add(ST_opcion1,gbc_PU_EI);

                        LabelText ST_opcion2 = new LabelText();
                        ST_opcion2.setText("CEDULA");
                        ST_opcion2.setBackground(new Color(0,0,0,170));
                        ST_opcion2.setPreferredSize(new Dimension(250,60));
                        ST_opcion2.setOpaque(true);
                        gbc_PU_EI.gridx = 2;
                        gbc_PU_EI.gridx = 0;
                        Suth_PU_elementinterface.add(ST_opcion2,gbc_PU_EI);

                        LabelText ST_opcion3 = new LabelText();
                        ST_opcion3.setText("CARNET");
                        ST_opcion3.setBackground(new Color(0,0,0,170));
                        ST_opcion3.setPreferredSize(new Dimension(250,60));
                        ST_opcion3.setOpaque(true);
                        gbc_PU_EI.gridx = 3;
                        gbc_PU_EI.gridx = 0;
                        Suth_PU_elementinterface.add(ST_opcion3,gbc_PU_EI);

                        LabelText ST_opcion4 = new LabelText();
                        ST_opcion4.setText("MATRICULA");
                        ST_opcion4.setBackground(new Color(0,0,0,170));
                        ST_opcion4.setPreferredSize(new Dimension(250,60));
                        ST_opcion4.setOpaque(true);
                        gbc_PU_EI.gridx = 4;
                        gbc_PU_EI.gridx = 0;
                        Suth_PU_elementinterface.add(ST_opcion4,gbc_PU_EI);


                        ImageIcon imagenNormal = new ImageIcon("C:\\Users\\HP\\Documents\\java\\Projecto Sidvic\\sicvidc\\src\\main\\java\\com\\example\\assets\\Icon\\UI_CAPE.png");
                        ImageIcon imagenHover = new ImageIcon("C:\\Users\\HP\\Documents\\java\\Projecto Sidvic\\sicvidc\\src\\main\\java\\com\\example\\assets\\Icon\\UI_CAPE_open2.png");

                        ButtomIcon ST_opcion1_icon = new ButtomIcon();
                        gbc_PU_EI.gridx = 1;
                        gbc_PU_EI.gridx = 3;
                        Suth_PU_elementinterface.add(ST_opcion1_icon,gbc_PU_EI);

                            ST_opcion1_icon.addMouseListener(new MouseListener() {

                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    Search_Opcion = 1;
                                    database_search_engine date_oficial = new database_search_engine(User_access.this);
                                    date_oficial.setTitle("Datos oficial");
                                    date_oficial.setModal(true);
                                    date_oficial.setVisible(true);
                                    
                                    
                                
                                }
            
                                @Override
                                public void mousePressed(MouseEvent e) {
                                    ST_opcion1_icon.setIcon(new ImageIcon(imagenHover.getImage().getScaledInstance(70, 70, ABORT)));
                                }
            
                                @Override
                                public void mouseReleased(MouseEvent e) {
                                    ST_opcion1_icon.setIcon(new ImageIcon(imagenNormal.getImage().getScaledInstance(70, 70, ABORT)));
                                }
            
                                @Override
                                public void mouseEntered(MouseEvent e) {
                            

                                }
            
                                @Override
                                public void mouseExited(MouseEvent e) {
                            

                                }
                            });

                        ButtomIcon ST_opcion2_icon = new ButtomIcon();
                        gbc_PU_EI.gridx = 2;
                        gbc_PU_EI.gridx = 3;
                        Suth_PU_elementinterface.add(ST_opcion2_icon,gbc_PU_EI);

                        ST_opcion2_icon.addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                Search_Opcion = 2;
                            database_search_engine search_Saime = new database_search_engine(User_access.this);
                            search_Saime.setTitle("Cedula");
                            search_Saime.setModal(true);
                            search_Saime.setVisible(true);

                            
                                 }
            
                            @Override
                            public void mousePressed(MouseEvent e) {
                            // Acción a realizar cuando se presiona el mouse en el JLabel
                                ST_opcion2_icon.setIcon(new ImageIcon(imagenHover.getImage().getScaledInstance(70, 70, ABORT)));
                        
                                }
            
                            @Override
                            public void mouseReleased(MouseEvent e) {
                            // Acción a realizar cuando se suelta el mouse en el JLabel
                                ST_opcion2_icon.setIcon(new ImageIcon(imagenNormal.getImage().getScaledInstance(70, 70, ABORT)));

                                }
            
                            @Override
                            public void mouseEntered(MouseEvent e) {
                            // Cambiar la imagen de fondo cuando el mouse entra en el JLabel

                                }
            
                            @Override
                            public void mouseExited(MouseEvent e) {
                            // Cambiar la imagen de fondo a la imagen normal cuando el mouse sale del JLabel

                                }
                            });

                        

                        
                
                        ButtomIcon ST_opcion3_icon = new ButtomIcon();
                        gbc_PU_EI.gridx = 3;
                        gbc_PU_EI.gridx = 3;
                        Suth_PU_elementinterface.add(ST_opcion3_icon,gbc_PU_EI);

                        ST_opcion3_icon.addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                Search_Opcion = 3;
                            database_search_engine search_CICPC = new database_search_engine(User_access.this);
                            
                            search_CICPC.setTitle("carnet de conducir");
                            search_CICPC.setModal(true);
                            search_CICPC.setVisible(true);

                                 }
            
                            @Override
                            public void mousePressed(MouseEvent e) {
                            // Acción a realizar cuando se presiona el mouse en el JLabel
                                ST_opcion3_icon.setIcon(new ImageIcon(imagenHover.getImage().getScaledInstance(70, 70, ABORT)));
                        
                                }
            
                            @Override
                            public void mouseReleased(MouseEvent e) {
                            // Acción a realizar cuando se suelta el mouse en el JLabel
                                ST_opcion3_icon.setIcon(new ImageIcon(imagenNormal.getImage().getScaledInstance(70, 70, ABORT)));

                                }
            
                            @Override
                            public void mouseEntered(MouseEvent e) {
                            // Cambiar la imagen de fondo cuando el mouse entra en el JLabel

                                }
            
                            @Override
                            public void mouseExited(MouseEvent e) {
                            // Cambiar la imagen de fondo a la imagen normal cuando el mouse sale del JLabel

                                }
                            });
                
                        ButtomIcon ST_opcion4_icon = new ButtomIcon();
                        gbc_PU_EI.gridx = 4;
                        gbc_PU_EI.gridx = 3;
                        Suth_PU_elementinterface.add(ST_opcion4_icon,gbc_PU_EI);

                        ST_opcion4_icon.addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                Search_Opcion = 4;
                                database_search_engine search_Matricula = new database_search_engine(User_access.this);
                                search_Matricula.setTitle("Matricula");
                                search_Matricula.setModal(true);
                                search_Matricula.setVisible(true);

                            
                                }
            
                             @Override
                             public void mousePressed(MouseEvent e) {
                            // Acción a realizar cuando se presiona el mouse en el JLabel
                                 ST_opcion4_icon.setIcon(new ImageIcon(imagenHover.getImage().getScaledInstance(70, 70, ABORT)));
                        
                                }
            
                                @Override
                                public void mouseReleased(MouseEvent e) {
                            // Acción a realizar cuando se suelta el mouse en el JLabel
                                 ST_opcion4_icon.setIcon(new ImageIcon(imagenNormal.getImage().getScaledInstance(70, 70, ABORT)));

                                }
            
                                @Override
                                public void mouseEntered(MouseEvent e) {
                            // Cambiar la imagen de fondo cuando el mouse entra en el JLabel

                                }
            
                             @Override
                                public void mouseExited(MouseEvent e) {
                            // Cambiar la imagen de fondo a la imagen normal cuando el mouse sale del JLabel

                             }
                            });

                
                    

            VisualElementsInterfaceImage centerelementblock = new VisualElementsInterfaceImage();
            BackgroundFrame.add(centerelementblock,BorderLayout.CENTER);
            centerelementblock.imagebackground = new ImageIcon("").getImage();
            centerelementblock.setOpaque(false);

            
                VisualElementsInterfaceImage sicvidc = new VisualElementsInterfaceImage();
                sicvidc.imagebackground = new ImageIcon("C:\\Users\\HP\\Documents\\java\\Projecto Sidvic\\sicvidc\\src\\main\\java\\com\\example\\assets\\PUI\\sicvidc.png").getImage();
                sicvidc.setOpaque(false);
                sicvidc.setPreferredSize(new Dimension(300, 300));
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.CENTER;
                centerelementblock.setLayout(new GridBagLayout());
                centerelementblock.add(sicvidc, gbc);
                
                VisualElementsInterface backgroundtransparentecenter = new VisualElementsInterface();
                backgroundtransparentecenter.setBackground(new Color(0,0,0,180));
                backgroundtransparentecenter.setPreferredSize(new Dimension(500,85));
                backgroundtransparentecenter.setOpaque(true);
                gbc.gridy = 1;
                centerelementblock.add(backgroundtransparentecenter, gbc);

                    LabelText north_tiitlesicvidc = new LabelText();
                    north_tiitlesicvidc.setText("Sistema Integral de Control de Vehículos,");
                    backgroundtransparentecenter.add(north_tiitlesicvidc,BorderLayout.NORTH);

                    LabelText center_tiitlesicvidc = new LabelText();
                    center_tiitlesicvidc.setText("Infracciones y Datos Criminales");
                    backgroundtransparentecenter.add(center_tiitlesicvidc,BorderLayout.CENTER);

                    
                

            
        }
        
        
        

        
            
        }
        

        
        

