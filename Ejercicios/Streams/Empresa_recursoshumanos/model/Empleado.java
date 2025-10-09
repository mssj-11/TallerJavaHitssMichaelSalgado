package Streams.Empresa_recursoshumanos.model;

import java.util.List;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private int aniosExperiencia;
    private List<Evaluacion> evaluaciones;

    public Empleado(int id, String nombre, String departamento, double salario,
                    int aniosExperiencia, List<Evaluacion> evaluaciones) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
        this.evaluaciones = evaluaciones;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public int getAniosExperiencia() { return aniosExperiencia; }
    public List<Evaluacion> getEvaluaciones() { return evaluaciones; }

    @Override
    public String toString() {
        return nombre + " (" + departamento + ") - $" + salario + " - " + aniosExperiencia + " años exp.";
    }

}