package genericos.repositorio.repo;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> datos = new ArrayList<>();

    public void agregar(T elemento) {
        datos.add(elemento);
    }

    public List<T> obtenerTodos() {
        return datos;
    }
}
