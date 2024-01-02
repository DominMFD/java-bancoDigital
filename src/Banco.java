import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco (String nome) {
		this.contas = new ArrayList<Conta>();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(Conta conta) {
		this.contas.add(conta);
	}

	public void ExibirContas() {
		System.out.println(nome);
		for (Conta conta : contas) {
			conta.imprimirExtrato();
		};
	}

}
