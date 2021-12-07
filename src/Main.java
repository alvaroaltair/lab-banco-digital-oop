public class Main {

    public static void main(String[] args) {
        Cliente alvaro = new Cliente();
        alvaro.setNome("Alvaro");

        Conta cc = new ContaCorrente(alvaro);
        Conta poupanca = new ContaPoupanca(alvaro);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
