package SistemaFacturacion.util;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;

import SistemaFacturacion.entities.Factura;

public class Archivos {
    private static final String CARPETA = "facturas";

    // 1. Guardar factura en archivo
    public static void guardarFactura(Factura factura) {
        try {
            Files.createDirectories(Paths.get(CARPETA)); // crea carpeta si no existe
            String nombreArchivo = CARPETA + "/factura_" + factura.getId() + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
                writer.write(factura.generarFactura());
            }
            System.out.println("Factura guardada en: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar factura: " + e.getMessage());
        }
    }

    // 2. Leer factura desde archivo
    public static void leerFactura(Long idFactura) {
        String nombreArchivo = CARPETA + "/factura_" + idFactura + ".txt";
        try {
            String contenido = Files.readString(Paths.get(nombreArchivo));
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("No se pudo leer la factura: " + e.getMessage());
        }
    }

    // 3. Listar facturas existentes
    public static void listarFacturas() {
        try {
            Files.createDirectories(Paths.get(CARPETA));
            Files.list(Paths.get(CARPETA))
                .filter(Files::isRegularFile)
                .map(Path::getFileName)
                .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error al listar facturas: " + e.getMessage());
        }
    }
}
