/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author Tessd
 */
class HistorialMedico {
    private String fechaCita;
    private String signosVitales;
    private String diagnostico;
    private String observaciones;
    private String medicamentos;
    private String examenes;

    public HistorialMedico(String fechaCita, String signosVitales, String diagnostico, 
                           String observaciones, String medicamentos, String examenes) {
        this.fechaCita = fechaCita;
        this.signosVitales = signosVitales;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.medicamentos = medicamentos;
        this.examenes = examenes;
    }

    // Getters y Setters
    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }
}