
abstract class Veiculo {
	private String placa;
	private int ano;
	public Veiculo(String placa, int ano) {
		setAno(ano);
		setPlaca(placa);
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	abstract void exibirDados();
}
