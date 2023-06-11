
public class Caminhao extends Veiculo{
	private int eixos;
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		setEixos(eixos);
	}
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public void exibirDados() {
		System.out.println("CAMINHAO:: PLACA "+ getPlaca() + " ANO "+ getAno() +" EIXOS " + getEixos());
	}
}
