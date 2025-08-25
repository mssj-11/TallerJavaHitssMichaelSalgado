package poo.clases.ptAutomovil;

public class Car {
    // Atributos: (default, public, private, protected)
    private String brand;
    private String color;
    private int year;
    private Integer numberOfDoors = 4;

    // Metodos
    // Constructor
    public Car(){}

    // Metodos de logica o comportamiento
    public void arrancar(){}

    // Metodos de acceso: Getter(leer) / Setter(modificar)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand; // referencia la variable de instancia de la clase actual, distinguiéndola de una variable local con el mismo nombre
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


}
