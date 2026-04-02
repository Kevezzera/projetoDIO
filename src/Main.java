import entidades.ContaCorrent;
import entidades.ContaPoupanca;


void main() {
    ContaCorrent cc = new ContaCorrent("0998080", "987970098-9");
    ContaPoupanca cp = new ContaPoupanca("0998080", "987970098-9");

    String cadastro =  cp.cadatro("Keven Lima", 1996, "60670252301");
    String dep = cp.depositar(2000);
    String sac = cp.sacar(500);

    String divisao = "##########################";
    System.out.println("----- BANCARD -----");
    System.out.println(cadastro);
    System.out.println(dep);
    System.out.println(sac);
    System.out.println(divisao);
    System.out.println(cp.extrato());
}
