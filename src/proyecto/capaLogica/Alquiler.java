/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

import java.time.LocalDateTime;

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

    public Alquiler(int placa, LocalDateTime fechaAlquiler, LocalDateTime fechaDevolucion, double kilometrajeInicial, double montoSeguroObligatorio, double montoSeguroTerceros ) {
        this.placa = placa;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.montoSeguroObligatorio = montoSeguroObligatorio;
        this.montoSeguroTerceros = montoSeguroTerceros;
        this.estadoAlquiler = true;
    }
    public Alquiler(int placa, LocalDateTime fechaAlquiler, LocalDateTime fechaDevolucion, double kilometrajeInicial, double montoSeguroObligatorio ) {
        this.placa = placa;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.montoSeguroObligatorio = montoSeguroObligatorio;
        this.estadoAlquiler = true;
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
