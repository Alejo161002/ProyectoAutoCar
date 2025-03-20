/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

import java.time.LocalDateTime;
import java.time.Duration;
/**
 *
 * @autores Ricardo Hernández Salas, cedula 119430725 
 * Jose Alejando Jiménez Ugalde, cedula 119400931
 */ 
public class Alquiler {
    private Auto auto;
    private int placa;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;
    private LocalDateTime fechaDevolucionReal;
    private double kilometrajeInicial;
    private double kilometrajeFinal;
    private double montoSeguroObligatorio;
    private double montoSeguroTerceros;
    private double montoPorKilometraje;
    private double montoPorDias;
    private boolean estadoAlquiler;
    private boolean deseaSeguroTerceros;

    public Alquiler(int placa, LocalDateTime fechaAlquiler, LocalDateTime fechaDevolucion, double kilometrajeInicial, boolean seguroTerceros) {
        this.placa = placa;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.montoSeguroObligatorio = calcularMontoSeguroObligatorio();
        this.montoSeguroTerceros = calcularSeguroTerceros();
        this.estadoAlquiler = true;
        this.deseaSeguroTerceros = seguroTerceros;
    }
    
    private double calcularMontoSeguroObligatorio(){
        double monto =0; 
        double tarifa =0; 
        switch (this.auto.getTipoAuto()){
            case AUTOMOVIL ->{
                if (this.auto.getModelo()< 1990) {
                    tarifa = 5000;
                }else if (this.auto.getModelo()>= 1990 && this.auto.getModelo()<=1995) {
                    tarifa = 10000;
                }
                else if (this.auto.getModelo()> 1995 && this.auto.getModelo()<=2000) {
                    tarifa = 15000;
                }else{
                    tarifa = 20000;
                }
                
            }
            case DOBLE_TRACCION -> {
                if (this.auto.getModelo()< 1990) {
                    tarifa = 20000;
                }else if (this.auto.getModelo()>= 1990 && this.auto.getModelo()<=1995) {
                    tarifa = 25000;
                }
                else if (this.auto.getModelo()> 1995 && this.auto.getModelo()<=2000) {
                    tarifa = 30000;
                }else{
                    tarifa = 35000;
                }
                
            }
            
                    }
        
        int dias = (int) Duration.between(fechaAlquiler, fechaDevolucion).toDays();
        monto = dias * tarifa;
        return monto;
    }
    
    private double calcularSeguroTerceros(){
        double monto = 0;
        int dias = (int) Duration.between(fechaAlquiler, fechaDevolucion).toDays();
        if (this.deseaSeguroTerceros) {
            monto = dias * 25;
        }
        return monto;
    }
            
    public void setFechaDevolucionReal(LocalDateTime fechaDevolucion) {
        this.fechaDevolucionReal = fechaDevolucion;
    }

    public void setMontoPorKilometraje(double montoPorKilometraje) {
        this.montoPorKilometraje = montoPorKilometraje;
    }

    public void setMontoPorDias(double montoPorDias) {
        this.montoPorDias = montoPorDias;
    }
    
    public double calcularTotal(){
       return montoPorDias + montoPorKilometraje + montoSeguroObligatorio + montoSeguroTerceros;
    }
    
    
    
    
}
