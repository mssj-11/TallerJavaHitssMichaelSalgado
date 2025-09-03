package poo.abstraccion.Mamiferos.test;
import poo.abstraccion.Mamiferos.zoo.*;

public class TestMamiferosMain {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        mamiferos[0] = new Leon("Sabana Africana", 1.2f, 2.1f, 190f, "Panthera leo",
                6.5f, 80, 10, 114.5f);

        mamiferos[1] = new Tigre("Selva Asiática", 1.1f, 2.5f, 220f, "Panthera tigris",
                7.0f, 65, "Bengala");

        mamiferos[2] = new Guepardo("Llanuras Africanas", 0.9f, 1.5f, 72f, "Acinonyx jubatus",
                4.5f, 120);

        mamiferos[3] = new Lobo("Bosques de Norteamérica", 0.8f, 1.4f, 50f, "Canis lupus",
                "Gris", 5.5f, 6, "Ártico");

        mamiferos[4] = new Perro("Sabanas Africanas", 0.75f, 1.3f, 40f, "Lycaon pictus",
                "Moteado", 4.0f, 340);

        for (Mamifero animal : mamiferos) {
            System.out.println(animal);
            System.out.println("  Comer: " + animal.comer());
            System.out.println("  Dormir: " + animal.dormir());
            System.out.println("  Correr: " + animal.correr());
            System.out.println("  Comunicarse: " + animal.comunicarse());
            System.out.println("--------------------------------------------------");
        }
    }

}