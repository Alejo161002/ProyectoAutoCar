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
    
    private int cantidadAlquileres;

    public Auto(int placa, String marca, int modelo,  TipoAuto tipoAuto, String color, double kilometraje, boolean estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoAuto = tipoAuto;
        this.color = color;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public int getPlaca() {
        return placa;
    }

    public Cliente getCliente() {
        return cliente;
    }
        
    

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
   
 
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("El numero de placa del vehiculo es: ");
        sb.append(placa);
        sb.append("\n");
        
        sb.append("La marca del vehiculo es: ");
        sb.append(marca);
        sb.append("\n");
        
        sb.append("El modelo del vehiculo es: ");
        sb.append(modelo);
        sb.append("\n");
        
        
        sb.append("El tipo del vehiculo es:");
        sb.append(tipoAuto);
        sb.append("\n");
        
        sb.append("El color del vehiculo es: ");
        sb.append(color);
        sb.append("\n");
        
        sb.append("El kilometraje del vehiculo es: ");
        sb.append(kilometraje);
        sb.append(" km");
        sb.append("\n");    
        
        return sb.toString();
               
    }
    
    public String reporte(){
        StringBuilder sb= new StringBuilder();
        sb.append("El numero de placa del vehiculo es: ");
        sb.append(placa);
        sb.append("\n");
        
        sb.append("La marca del vehiculo es: ");
        sb.append(marca);
        sb.append("\n");
        
        sb.append("El modelo del vehiculo es: ");
        sb.append(modelo);
        sb.append("\n");
        
        sb.append("El tipo de cliente es: ");
        sb.append(cliente);
        sb.append("\n");
        
        sb.append("El tipo del vehiculo es:");
        sb.append(tipoAuto);
        sb.append("\n");
        
        sb.append("El color del vehiculo es: ");
        sb.append(color);
        sb.append("\n");
        
        sb.append("El kilometraje del vehiculo es: ");
        sb.append(kilometraje);
        sb.append(" km");
        sb.append("\n");    
        
        return sb.toString();
               
    }
    
}
