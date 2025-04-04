/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

import java.time.LocalDateTime;
import java.time.Duration;
import static proyecto.capaLogica.TipoAuto.AUTOMOVIL;
import static proyecto.capaLogica.TipoAuto.DOBLE_TRACCION;

/**
 *
 * @autores Ricardo Hernández Salas, cedula 119430725 Jose Alejando Jiménez
 * Ugalde, cedula 119400931
 */
public class Alquiler {

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

    public Alquiler(LocalDateTime fechaAlquiler, LocalDateTime fechaDevolucion, double kilometrajeInicial, boolean seguroTerceros, Auto autoP) {
        this.placa = autoP.getPlaca();
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.montoSeguroObligatorio = calcularMontoSeguroObligatorio(autoP);
        this.montoSeguroTerceros = calcularSeguroTerceros();
        this.estadoAlquiler = true;
        this.deseaSeguroTerceros = seguroTerceros;
    }

    private double calcularMontoSeguroObligatorio(Auto autoP) {
        Auto auto = autoP;
        double monto = 0;
        double tarifa = 0;
        switch (auto.getTipoAuto()) {
            case AUTOMOVIL -> {
                if (auto.getModelo() < 1990) {
                    tarifa = 5000;
                } else if (auto.getModelo() >= 1990 && auto.getModelo() <= 1995) {
                    tarifa = 10000;
                } else if (auto.getModelo() > 1995 && auto.getModelo() <= 2000) {
                    tarifa = 15000;
                } else {
                    tarifa = 20000;
                }

            }
            case DOBLE_TRACCION -> {
                if (auto.getModelo() < 1990) {
                    tarifa = 20000;
                } else if (auto.getModelo() >= 1990 && auto.getModelo() <= 1995) {
                    tarifa = 25000;
                } else if (auto.getModelo() > 1995 && auto.getModelo() <= 2000) {
                    tarifa = 30000;
                } else {
                    tarifa = 35000;
                }

            }

        }

        int dias = (int) Duration.between(fechaAlquiler, fechaDevolucion).toDays();
        monto = dias * tarifa;
        return monto;
    }

    private double calcularSeguroTerceros() {
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

    public double calcularTotal() {
        return montoPorDias + montoPorKilometraje + montoSeguroObligatorio + montoSeguroTerceros;
    }

    public int getPlaca() {
        return placa;
    }

    public boolean getEstadoAlquiler() {
        return this.estadoAlquiler;
    }

    public void calcularMontoPorDias(LocalDateTime fechaDevolucionReal, Auto auto) {
        this.fechaDevolucionReal = fechaDevolucionReal;
        double tarifa = 0;
        double monto = 0;
        switch (auto.getTipoAuto()) {
            case AUTOMOVIL -> {
                tarifa = 30000;
            }
            case DOBLE_TRACCION -> {
                tarifa = 50000;
            }
        }
        int dias = (int) Duration.between(fechaAlquiler, this.fechaDevolucionReal).toDays();
        if (auto.getCliente().getTipo().compareTo(TipoCliente.CORPORATIVO) == 0) {
            monto = (dias * tarifa) - tarifa;
        } else {
            monto = dias * tarifa;
        }
        this.montoPorDias = monto;
    }

    public void calcularMontoPorKilometros(Auto auto, double kilometrajeActual) {
        double monto = 0;
        double tarifa = 0;
        double rango = 0;
        this.kilometrajeFinal = kilometrajeActual;
        rango = this.kilometrajeFinal - this.kilometrajeInicial;
        switch (auto.getTipoAuto()) {
            case AUTOMOVIL -> {
                tarifa = 500;
            }
            case DOBLE_TRACCION -> {
                tarifa = 700;
            }
        }
        if (auto.getCliente().getTipo().compareTo(TipoCliente.CORPORATIVO) == 0) {
            if (rango > 400) {
                monto = tarifa * 400;
            } else {
                monto = tarifa * rango;
            }

        } else {
            monto = tarifa * rango;
        }
        this.montoPorKilometraje = monto;
    }
    
    

}//fin de clase 
