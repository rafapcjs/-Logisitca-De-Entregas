package com.unicartagena.sistemalogistica.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String rol;



}
