package joao;

public class Circulo extends Forma {
	private double raio;
	void Triangulo(double raio, String cor) {// metodo quaalquer, nao eh construtor
		
	}
	public void setRaio(double base) {
		this.raio = base;
	}
	public double getRaio() {
		return raio;
	}
	public double area() {
		return raio*raio*3.14;
	}
	public double getDiametro() {
		return raio*2;
	}
	public String toString() {
		return String.valueOf(raio);
	}
	
}
