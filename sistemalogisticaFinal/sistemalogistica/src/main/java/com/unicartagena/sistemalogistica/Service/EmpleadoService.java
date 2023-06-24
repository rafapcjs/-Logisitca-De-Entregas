package com.unicartagena.sistemalogistica.Service;

import com.unicartagena.sistemalogistica.entity.Empleados;
import com.unicartagena.sistemalogistica.entity.Usuario;
import com.unicartagena.sistemalogistica.repository.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;


    //Buscar todo o listar
    public List<Empleados> getEmpleados() {
        return empleadoRepository.findAll();

    }

    //Buscar por ID
    public Optional<Empleados> getEmpleadoid(Long id) {
        return empleadoRepository.findById(id);

    }

    //Guardar
    public void saveOrUpdate(Empleados empleados) {

        empleadoRepository.save(empleados);
    }

    //Actualizar
    public void Update(Empleados empleados) {

        empleadoRepository.save(empleados);
    }


    //Eliminar por ID
    public void delete(Long id) {

        empleadoRepository.deleteById(id);
    }

    public List<Empleados> buscarPorNombre(String Nombre) {
        return empleadoRepository.findByNombreEmpleado(Nombre);
    }

}


