/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gui.components;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
Información de identificación: Como nombres, fechas de nacimiento, números de identificación personal 
(como el número de seguro social o el número de identificación del contribuyente), y detalles de contacto.

Información física: Como la altura, el peso, el color del cabello y de los ojos, y otras características
físicas identificables.

Información de antecedentes penales: Como los cargos criminales, las condenas, las sentencias y los 
detalles de cualquier tiempo pasado en prisión.

Información de vehículos: Como los números de matrícula y los detalles del vehículo.

Información de contacto: Como direcciones residenciales y números de teléfono.
*/

/**
 *
 * @author Jorge
 */

public class ScrollPersonalInf extends JPanel{
    public String Nombre,Apellido,Cedula,Edad,Estado_Civil,Fecha_N,Nacionalidad,Lugar_Residencia,Color_Cabello,Color_Ojos,
               Color_Piel,Peso,Marca_Ident,Altura,Genero,Numero_Contacto,Antecedentes,
               InfVeiculo,Propiedades;
    
    public ScrollPersonalInf(){
        setBackground(new Color(0,0,0,0));
        setOpaque(true);
        
        setLayout(new GridBagLayout());
        setBackground(new Color(0,0,0,150));
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        
       Nombre = "Anna Paula"; 
       JLabel nombre = new JLabel("Nombre: "+Nombre);
       nombre.setForeground(Color.white);
       add(nombre,gbc);
       
       Apellido = "Gaspacho Rojo"; 
       JLabel apellido = new JLabel("Apellidos: "+Apellido);
       apellido.setForeground(Color.white);
       add(apellido,gbc);
       
       Cedula = "27.886.312"; 
       JLabel cedula = new JLabel("Cedula: "+Cedula);
       cedula.setForeground(Color.white);
       add(cedula,gbc);
       
       Fecha_N = "10/09/1999"; 
       JLabel fecha_n = new JLabel("Fecha de Nacimiento: "+Fecha_N);
       fecha_n.setForeground(Color.white);
       add(fecha_n,gbc);
       
       Edad = "25 Años"; 
       JLabel edad = new JLabel("Edad: "+Edad);
       edad.setForeground(Color.white);
       add(edad,gbc);
       
       Estado_Civil = "Casado"; 
       JLabel estado_civil = new JLabel("Estado Civil: "+Estado_Civil);
       estado_civil.setForeground(Color.white);
       add(estado_civil,gbc);
       
       
       Genero = "Femenino"; 
       JLabel genero = new JLabel("Genero: "+Genero);
       genero.setForeground(Color.white);
       add(genero,gbc);
       
       
       Nacionalidad = "Venezolana"; 
       JLabel nacionalidad = new JLabel("Nacionalidad: "+Nacionalidad);
       nacionalidad.setForeground(Color.white);
       add(nacionalidad,gbc);
       
      
       Lugar_Residencia = "Caracas, Distrito Capital Av. Santiago De León La California"; 
       JLabel lugar_residencia = new JLabel("Direccion: "+Lugar_Residencia);
       lugar_residencia.setForeground(Color.white);
       add(lugar_residencia,gbc);
        
       Color_Piel = "Blanco";
       JLabel color_piel = new JLabel("Color de piel: "+ Color_Piel);
       color_piel.setForeground(Color.white);
       add(color_piel,gbc);
       
       Color_Cabello = "Rubio";
       JLabel color_cabello = new JLabel("Color de cabello: "+ Color_Cabello);
       color_cabello.setForeground(Color.white);
       add(color_cabello,gbc);
       
       Color_Ojos = "Blanco";
       JLabel color_ojos = new JLabel("Color de ojos: "+ Color_Ojos);
       color_ojos.setForeground(Color.white);
       add(color_ojos,gbc);
       
       Peso = "75.5kg";
       JLabel peso = new JLabel("Peso: "+ Peso);
       peso.setForeground(Color.white);
       add(peso,gbc);
       
       Altura = "1.65M";
       JLabel altura = new JLabel("Color de piel: "+ Altura);
       altura.setForeground(Color.white);
       add(altura,gbc);
       
       Marca_Ident = "cicatrices, tatuajes";
       JLabel marca_ident = new JLabel("Marca de Identidicacion: "+ Marca_Ident);
       marca_ident.setForeground(Color.white);
       add(marca_ident,gbc);
       
       Numero_Contacto = "0414-643-4816";
       JLabel numero_contacto = new JLabel("Color de piel: "+ Numero_Contacto);
       numero_contacto.setForeground(Color.white);
       add(numero_contacto,gbc);
       
       InfVeiculo = "Posee";
       JLabel infVeiculo = new JLabel("Vehiculo: "+ InfVeiculo);
       infVeiculo.setForeground(Color.white);
       add(infVeiculo,gbc);
       
       Propiedades = "no Posee";
       JLabel propiedades = new JLabel("Propiedades: "+ Propiedades);
       propiedades.setForeground(Color.white);
       add(propiedades,gbc);
       
       Antecedentes = "posee";
       JLabel antecedentes = new JLabel("Antecdentes: "+ Antecedentes);
       antecedentes.setForeground(Color.white);
       add(antecedentes,gbc);
    }
}
