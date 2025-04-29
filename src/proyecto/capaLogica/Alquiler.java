/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
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
        this.kilometrajeInicial = autoP.getKilometraje();
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

    public double calcularSeguroTerceros() {
        int dias = (int) Duration.between(fechaAlquiler, fechaDevolucion).toDays();
        this.montoSeguroTerceros = deseaSeguroTerceros ? dias * 25 : 0;
        return this.montoSeguroTerceros;
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

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder mensaje = new StringBuilder();
        String estado = this.estadoAlquiler ? "Pendiente" : "Devuelto";
        mensaje.append("-Alquiler-");
        mensaje.append("\nEstado: ");
        mensaje.append("\n");
        mensaje.append(estado);
        mensaje.append("\n");
        mensaje.append("Fecha de inicio: ");
        mensaje.append("\n");
        mensaje.append(this.fechaAlquiler.format(formato));
        mensaje.append("\n");
        mensaje.append("Fecha de devolucion inicial: ");
        mensaje.append("\n");
        mensaje.append(this.fechaDevolucion.format(formato));
        mensaje.append("\n");
        mensaje.append("Kilometraje inicial: ");
        mensaje.append("\n");
        mensaje.append(this.kilometrajeInicial).append("km");
        mensaje.append("\n");
        mensaje.append("-Montos-");
        mensaje.append("\n");
        mensaje.append("Monto por Seguro Obligatorio: ");
        mensaje.append("\n");
        mensaje.append("$").append(this.montoSeguroObligatorio);
        mensaje.append("\n");
        mensaje.append("Monto por Seguro a Terceros: ");
        mensaje.append("\n");
        mensaje.append("$").append(this.montoSeguroTerceros);
        mensaje.append("\n");

        return mensaje.toString();
    }

    public String reporte() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder mensaje = new StringBuilder();
        String estado = this.estadoAlquiler ? "Pendiente" : "Devuelto";
        mensaje.append("-Alquiler-");
        mensaje.append("\nEstado: ");
        mensaje.append("\n");
        mensaje.append(estado);
        mensaje.append("\n");
        mensaje.append("Fecha de inicio: ");
        mensaje.append("\n");
        mensaje.append(this.fechaAlquiler.format(formato));
        mensaje.append("\n");
        mensaje.append("Fecha de devolucion inicial: ");
        mensaje.append("\n");
        mensaje.append(this.fechaDevolucion.format(formato));
        mensaje.append("\n");
        mensaje.append("Fecha de devolucion real: ");
        mensaje.append("\n");
        if (this.fechaDevolucionReal != null) {
            mensaje.append(this.fechaDevolucionReal.format(formato));
        } else {
            mensaje.append("Alquiler pendiente de devolución.");
        }
        mensaje.append("\n");
        mensaje.append("Kilometraje inicial: ");
        mensaje.append("\n");
        mensaje.append(this.kilometrajeInicial).append("km");
        mensaje.append("\n");
        mensaje.append("Kilometraje final: ");
        mensaje.append("\n");
        if (this.kilometrajeFinal != 0.0) {
            mensaje.append(this.kilometrajeFinal).append("km");
        } else {
            mensaje.append("Alquiler pendiente de devolución.");
        }
        mensaje.append("\n");
        mensaje.append("\n");
        mensaje.append("-Montos-");
        mensaje.append("\n");
        mensaje.append("\n");
        mensaje.append("Monto por días: ");
        mensaje.append("\n");
        if (montoPorDias != 0.0) {
            mensaje.append("₡").append(this.montoPorDias);
        } else {
            mensaje.append("Alquiler pendiente de devolución.");

        }
        mensaje.append("\n");
        mensaje.append("Monto por Seguro Obligatorio: ");
        mensaje.append("\n");
        mensaje.append("$").append(this.montoSeguroObligatorio);
        mensaje.append("\n");
        mensaje.append("Monto por Seguro a Terceros: ");
        mensaje.append("\n");
        if (montoSeguroTerceros != 0.0) {
            mensaje.append("$").append(this.montoSeguroTerceros);
        } else {
            mensaje.append("-Seguro no adquirido-");
        }
        mensaje.append("\n");
        mensaje.append("Monto por kilometraje: ");
        mensaje.append("\n");
        if (this.montoPorKilometraje != 0.0) {
            mensaje.append("₡").append(this.montoPorKilometraje);
        } else {
            mensaje.append("Alquiler pendiente de devolución.");
        }
        mensaje.append("\n");

        return mensaje.toString();
    }

    public void setEstadoAlquiler(boolean estadoAlquiler) {
        this.estadoAlquiler = estadoAlquiler;
    }

}//fin de clase 
