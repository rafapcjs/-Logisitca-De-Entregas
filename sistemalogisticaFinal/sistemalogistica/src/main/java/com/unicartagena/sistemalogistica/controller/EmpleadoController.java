package com.unicartagena.sistemalogistica.controller;

import com.unicartagena.sistemalogistica.Service.EmpleadoService;
import com.unicartagena.sistemalogistica.entity.Empleados;
import com.unicartagena.sistemalogistica.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Empleados")

public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/listar")
    public List<Empleados> getAll(){

        return empleadoService.getEmpleados();

    }

    @GetMapping("/{EmpleadoId}")
    public Optional<Empleados> getById(@PathVariable("EmpleadoId") Long empleadoId){
        return empleadoService.getEmpleadoid(empleadoId);
    }

    //Guardar o actualizar
    @PostMapping("/crear")
    public Empleados saveUpdate(@RequestBody Empleados empleados){
        empleadoService.saveOrUpdate(empleados);
        return empleados;
    }

    //Actualizar
    @PutMapping("/modificar")
    public Empleados Update(@RequestBody Empleados empleados){
        empleadoService.saveOrUpdate(empleados);
        return empleados;
    }

    //Eliminar
    @DeleteMapping("/{EmpleadoId}")
    public void saveUpdate(@PathVariable("EmpleadoId") Long Empleadoid){
        empleadoService.delete(Empleadoid);
    }





    @GetMapping("/buscar-por-nombre")
    public ResponseEntity<List<Empleados>> buscarPorNombre(@RequestParam("nombre") String Nombre) {
        List<Empleados> empleados = empleadoService.buscarPorNombre(Nombre);
        return ResponseEntity.ok( empleados);
    }


}
