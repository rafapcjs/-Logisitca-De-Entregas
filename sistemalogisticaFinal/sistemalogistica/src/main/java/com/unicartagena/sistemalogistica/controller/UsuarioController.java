package com.unicartagena.sistemalogistica.controller;

import com.unicartagena.sistemalogistica.Service.UsuarioService;
import com.unicartagena.sistemalogistica.entity.Empleados;
import com.unicartagena.sistemalogistica.entity.Pedido;
import com.unicartagena.sistemalogistica.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listar")
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{usuarioid}")
    public Optional<Usuario> getById(@PathVariable("usuarioid") Long usuarioid){
        return usuarioService.getUsuario(usuarioid);
    }

    //Guardar o actualizar
    @PostMapping("/guardar")
    public Usuario saveUpdate(@RequestBody Usuario usuario){
        usuarioService.saveOrUpdate(usuario);
        return usuario;
    }

    @PutMapping("/modificar")
    public Usuario Update(@RequestBody Usuario usuario){
        usuarioService.saveOrUpdate(usuario);
        return usuario;
    }

    //Eliminar
    @DeleteMapping("/{usuarioid}")
    public void saveUpdate(@PathVariable("usuarioid") Long usuarioid){
        usuarioService.delete(usuarioid);
    }

    @GetMapping("/buscar-por-nombre")
    public ResponseEntity<List<Usuario>> buscarPorNombre(@RequestParam("nombre") String Nombre) {
        List<Usuario> usuarios = usuarioService.buscarPorNombre(Nombre);
        return ResponseEntity.ok(usuarios);
    }


}
