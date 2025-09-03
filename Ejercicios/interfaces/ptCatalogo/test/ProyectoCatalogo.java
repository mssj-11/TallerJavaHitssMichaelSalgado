package interfaces.ptCatalogo.test;

import java.time.LocalDate;
import java.util.logging.Logger;

import interfaces.ptCatalogo.interfaces.IProducto;
import interfaces.ptCatalogo.modelos.Comics;
import interfaces.ptCatalogo.modelos.IPhone;
import interfaces.ptCatalogo.modelos.Libro;
import interfaces.ptCatalogo.modelos.TvLcd;


public class ProyectoCatalogo {
        private static final Logger logger = Logger.getLogger(ProyectoCatalogo.class.getName());

    public static void main(String[] args) {
        IProducto[] productos = new IProducto[5];
        
        productos[0] = new IPhone(20000, "Apple", "14 Pro", "Negro");
        productos[1] = new TvLcd(340000, "Sony", 55);
        productos[2] = new Libro(18000, LocalDate.now(), "Eric Gamma", "Elementos Reusables POO", "Addison Wesley");
        productos[3] = new Libro(14000, LocalDate.now(), "Martin Fowler", "UML Gota a Gota", "Prentice Hall");
        productos[4] = new Comics(12000, LocalDate.now(), "Stan Lee", "Spiderman", "Marvel", "Peter Parker");

        for (IProducto p : productos) {
            logger.info(p.toString());
        }
    }

}