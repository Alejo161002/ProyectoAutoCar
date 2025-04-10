/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import proyecto.capaGrafica.FrmMenu;
import proyecto.capaLogica.Agencia;

/**
 *
 * @autores 
 * Ricardo Hernández Salas, cedula 119430725
 * Jose Alejando Jiménez Ugalde, cedula 119400931
 */
public class MainAutoCar {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
               FrmMenu frmMenu = new FrmMenu();
               frmMenu.setVisible(true);
               frmMenu.setLocationRelativeTo(null);
               Agencia agencia = new Agencia();
               
    }
    
}
