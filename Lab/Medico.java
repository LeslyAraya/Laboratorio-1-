/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author fabia
 */
public class Medico {
    private String id;               
    private String numeroMedico;     
    private String nombre;           
    private String fechaNacimiento;   
    private String telefono;         
    private String correo;           
    private String especialidad;     
    private double salario;    

    public Medico(String id, String numeroMedico, String nombre, String fechaNacimiento, String telefono, String correo, String especialidad, double salario) {
        this.id = id;
        this.numeroMedico = numeroMedico;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public String getNumeroMedico() {
        return numeroMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeroMedico(String numeroMedico) {
        this.numeroMedico = numeroMedico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Medico{" + "nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad + '}';
    }
    
    
}
