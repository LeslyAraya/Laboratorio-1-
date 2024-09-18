/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author thyfa
 */
public class HojaMedica {
    private String signosVitales;
    private String diagnostico;
    private String observaciones;
    private String medicamentos;
    private String examenes;

    public String getSignosVitales() {
        return signosVitales;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public String getExamenes() {
        return examenes;
    }

    public HojaMedica(String signosVitales, String diagnostico, String observaciones, String medicamentos, String examenes) {
        this.signosVitales = signosVitales;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.medicamentos = medicamentos;
        this.examenes = examenes;
    }

    public HojaMedica() {
        this("","","","","");
    }
    
    
}
