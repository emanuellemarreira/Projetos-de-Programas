
public class PessoaJuridica extends Pessoa{
	private String CNPJ;
	public PessoaJuridica(String CNPJ, String nome, int idade) {
		super(nome, idade);
		setCNPJ(CNPJ);
	}
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public String getCNPJ() {
		return CNPJ;
	}

}
