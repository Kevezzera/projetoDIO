public abstract class Conta implements Regras{
    private String agencia;
    private String conta;
    private double saldo;

    public Conta(String agencia, String conta) {
        setAgencia(agencia);
        setConta(conta);
        setSaldo(0);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.setSaldo(this.saldo + valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public abstract void sacar(double valor);
}
