package poo.abstraccion.Mamiferos.zoo;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                    float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza gacelas en las llanuras de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en lugares abiertos de " + habitat;
    }

    @Override
    public String correr() {
        return "El Guepardo alcanza hasta " + velocidad + " km/h, siendo el más rápido.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite sonidos agudos para comunicarse.";
    }

}