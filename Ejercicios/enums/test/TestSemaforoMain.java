package enums.test;
import enums.Semaforo;

public class TestSemaforoMain {
    public static void main(String[] args) {
        Semaforo luz = Semaforo.ROJO;
        System.out.println("Luz Roja ==> " + luz.accion());
        System.out.println("Luz Amarilla ==> " + Semaforo.AMARILLO.accion());

        for (Semaforo s : Semaforo.values()) {
            System.out.println(s + " ==> " + s.accion());
        }
    }

}
