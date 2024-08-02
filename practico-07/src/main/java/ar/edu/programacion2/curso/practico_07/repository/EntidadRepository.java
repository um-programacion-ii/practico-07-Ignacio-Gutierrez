package ar.edu.programacion2.curso.practico_07.repository;

import ar.edu.programacion2.curso.practico_07.DAO.DAO;
import ar.edu.programacion2.curso.practico_07.model.Entidad;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EntidadRepository implements DAO<Entidad> {

    private final Map<Integer, Entidad> entidades = new HashMap<>();
    private int currentId = 1;

    @Override
    public List<Entidad> listarTodos() {
        return new ArrayList<>(entidades.values());
    }

    @Override
    public Entidad buscarPorId(int id) {
        return entidades.get(id);
    }

    @Override
    public void registrar(Entidad entidad) {
        entidad.setId(currentId++);
        entidades.put(entidad.getId(), entidad);
    }

    @Override
    public void modificar(Entidad entidad) {
        entidades.put(entidad.getId(), entidad);
    }

    @Override
    public void elimnar(int id) {
        entidades.remove(id);
    }
}
