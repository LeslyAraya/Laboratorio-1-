/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import Models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class ControladorCita {
    private List<Cita> citas;
    
     public ControladorCita() {
        this.citas = new ArrayList<>();
    }
     
    public void agregarCita(String fecha, String hora, Customer paciente, Medico medico, String motivo) {
        Cita nuevaCita = new Cita(fecha, hora, paciente, medico, motivo);
        citas.add(nuevaCita);
        System.out.println("Cita agregada: " + nuevaCita);
    }
         
    public Cita buscarCita(String fecha, String hora) {
        for (Cita cita : citas) {
            if (cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                return cita;
            }
        }
        return null;
    }
    
    public boolean modificarCita(String fecha, String hora, String nuevaFecha, String nuevaHora) {
        Cita cita = buscarCita(fecha, hora);
        if (cita != null) {
            cita.setFecha(nuevaFecha);
            cita.setHora(nuevaHora);
            System.out.println("Cita modificada a: " + cita);
            return true;
        }
        return false;
    }
    
    public boolean cancelarCita(String fecha, String hora) {
        Cita cita = buscarCita(fecha, hora);
        if (cita != null) {
            citas.remove(cita);
            System.out.println("Cita cancelada: " + cita);
            return true;
        }
        return false;
    }
    
     public void mostrarCitas(String dia) {
        System.out.println("Citas para el día " + dia + ":");
        for (Cita cita : citas) {
            if (cita.getFecha().equals(dia)) {
                System.out.println(cita);
            }
        }
    }
}
