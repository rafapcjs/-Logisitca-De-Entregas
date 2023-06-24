package com.unicartagena.sistemalogistica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="Empleados")

public class Empleados {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    private String nombreEmpleado;

    private String cargo;









}
