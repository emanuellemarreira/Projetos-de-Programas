
public class Empregado {
	private String nome;
	private String sobrenome;
	private double salariomensal;
	public Empregado(String nome, String sobrenome, double salariomensal) {
		setNome(nome);
		setSobrenome(sobrenome);
		setSalariomensal(salariomensal);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSalariomensal(double salariomensal) {
		this.salariomensal = salariomensal;
	}
	public double getSalariomensal() {
		return salariomensal;
	}
	public double salarioanual(double salariomensal) {
		return salariomensal*12;
	}
	public void darAumento(double porcentagem, double salariomensal) {
		setSalariomensal(salariomensal+(porcentagem/100)*salariomensal);
	}

}
