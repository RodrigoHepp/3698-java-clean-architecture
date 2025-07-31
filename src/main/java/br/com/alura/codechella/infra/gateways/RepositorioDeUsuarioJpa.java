package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repositorio;
    private final UsuarioEntityMapper entityMapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository repositorio, UsuarioEntityMapper entityMapper) {
        this.repositorio = repositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity usuarioEntity =  entityMapper.toEntity(usuario);
        return entityMapper.toDomain(repositorio.save(usuarioEntity));
    }

    @Override
    public List<Usuario> listarTodos() {
        return List.of();
    }
}
