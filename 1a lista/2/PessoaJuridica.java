
public class PessoaJuridica extends Pessoa{
	private String CNPJ;
	public PessoaJuridica(String CNPJ, String nome, int idade) {
		super(nome, idade);
		setCNPJ(CNPJ);
	}
	void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	String getCNPJ() {
		return CNPJ;
	}

}
