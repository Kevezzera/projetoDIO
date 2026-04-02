package entidades;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String agencia, String conta) {
        super(agencia, conta);
    }

    @Override
    public String depositar(double valor) {
        if(!this.isCadastrado()) return "ERRO! Usuario não cadastrado!";
        if(valor < 0) return  "ERRO! Valor invalido!";
        super.setSaldo(super.getSaldo() + valor);
        return  "SUCESSO! Deposito concluido!";
    }

    @Override
    public String sacar(double valor) {
        if(!this.isCadastrado()) return "ERRO! Usuario não cadastrado!";
        if (valor > getSaldo()) return "ERRO! Saldo insuficiente";
        setSaldo(getSaldo() - valor);
        return "AGUARDE! Sacando o dinheiro!";
    }

    public String extrato(){
        if(!super.isCadastrado()) return "ERRO! Usuario não cadastrado!";
        String extrato =
                "CONTAPOUPANÇA: "+
                "\nagencia:   " + super.getAgencia() +
                        "\nconta:     " + super.getConta() +
                        "\ntitular:   " + getNome() +
                        "\nsaldo:     " + super.getSaldo() +
                        "\nData       " + LocalDate.now();
        return extrato;
    }

    public String cadatro(String name, int ano, String cpf){
        if (name.length() < 3 ) return "ERRO! Nome muito curto!";
        if ((2026 - ano) < 18) return "ERRO! Você ainda é menor de idade!";
        if (cpf.length() != 11) return "ERRO! CPF invalido";
        setNome(name);
        setCpf(cpf);
        setAnoNascimento(ano);
        setCadastrado(true);
        return "Usuário Cadastrado! Seja Bem Vindo(a) " + getNome() + "!👋";
    }
}
