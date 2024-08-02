package ar.edu.programacion2.curso.practico_07.service;

import ar.edu.programacion2.curso.practico_07.model.Entidad;
import ar.edu.programacion2.curso.practico_07.repository.EntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadService {

    @Autowired
    private EntidadRepository entidadRepository;

    public List<Entidad> findAll() {
        return entidadRepository.listarTodos();
    }

    public Entidad findOne(int id) {
        return entidadRepository.buscarPorId(id);
    }

    public Entidad add(Entidad entidad) {
        entidadRepository.registrar(entidad);
        return entidad;
    }

    public Entidad update(Entidad entidad, int id) {
        if (entidadRepository.buscarPorId(id) != null) {
            entidad.setId(id);
            entidadRepository.modificar(entidad);
            return entidad;
        }
        return null;
    }

    public void deleteOne(int id) {
        entidadRepository.elimnar(id);
    }
}