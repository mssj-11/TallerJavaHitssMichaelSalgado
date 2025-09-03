package poo.abstraccion.Mamiferos.zoo;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza en solitario en " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre duerme entre la maleza de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre corre a una velocidad de " + velocidad + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge ferozmente para marcar su territorio.";
    }

}