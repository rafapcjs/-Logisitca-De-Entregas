package com.unicartagena.sistemalogistica.Service;

import com.unicartagena.sistemalogistica.entity.Pedido;
import com.unicartagena.sistemalogistica.entity.Usuario;
import com.unicartagena.sistemalogistica.repository.PedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    PedioRepository pedioRepository;

    public List<Pedido>GetPedio(){

        return pedioRepository.findAll();
    }


    //Buscar por ID
    public Optional<Pedido> getpedidoid(Long id){
        return pedioRepository.findById(id);

    }

    //Guardar
    public void saveOrUpdate(Pedido pedido){
         pedioRepository.save( pedido);
    }


    //Actualizar
    public void Update(Pedido pedido){
        pedioRepository.save( pedido);
    }


    //Eliminar por ID
    public void delete(Long id){

        pedioRepository.deleteById(id);
    }

    public List<Pedido> buscarPorNombreProducto(String nombreProducto) {
        return pedioRepository.findByNombreProducto(nombreProducto);
    }

    public Optional<Pedido> obtenerPedidoPorGuia(@PathVariable Long guia) {
        return pedioRepository.findByGuia(guia);
    }

    public Optional<Pedido> obtenerPedidoPorEstado(String estado) {
        return pedioRepository.findByEstado(estado);
    }
}


