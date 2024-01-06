package com.example.gui.components;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer;

public class AIE_interfaceUser extends VisualElementsInterfaceImage {
    private int panelWidth;
    private Timer expandTimer;
    
     AIE_interfaceUser() {
        
        panelWidth = 20; // Ancho inicial del panel
        setPreferredSize(new Dimension(panelWidth, getHeight()));
        

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                expandPanel();
            }
        });
    }

    private void expandPanel() {
        expandTimer = new Timer(10, e -> {
            panelWidth += 5; // Ajustar la velocidad de la animación cambiando este valor
            if (panelWidth >= 200) {
                expandTimer.stop(); // Detener el temporizador cuando el panel alcanza el ancho deseado
            }
            setPreferredSize(new Dimension(panelWidth, getHeight()));
            revalidate(); // Volver a validar el diseño para reflejar los cambios
            repaint(); // Volver a pintar el panel
        });
        expandTimer.start();
    }
    
}
