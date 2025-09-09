package genericos.repositorio.test;

import genericos.repositorio.entity.Cliente;
import genericos.repositorio.entity.Producto;
import genericos.repositorio.repo.Repositorio;

public class TestRepoMain {
    public static void main(String[] args) {
        Repositorio<Cliente> clienteRepo = new Repositorio<>();
        clienteRepo.agregar(new Cliente("mike"));
        clienteRepo.agregar(new Cliente("ana"));

        for (Cliente cliente : clienteRepo.obtenerTodos()) {
            System.out.println(cliente);
        }

        Repositorio<Producto> productRepo = new Repositorio<>();
        productRepo.agregar(new Producto("Arroz"));
        productRepo.agregar(new Producto("Frijol"));

        for (Producto producto : productRepo.obtenerTodos()) {
            System.out.println(producto);
        }
    }
}
