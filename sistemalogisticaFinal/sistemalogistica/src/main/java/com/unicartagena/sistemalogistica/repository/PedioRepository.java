package com.unicartagena.sistemalogistica.repository;

import com.unicartagena.sistemalogistica.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PedioRepository extends JpaRepository <Pedido,Long>{

    List<Pedido> findByNombreProducto(String nombreProducto);

    Optional<Pedido> findByGuia(Long guia);

    Optional<Pedido> findByEstado(String estado);

}
