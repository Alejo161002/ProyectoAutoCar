/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

/**
 *
 * @autores Ricardo Hernández Salas, cedula 119430725 Jose Alejando Jiménez
 * Ugalde, cedula 119400931
 */
public class Cliente {

    private String cedula;
    private String nombre;
    private TipoCliente tipo;

    public Cliente(String cedula, String nombre, TipoCliente tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s    |  Cedula: %s   |  Tipo: %s", nombre, cedula, tipo);

    }

}
