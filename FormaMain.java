package joao;

public class FormaMain {
	public static void main(String args[]) {
		Circulo c = new Circulo();
		Triangulo t = new Triangulo(2, 2, "azul");//como tem construtor tenhoo que passar valores
		Retangulo r = new Retangulo(2, 2, "verde");
		Quadrado q = new Quadrado(2, "preto");
		c.setRaio(2);
		System.out.println("area do circulo " + c.area());
		System.out.println("area do triangulo " + t.area());
		System.out.println("area do retangulo " + r.area());
		System.out.println("area do quadrado " + q.area());
		
	}
}
