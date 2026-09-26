package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    protected static final Scanner entrada = new Scanner(System.in);
    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    protected String nome;
    protected LocalDate dataNascimeto;
    protected String endereco;
    protected String telsContato;

    public void cadastrar() {
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Data de nascimento (dd/MM/aaaa): ");
        dataNascimeto = LocalDate.parse(entrada.nextLine(), FORMATO_DATA);
        System.out.print("Endereco: ");
        endereco = entrada.nextLine();
        System.out.print("Telefone para contato: ");
        telsContato = entrada.nextLine();
    }

    int obterIdade() {
        return Period.between(dataNascimeto, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(LocalDate dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }
}
