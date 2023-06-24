package com.unicartagena.sistemalogistica.repository;

import com.unicartagena.sistemalogistica.entity.Empleados;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleados, Long> {


    List<Empleados>findByNombreEmpleado (String nombre);

}