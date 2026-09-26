package tech.angelofdiasg.apps;

import tech.angelofdiasg.pessoas.Cliente;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String dadosCadastro = String.join(
                System.lineSeparator(),
                "Maria da Silva",
                "15/04/1990",
                "Rua das Flores, 123",
                "11987654321",
                "CLI-001",
                "Engenheira"
        ) + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(dadosCadastro.getBytes(StandardCharsets.UTF_8)));

        Cliente cliente = new Cliente();
        cliente.cadastrar();

        verificar("Maria da Silva".equals(cliente.getNome()), "nome");
        verificar(LocalDate.of(1990, 4, 15).equals(cliente.getDataNascimeto()), "data de nascimento");
        verificar("Rua das Flores, 123".equals(cliente.getEndereco()), "endereco");
        verificar("11987654321".equals(cliente.getTelsContato()), "telefone");
        verificar("CLI-001".equals(cliente.getCodigo()), "codigo");
        verificar("Engenheira".equals(cliente.getProfissao()), "profissao");
        System.out.println("Teste de cadastro de cliente aprovado.");
    }

    private static void verificar(boolean condicao, String campo) {
        if (!condicao) {
            throw new AssertionError("Cadastro de cliente incorreto: " + campo);
        }
    }
}
