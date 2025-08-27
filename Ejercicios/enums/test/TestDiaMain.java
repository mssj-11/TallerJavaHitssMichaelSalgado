package enums.test;

import enums.Dia;

public class TestDiaMain {
    // Dia dado es laboral o fin de semana
    private static String verificarDia(Dia dia){
        return switch (dia) {
            case SABADO, DOMINGO -> "Fin de semana";
            default -> "Día laboral";
        };
    }
    public static void main(String[] args) {
        System.out.println("Dia Lunes: " + verificarDia(Dia.LUNES));
        System.out.println("Dia Viernes: " + verificarDia(Dia.VIERNES));
        System.out.println("Dia Sabado: " + verificarDia(Dia.SABADO));
    }
}
