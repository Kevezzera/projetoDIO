import entidades.ContaCorrent;
import entidades.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContaCorrent cc = new ContaCorrent("0998080", "987970098-9");
    ContaPoupanca cp = new ContaPoupanca("0998080", "987970098-9");

    String cadastro =  cc.cadatro("Keven Lima", 1996, "60670252301");
    cc.depositar(2000);


    String divisao = "##########################";
    System.out.println("----- BANCARD -----");
    System.out.println(cadastro);
    System.out.println(divisao);
    System.out.println(cc.extrato());
}
