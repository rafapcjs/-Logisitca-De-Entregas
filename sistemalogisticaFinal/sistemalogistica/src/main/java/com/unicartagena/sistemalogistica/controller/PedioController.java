package com.unicartagena.sistemalogistica.controller;

import com.unicartagena.sistemalogistica.Service.PedidoService;
import com.unicartagena.sistemalogistica.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/pedido")
public class PedioController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/listar")
    public List<Pedido> getAll(){
        return pedidoService.GetPedio();
    }

    @GetMapping("/{pedidoid}")
    public Optional<Pedido> getById(@PathVariable("pedidoid") Long pedidoid){
        return pedidoService.getpedidoid(pedidoid);
    }

    //Guardar
    @PostMapping("/crear")
    public Pedido saveUpdate(@RequestBody Pedido pedido){
        pedidoService.saveOrUpdate(pedido);

    return pedido;
    }

    //Actualizar
    @PutMapping("/modificar")
    public Pedido Update(@RequestBody Pedido pedido){
        pedidoService.saveOrUpdate(pedido);

        return pedido;
    }

    //Eliminar
    @DeleteMapping("/{pedidoid}")
    public void saveUpdate(@PathVariable("pedidoid") Long pedidoid){
        pedidoService.delete(pedidoid);
    }

    @GetMapping("/buscar-por-nombre")
    public ResponseEntity<List<Pedido>> buscarPorNombre(@RequestParam("nombre") String nombreProducto) {
        List<Pedido> pedidos = pedidoService.buscarPorNombreProducto(nombreProducto);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/obtenerPedidoPorGuia/{guia}")
    public Optional<Pedido> obtenerPedidoPorGuia(@PathVariable Long guia) {
        return pedidoService.obtenerPedidoPorGuia(guia);
    }

    @GetMapping("/obtenerPedidoPorEstado/{estado}")
    public Optional<Pedido> obtenerPedidoPorEstado(@PathVariable String estado) {
        return pedidoService.obtenerPedidoPorEstado(estado);
    }

    }
