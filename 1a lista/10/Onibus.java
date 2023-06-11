
public class Onibus extends Veiculo {
	private int qtdAassentos;
	public Onibus(String placa, int ano, int qtdAssentos) {
		super(placa, ano);
		setQtdAassentos(qtdAssentos);
	}
	public int getQtdAassentos() {
		return qtdAassentos;
	}
	public void setQtdAassentos(int qtdAassentos) {
		this.qtdAassentos = qtdAassentos;
	}
	public void exibirDados() {
		System.out.println("ONIBUS:: PLACA "+ getPlaca() + " ANO "+ getAno() +" QTD ASSENTOS " + getQtdAassentos());
	}

}
