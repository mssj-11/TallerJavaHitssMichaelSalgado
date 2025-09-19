package SistemaFacturacion.genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Idenificable<ID>, ID> {
    private List<T> datos = new ArrayList<>();

    // Validar para evitar duplicados de ID
    public void agregar(T elemento){
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("Ya existe el elemnto con el ID: " + elemento.getId());
        } else {
            datos.add(elemento); // Agrega un elemento al final de la lista
            System.out.println("Elemento guardado: " + elemento);
        }
    }

    public List<T> listar() {
        return datos;
        //return new ArrayList<>(datos);
    }

    // Buscar en la lista si se encuentra
    public T buscarPorId(ID id) {
        for (T t : datos) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    // Eliminar elemento por ID
    public boolean eliminarPorId(ID id){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i); // Elimina un elemento a atraves de un Indice
                System.out.println("Se ha eliminado el elemento con el ID: " + id);
                return true;
            }
        }
        System.out.println("No se encontro el elemento con el ID: " + id);
        return false;
    }

    public boolean actualizar(ID id, T nuevoEslemento){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.set(i, nuevoEslemento); // Actualiza un elemento a atraves de un Indice
                System.out.println("Se ha actualizado el elemento con el ID: " + id + " con: " + nuevoEslemento);
                return true;
            }
        }
        System.out.println("No se ha podido actualizar el elemento con el ID: " + id);
        return false;
    }

}
