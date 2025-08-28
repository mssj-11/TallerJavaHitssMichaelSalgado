package enums;

public enum Semaforo {
    /*
     * Enumeracion para tener valores del semaforo: (ROJO, AMARILLO, VERDE)
     * Cada contante debe  de implementar un metodo accion(), 
     * que te devuelva lo que hace el constructor.
    */
    ROJO {
        @Override
        public String accion() {
            String cadena = "Detenerse";
            return cadena;
        }
    }, 
    AMARILLO {
        @Override
        public String accion() {
            return "Precausion";
        }
    }, 
    VERDE {
        @Override
        public String accion() {
            return "Avanzar";
        }
    };

    // Metodo Abstracto(no necesita cuerpo) que cada contante debe de implementar
    public abstract String accion(); // public abstract String accion() {};

}
