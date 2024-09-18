/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import Models.Customer;
import java.util.List;

/**
 *
 * @author fabia
 */
public class Cita {
    private String fecha;
    private String hora;
    private Customer paciente; 
    private Medico medico; 
    private String motivo;

    public Cita(String fecha, String hora, Customer paciente, Medico medico, String motivo) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Customer getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setPaciente(Customer paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    

    @Override
    public String toString() {
        return "Cita{" + "hora=" + hora + ", paciente=" + paciente + ", medico=" + medico + ", motivo=" + motivo + '}';
    } 

    void HojaMedica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}