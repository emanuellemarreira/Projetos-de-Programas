import java.util.Scanner;
public class calculadora_e_tabuada {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String args[]) {
		float n1 = 0, n2 = 0;
		int n3 = 0;
		String ask = "sim";
		System.out.print("1-SOMA\n2-SUBTRACAO\n3-MULTIPLICACAO\n4-DIVISAO\n5-TABUADA\n=");
		menu(n1, n2, n3);
		System.out.println("\nDeseja continuar? 'sim' ou 'nao' =");
		ask = teclado.next();
		if(ask.equals("sim")){
			main(null);
		}
	
	}
	static void menu(float n1, float n2, int n3) {
		int menu = teclado.nextInt();
		switch (menu) {
		case 1:
			soma(n1, n2);
			break;
		case 2:
			subtracao(n1, n2);
			break;
		case 3:
			multiplicacao(n1, n2);
			break;
		case 4:
			divisao(n1, n2);
			break;
		case 5: 
			tabuada(n3);
			break;
		default:
			while(menu<1 || menu>5) {
				 System.out.println("VALOR INVALIDO\ntente novamente: ");
				 menu = teclado.nextInt();
			}
		}
	}
	static void soma(float n1, float n2) {
		System.out.println("digite o primeiro numero =");
		n1 = teclado.nextFloat();
		System.out.println("digite o segundo numero =");
		n2 = teclado.nextFloat();
		System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1+n2);
	}
	static void subtracao(float n1, float n2) {
		System.out.println("digite o primeiro numero =");
		n1 = teclado.nextFloat();
		System.out.println("digite o segundo numero =");
		n2 = teclado.nextFloat();
		System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1-n2);
	}
	static void multiplicacao(float n1, float n2) {
		System.out.println("digite o primeiro numero =");
		n1 = teclado.nextFloat();
		System.out.println("digite o segundo numero =");
		n2 = teclado.nextFloat();
		System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1*n2);
	}
	static void divisao(float n1, float n2) {
		System.out.println("digite o primeiro numero =");
		n1 = teclado.nextFloat();
		System.out.println("digite o segundo numero =");
		n2 = teclado.nextFloat();
		System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1/n2);
	}
	static void tabuada(int n3) {
		System.out.println("digite o numero =");
		n3 = teclado.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.println(n3 + " * " + i + " = " + (n3*i));
		}
	}
	 
}
