package poo.abstraccion.Mamiferos.zoo;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza en manada de " + numCamada + " lobos.";
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Lobo corre ágilmente en los bosques.";
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla para comunicarse con su manada.";
    }

}