package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.controller.UsuarioDto;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {

        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();
        repositorio.cadastrarUsuario(new Usuario("126.123.123-45", "RODRIGO", LocalDate.parse("2000-10-15"), "teste@gmail.com"));
        repositorio.cadastrarUsuario(new Usuario("126.123.123-45", "Maria", LocalDate.parse("2000-10-15"), "teste@gmail.com"));
        repositorio.cadastrarUsuario(new Usuario("126.123.123-45", "Fulano", LocalDate.parse("2000-10-15"), "teste@gmail.com"));
        repositorio.cadastrarUsuario(new Usuario("126.123.123-45", "Beltrano", LocalDate.parse("2000-10-15"), "teste@gmail.com"));
        System.out.println(repositorio.listarTodos());

        repositorio.gravarEmArquivo("testeArquivo");

    }
}
