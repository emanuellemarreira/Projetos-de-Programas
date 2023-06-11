public class Academia {
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	private double preco;
	public Academia(String nome, int idade, float peso, float altura, double preco) {
		setNome(nome);
		setIdade(idade);
		setPeso(peso);
		setAltura(altura);
		setPreco(preco);
	}
	public boolean deMenor(int idade) {
		if(idade<18) {
			return true;
		}else {
			return false;
		}
	}
	public float calculaImc(float altura, float peso) {
		return peso/(altura*altura);
	}
	public void imprimirDados(String nome, int idade, float peso, float altura, double preco){
		System.out.println("NOME: "+ getNome());
		System.out.println("IDADE: "+ getIdade());
		System.out.println("PESO: "+ getPeso());
		System.out.println("ALTURA: "+ getAltura());
		System.out.println("IMC: "+ calculaImc(getAltura(), getPeso()));
		System.out.println("PAGAR: "+ getPreco());
		
	}
	public void daDesconto(double preco) {
		setPreco(preco-(0.1*preco));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
