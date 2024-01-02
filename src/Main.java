public class Main {

	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");

		Banco banco = new Banco("Caixa");
		
		Conta cc = new ContaCorrente(matheus);
		banco.setContas(cc);
		Conta poupanca = new ContaPoupanca(matheus);
		banco.setContas(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.ExibirContas();


	}

}
