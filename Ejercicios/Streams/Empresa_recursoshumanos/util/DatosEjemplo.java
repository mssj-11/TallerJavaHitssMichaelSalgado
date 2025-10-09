package Streams.Empresa_recursoshumanos.util;

import Streams.Empresa_recursoshumanos.model.Empleado;
import Streams.Empresa_recursoshumanos.model.Evaluacion;

import java.util.Arrays;
import java.util.List;

public class DatosEjemplo {

    public static List<Empleado> generarEmpleados() {
        return Arrays.asList(
                new Empleado(1, "Ana Torres", "IT", 65000, 6,
                        Arrays.asList(new Evaluacion(2023, 92), new Evaluacion(2024, 95))),
                new Empleado(2, "Armando González", "Recursos Humanos", 48000, 4,
                        Arrays.asList(new Evaluacion(2023, 85), new Evaluacion(2024, 87))),
                new Empleado(3, "Karla Gómez", "IT", 72000, 8,
                        Arrays.asList(new Evaluacion(2022, 89), new Evaluacion(2024, 97))),
                new Empleado(4, "Juan Diego Ruiz", "Recursos Humanos", 51000, 10,
                        Arrays.asList(new Evaluacion(2023, 78), new Evaluacion(2024, 83))),
                new Empleado(5, "Carlos López", "IT", 56000, 7,
                        Arrays.asList(new Evaluacion(2023, 91), new Evaluacion(2024, 93)))
        );
    }
}