package tech.angelofdiasg.pessoas;

public class Cliente extends Pessoa {
    protected String codigo;
    protected String profissao;

    @Override
    public void cadastrar() {
        super.cadastrar();
        System.out.print("Codigo do cliente: ");
        codigo = entrada.nextLine();
        System.out.print("Profissao: ");
        profissao = entrada.nextLine();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
