package poo.clases.ptAutomovil.test;

import poo.clases.ptAutomovil.Car;
import poo.clases.ptAutomovil.Person;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car(); // Nuevo Objeto
        Person person = new Person();
        person.createObject();
        System.out.println("Michael ha comprado un Auto: ");
        person.description();
    }
}
