import java.util.Scanner;
public class questao1 {

	public static void main(String[] args) {
		float a,b,c, delta;
		double r2;
		double r1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("a: ");
		a = teclado.nextFloat();
		System.out.println("b: ");
		b = teclado.nextFloat();
		System.out.println("c: ");
		c = teclado.nextFloat();
		delta = b*b - 4*a*c;
		r1 = (-b+Math.sqrt(delta))/(2*a);
		r2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.printf("%.2fx^2 + %.2fx + %.2f = 0 tem raizes %.2f e %.2f",a,b,c,r1,r2);
	}

}
