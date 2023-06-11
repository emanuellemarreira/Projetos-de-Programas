
public class PessoaFisica extends Pessoa {
	private String CPF;
	public PessoaFisica(String CPF, String nome, int idade) {
		super(nome, idade);//envia nome pra superclasse
		setCPF(CPF);
		
		
	}
	void setCPF(String CPF) {
		this.CPF = CPF;
	}
	String getCPF() {
		return CPF;
	}
}
