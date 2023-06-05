package joao;

public class Quadrado extends Retangulo{
	
	public Quadrado (double lado, String cor) {//construtor
		super(lado, lado, "vermelho");
		//setBase(2);
		//setAltura(2);
	}
	public String toString() {
		return String.valueOf(getLado1());
	}
}
