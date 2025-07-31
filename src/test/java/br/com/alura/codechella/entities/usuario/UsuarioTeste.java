package br.com.alura.codechella.entities.usuario;

import br.com.alura.codechella.domain.entities.usuario.FabricaDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTeste {

    @Test
    public void naoDeveCadastrarCpfComFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario("123", "teste", LocalDate.now(), "teste"));
    }

    @Test
    public void deveCriarUsuarioComAFabrica(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("teste", "123.123.123-12", LocalDate.now());
        Assertions.assertEquals(usuario.getNome(), "teste");
    }

    @Test
    public void deveCriarUsuarioComAFabricaIncluirEndereco(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("teste", "123.123.123-12", LocalDate.now());
        usuario = fabrica.incluirEndereco("89669000", 40, "apto");
        Assertions.assertEquals(usuario.getEndereco().getNumero(), 40);
    }
}
