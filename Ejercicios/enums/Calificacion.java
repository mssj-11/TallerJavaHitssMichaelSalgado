package enums;

public enum Calificacion {

    A("Excelente"),
    B("Notable"),
    C("Aprobado"),
    D("Suficiente"),
    F("Reprobado");

    private final String descripcion;

    // Constructor
    Calificacion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Modificador de Acceso: Metodo GET
    public String getDescripcion() {
        return descripcion;
    }


}
