/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author thyfa
 */
public class Expediente {
    private List<Cita> citas;

    public Expediente() {
        this.citas = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void mostrarHistorial() {
        for (Cita cita : citas) {
            System.out.println("Cita: " + cita.getFechaHora());
            cita.mostrarHojaMedica();
            System.out.println("-------------------");
        }
    }
}

