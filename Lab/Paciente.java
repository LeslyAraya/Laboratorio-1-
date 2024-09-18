/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tessd
 */

public class Paciente {
    private String nombre;
    private String cedula;
    private List<HistorialMedico> historialMedico;

    public Paciente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.historialMedico = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<HistorialMedico> getHistorialMedico() {
        return historialMedico;
    }

    public void agregarHistorial(HistorialMedico historial) {
        this.historialMedico.add(historial);
    }
}

