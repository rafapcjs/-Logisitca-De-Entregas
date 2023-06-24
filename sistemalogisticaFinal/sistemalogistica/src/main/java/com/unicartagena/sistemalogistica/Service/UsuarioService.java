package com.unicartagena.sistemalogistica.Service;

import com.unicartagena.sistemalogistica.entity.Pedido;
import com.unicartagena.sistemalogistica.entity.Usuario;
import com.unicartagena.sistemalogistica.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    //Buscar todo o listar
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();

    }

    //Buscar por ID
    public Optional<Usuario> getUsuario(Long id){
        return usuarioRepository.findById(id);

    }

    //Guardar o actualizar
    public void saveOrUpdate(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void Update(Usuario usuario){
        usuarioRepository.save(usuario);
    }


    //Eliminar por ID
    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> buscarPorNombre(String Nombre) {
        return usuarioRepository.findByNombre(Nombre);
    }

}
