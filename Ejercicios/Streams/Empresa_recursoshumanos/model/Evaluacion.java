package Streams.Empresa_recursoshumanos.model;

public class Evaluacion {
    private int anio;
    private int puntaje; // 1-100

    public Evaluacion(int anio, int puntaje) {
        this.anio = anio;
        this.puntaje = puntaje;
    }

    public int getAnio() {
        return anio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "año=" + anio +
                ", puntaje=" + puntaje +
                '}';
    }

}
