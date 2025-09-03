package poo.abstraccion.Mamiferos.zoo;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro Salvaje Africano caza en grupo en las sabanas de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Perro Salvaje Africano duerme en madrigueras.";
    }

    @Override
    public String correr() {
        return "El Perro Salvaje Africano puede correr largas distancias resistiendo el calor.";
    }

    @Override
    public String comunicarse() {
        return "El Perro Salvaje Africano se comunica con ladridos y chillidos. " +
               "Su mordida alcanza " + fuerzaMordida + " psi.";
    }

}