public class Triangulo extends Forma{
	private double base;
	private double altura;
	public Triangulo(double base, double altura, String cor) {//metodo construtor
		super(cor);
		setBase(base);
		setAltura(altura);
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public double area() {
		return (base*altura)/2;
	}
	public String toString() {
		return String.valueOf(altura);
	}
	
}
