package ar.edu.programacion2.curso.practico_07.controller;

import ar.edu.programacion2.curso.practico_07.model.Entidad;
import ar.edu.programacion2.curso.practico_07.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping
    public List<Entidad> findAll() {
        return entidadService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOne(@PathVariable int id) {
        Entidad entidad = entidadService.findOne(id);
        if (entidad == null) {
            return new ResponseEntity<>("Entidad no encontrada", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(entidad, HttpStatus.OK);
    }

    @PostMapping
    public Entidad add(@RequestBody Entidad entidad) {
        return entidadService.add(entidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Entidad entidad, @PathVariable int id) {
        Entidad updatedEntidad = entidadService.update(entidad, id);
        if (updatedEntidad == null) {
            return new ResponseEntity<>("Entidad no encontrada", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedEntidad, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id) {
        entidadService.deleteOne(id);
    }
}
