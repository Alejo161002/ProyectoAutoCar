/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

import java.util.List;

/**
 *
 * @autores Ricardo Hernández Salas, cedula 119430725 Jose Alejando Jiménez
 * Ugalde, cedula 119400931
 */

public class Agencia {

    private Alquiler[][] alquileres;
    public Auto[] autos;

    public Agencia() {
        alquileres = new Alquiler[10][5];
        llenarAutos();
    }

    public void llenarAutos() {
        autos = new Auto[10];
        autos[0] = new Auto(1000, "Toyota Corolla", 2010, TipoAuto.AUTOMOVIL, "Gris", 10000, true);
        autos[1] = new Auto(2000, "Honda CRV", 2005, TipoAuto.DOBLE_TRACCION, "Blanco", 200000, true);
        autos[2] = new Auto(3000, "Hiunday Elantra", 2009, TipoAuto.AUTOMOVIL, "Azul", 20000, true);
        autos[3] = new Auto(4000, "Honda Accord", 2008, TipoAuto.AUTOMOVIL, "Negro", 100000, true);
        autos[4] = new Auto(5000, "Nissan Xtrail", 2004, TipoAuto.DOBLE_TRACCION, "Blanco", 100000, true);
        autos[5] = new Auto(6000, "Nissan Pathfinder", 2005, TipoAuto.DOBLE_TRACCION, "Amarillo", 50000, false);
        autos[6] = new Auto(7000, "Toyota Yaris", 2011, TipoAuto.AUTOMOVIL, "Rojo", 5000, true);
        autos[7] = new Auto(8000, "Nissan Pathfinder", 2010, TipoAuto.DOBLE_TRACCION, "Negro", 2000, true);
        autos[8] = new Auto(9000, "Toyota Rave For", 2009, TipoAuto.DOBLE_TRACCION, "Gris", 15000, true);
        autos[9] = new Auto(10000, "Honda Accord", 2011, TipoAuto.AUTOMOVIL, "Azul", 2000, true);

    }

    public Auto buscarAuto(TipoAuto tipo, String marca, int annoDesde, int annoHasta) {
    for (int i = 0; i < autos.length; i++) {
        Auto actual = autos[i];

        if (
            actual.getTipoAuto() == tipo &&
            actual.getMarca().toLowerCase().contains(marca.toLowerCase()) &&
            actual.getModelo() >= annoDesde &&
            actual.getModelo() <= annoHasta &&
            actual.getEstado()
        ) {
            actual.setEstado(false); 
            return actual;
        }
    }

    return null; 
}


    // Este metodo sera usado para buscar el auto por placa cuando sea devuelto. 
    public Auto buscarAutoPorPlaca(int placa) {
        Auto auto = null;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getPlaca() == placa) {
                auto = autos[i];
                break;
            }
        }

        return auto;
    }

    /**
     * *
     *
     * @param alquiler
     * @return fila en la que guardar el alquiler correspodiente a la del auto.
     */
    private int buscarFila(Alquiler alquiler) {
        int fila = 0;
        switch (alquiler.getPlaca()) {
            case 1000 -> {
                fila = 0;
            }
            case 2000 -> {
                fila = 1;
            }
            case 3000 -> {
                fila = 2;
            }
            case 4000 -> {
                fila = 3;
            }
            case 5000 -> {
                fila = 4;
            }
            case 6000 -> {
                fila = 5;
            }
            case 7000 -> {
                fila = 6;
            }
            case 8000 -> {
                fila = 7;
            }
            case 9000 -> {
                fila = 8;
            }
            case 10000 -> {
                fila = 9;
            }
        }
        return fila;
    }

    //sobrecarga del metodo para buscar fila por auto
    private int buscarFila(Auto auto) {
        int fila = 0;
        switch (auto.getPlaca()) {
            case 1000 -> {
                fila = 0;
            }
            case 2000 -> {
                fila = 1;
            }
            case 3000 -> {
                fila = 2;
            }
            case 4000 -> {
                fila = 3;
            }
            case 5000 -> {
                fila = 4;
            }
            case 6000 -> {
                fila = 5;
            }
            case 7000 -> {
                fila = 6;
            }
            case 8000 -> {
                fila = 7;
            }
            case 9000 -> {
                fila = 8;
            }
            case 10000 -> {
                fila = 9;
            }
        }
        return fila;
    }
//Volver a trabajar en este metodo al aclarar dudas.

    public void agregarAlquiler(Alquiler alquiler) {
        int fila = buscarFila(alquiler);
        for (int j = 0; j < alquileres[0].length; j++) {
            if (alquileres[fila][j] == null) {
                alquileres[fila][j] = alquiler;
                break;
            }
        }
        alquileres[fila][0] = alquiler;
        
        
        
    }// fin de metodo

    public Alquiler buscarAlquiler(Auto auto) {
        int fila = buscarFila(auto);
        for (int j = 0; j < alquileres[0].length; j++) {
            if (alquileres[fila][j]!=null && alquileres[fila][j].getEstadoAlquiler()) {
                return alquileres[fila][j];
            }
        }
        return null;
    }
    public Alquiler devolverAuto(Auto auto){
        int fila = buscarFila(auto);
        for (int j = alquileres[0].length; j >= 0; j--) {
            if (alquileres[fila][j]!=null && alquileres[fila][j].getEstadoAlquiler()) {
                return alquileres[fila][j];
            }
        }
        return null;
    }

    public String reporteAgencia() {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < autos.length; i++) {
            mensaje.append(autos[i].toString());
            mensaje.append("\n");
        }
        return mensaje.toString();
    }
    
    
    public String reporteAlquileres(int placa){
        Auto actual = buscarAutoPorPlaca(placa);
        int fila = buscarFila(actual);
        StringBuilder mensaje = new  StringBuilder();
        mensaje.append(actual.reporte());
        mensaje.append("\n\n");
        for (int j = 0; j < alquileres[0].length; j++) {
            if (alquileres[fila][j] != null) {
                mensaje.append("\t").append(alquileres[fila][j].toString());
                mensaje.append("\n");
            } else {
                mensaje.append("Fin del reporte.");
                break;
            }
        
        }
        return mensaje.toString();
    }
    
    

} // fin de clase 

