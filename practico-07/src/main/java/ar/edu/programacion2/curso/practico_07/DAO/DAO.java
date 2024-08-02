package ar.edu.programacion2.curso.practico_07.DAO;

import java.util.List;

public interface DAO<T> {
    List<T> listarTodos();
    T buscarPorId(int id);
    void registrar(T t);
    void elimnar(int id);
    void modificar(T t);
}