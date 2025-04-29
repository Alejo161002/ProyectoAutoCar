/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.capaLogica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @autores Ricardo Hernández Salas, cedula 119430725 Jose Alejando Jiménez
 * Ugalde, cedula 119400931
 */
public class FormatoFecha {

    private static DateTimeFormatter formato = DateTimeFormatter.ofLocalizedPattern("dd/MM/yyyy HH:mm");

    public static String formatear(LocalDateTime fechaP) {
        String fecha = formato.format(fechaP);
        return fecha;
    }

} //fin de clase
