package com.unicartagena.sistemalogistica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "pedido")
public class Pedido  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;


    private  long guia;

    private  double costo;


    private  String modalidad;

    private long tiempoEstimado;

    private long empleadosId;


    private  String nombreProducto;

    private  String estado;

    private  String destinario;





}
