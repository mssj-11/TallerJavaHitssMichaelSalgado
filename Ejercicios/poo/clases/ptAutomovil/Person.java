package poo.clases.ptAutomovil;

public class Person {
    Car car;

    // Constructor
    public Person() {
        car = new Car(); // Nuevo Objeto
    }

    public void createObject() {
        car.setBrand("Toyota");
        car.setColor("Rojo");
        car.setYear(2025);
    }

    public void description() {
        System.out.println("Marca: " + car.getBrand());
        System.out.println("Color: " + car.getColor());
        System.out.println("Año: " + car.getYear());
        System.out.println("Numero de Puertas: " + car.getNumberOfDoors());
    }

}
