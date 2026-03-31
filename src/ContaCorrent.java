import java.time.LocalDate;

public class ContaCorrent extends Conta{
    private String name;
    private String nascimento;

    public ContaCorrent(String agencia, String conta) {
        super(agencia, conta);

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
    public String toString() {

        String text = super.toString();
        return "ContaCorrent{" + text +
                "name='" + name + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }



    @Override
    public void sacar(double valor) {
        if (valor <= super.getSaldo()){
            super.setSaldo(super.getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

}
