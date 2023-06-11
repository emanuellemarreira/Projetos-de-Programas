import java.util.Scanner;

public class AcademiaMain {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("NOME:");
		String nome = teclado.next();
		System.out.println("IDADE:");
		int idade = teclado.nextInt();
		System.out.println("PESO:");
		float peso = teclado.nextFloat();
		System.out.println("ALTURA:");
		float altura = teclado.nextFloat();
		System.out.println("PRECO:");
		double preco = teclado.nextDouble();
		Academia acad = new Academia(nome, idade, peso, altura, preco);
		acad.imprimirDados(nome, idade, peso, altura, preco);
		if(acad.deMenor(idade)) {
			acad.daDesconto(preco);
		}
		acad.imprimirDados(nome, idade, peso, altura, preco);
		teclado.close();
	}
}
