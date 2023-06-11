public class FormaMain {
	public static void main(String args[]) {
		Circulo c = new Circulo("rosa");
		Triangulo t = new Triangulo(2, 2, "azul");//como tem construtor tenhoo que passar valores
		Retangulo r = new Retangulo(2, 2, "verde");
		Quadrado q = new Quadrado(2, "preto");
		c.setRaio(2);
		System.out.println("circulo: area " + c.area()+" diametro "+ c.getDiametro() +" cor "+ c.getCor());;
		System.out.println("triangulo: area " + t.area() +" cor "+ t.getCor() );
		System.out.println("retangulo: area " + r.area()+" cor "+ r.getCor());
		System.out.println("quadrado: area " + q.area()+" tostring "+ q.toString() + " cor " + q.getCor());
		
	}
}