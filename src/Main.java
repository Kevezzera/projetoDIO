//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContaCorrent cc = new ContaCorrent("0998080", "987970098-9");

    cc.setName("Keven Lima");
    cc.setNascimento("21/05/1996");
    cc.depositar(2000);
    cc.sacar(3000);

    System.out.println(cc.toString());
}
