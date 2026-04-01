package entidades;

public class ContaPoupanca extends Conta{
    private String name;
    private String nascimento;

    public ContaPoupanca(String agencia, String conta) {
        super(agencia, conta);
    }

    @Override
    public String depositar(double valor) {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String sacar(double valor) {
        return null;
    }
}
