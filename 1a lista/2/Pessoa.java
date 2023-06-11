
abstract class Pessoa {
	private String nome;
	private int idade;
	public Pessoa(String nome2, int idade2) {
		setNome(nome2);
		setIdade(idade2);
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
