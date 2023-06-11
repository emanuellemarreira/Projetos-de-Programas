public class Circulo extends Forma {
	private double raio;
	public Circulo(String cor2) {
		super(cor2);
		// TODO Auto-generated constructor stub
	}
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
