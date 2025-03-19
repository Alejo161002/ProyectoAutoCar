/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

/**
 *
 * @autores 
 * Ricardo Hernández Salas, cedula 119430725
 * Jose Alejando Jiménez Ugalde, cedula 119400931
 */
public class Agencia {
    private Alquiler[][] alquileres; 
    private Auto[] autos; 

    public Agencia() {
        alquileres = new Alquiler [10][5];
        llenarAutos();
    }
    private void llenarAutos(){
        autos = new Auto[10];
        autos[0] = new Auto(1000, "Toyota Corolla", 2010, TipoAuto.AUTOMOVIL, "", 10000, true);
        autos[1] = new Auto(2000, "Honda CRV", 2005, TipoAuto.DOBLE_TRACCION, "", 200000, true);
        autos[2] = new Auto(3000, "Hiunday Elantra", 2009, TipoAuto.AUTOMOVIL, "", 20000, true);
        autos[3] = new Auto(4000, "Honda Accord", 2008, TipoAuto.AUTOMOVIL, "", 100000, true);
        autos[4] = new Auto(5000, "Nissan Xtrail", 2004, TipoAuto.DOBLE_TRACCION, "", 100000, true);
        autos[5] = new Auto(6000, "Nissan Pathfinder", 2005, TipoAuto.DOBLE_TRACCION, "", 50000, false);
        autos[6] = new Auto(7000, "Toyota Yaris", 2011, TipoAuto.AUTOMOVIL, "", 5000, true);
        autos[7] = new Auto(8000, "Nissan Pathfinder", 2010, TipoAuto.DOBLE_TRACCION, "", 2000, true);
        autos[8] = new Auto(9000, "Toyota Rave For", 2009, TipoAuto.DOBLE_TRACCION, "", 15000, true);
        autos[9] = new Auto(10000, "Honda Accord", 2011, TipoAuto.AUTOMOVIL, "", 2000, true);

    }
    
    public Auto buscarAuto (TipoAuto tipo, String marca, int annoDesde, int annoHasta){
        Auto auto = null;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getTipoAuto() == tipo && autos[i].getMarca().equalsIgnoreCase(marca) && (autos[i].getModelo()> annoDesde && autos[i].getModelo() < annoHasta )) {
                auto = autos[i];
                break;
            }
        }
        
        return auto; 
    }
    
    
}
