package poo.abstraccion.Mamiferos.zoo;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico,
                float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en " + habitat;
    }

    @Override
    public String dormir() {
        return "El León duerme en la sabana bajo la sombra.";
    }

    @Override
    public String correr() {
        return "El León corre a " + velocidad + " km/h para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " dB.";
    }

}