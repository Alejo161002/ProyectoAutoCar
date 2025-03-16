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
public class Auto {

    private int placa;

    private String marca;

    private int modelo;

    private Cliente cliente;

    private TipoAuto tipoAuto;

    private String color;

    private double kilometraje;

    private boolean estado;

    public Auto(int placa, String marca, int modelo, Cliente cliente, TipoAuto tipoAuto, String color, double kilometraje, boolean estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cliente = cliente;
        this.tipoAuto = tipoAuto;
        this.color = color;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    
    
}
