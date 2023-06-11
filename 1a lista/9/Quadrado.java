
public class Quadrado extends Retangulo{
	
	public Quadrado (double lado, String cor) {//construtor
		super(lado, lado, cor);
	}
	public String toString() {
		return String.valueOf(getLado1());
	}
}