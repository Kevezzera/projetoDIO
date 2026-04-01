package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ContaCorrent extends Conta{

    //ATRIBUTOS
    private String name;
    private int nascimentoAno;
    private String cpf;
    private boolean cadastrado;

    //CONSTRUTOR
    public ContaCorrent(String agencia, String conta) {
        super(agencia, conta);
    }

    //GETTERS - SETERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNascimentoAno() {
        return nascimentoAno;
    }

    public void setNascimentoAno(int nascimentoAno) {
        this.nascimentoAno = nascimentoAno;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //METODOS PUBLICOS

    @Override
    public String sacar(double valor) {
        if(!this.cadastrado) return "ERRO! Usuario não cadastrado!";
        if (valor <= super.getSaldo()) super.setSaldo(super.getSaldo() - valor);
        return "ERRO! Saldo Insuficiente!";
    }

    @Override
    public String depositar(double valor){
        if(!this.cadastrado) return "ERRO! Usuario não cadastrado!";
        if(valor < 0) return  "ERRO! Valor invalido!";
        super.setSaldo(super.getSaldo() + valor);
        return  "SUCESSO! Deposito concluido!";
    }

    public String extrato(){
        if(!this.cadastrado) return "ERRO! Usuario não cadastrado!";
        String extrato =
                "agencia:   " + super.getAgencia() +
                "\nconta:     " + super.getConta() +
                "\ntitular:   " + getName() +
                "\nsaldo:     " + super.getSaldo() +
                "\nData       " + LocalDate.now();
        return extrato;
    }

    public String cadatro(String name, int ano, String cpf){
        if (name.length() < 3 ) return "ERRO! Nome muito curto!";
        if ((2026 - ano) < 18) return "ERRO! Você ainda é menor de idade!";
        if (cpf.length() != 11) return "ERRO! CPF invalido";
        setName(name);
        setCpf(cpf);
        setNascimentoAno(ano);
        setCadastrado(true);
        return "Cadastrado! Seja Bem Vindo(a) " + this.name + "!👋";
    }

}
