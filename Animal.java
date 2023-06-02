package joao;

class Animal {
	private String nome;
	///private float compr;
	///private int npatas;
	///private String cor;
	///private String ambiente;
	///private float velocmed;
	public Animal() {//o construtor tem que ter o mesmo nome da classe e nao pode ter void
		super();
		this.nome = "cachorro";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void relatorio() {
		System.out.println("Nome: "+getNome());
	}

	
}
