import java.util.Scanner;
public class Contador {
	private int cont;
	public Contador(int cont) {
		setCont(cont);
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int getCont() {
		return cont;
	}
	
	public void zerarCont() {
		cont = 0;
	}
	
	public void incrementarCont() {
		cont++;
	}
	public static void main(String[] args) {
		int c, menu;
		String ask;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do contador:");
		c = teclado.nextInt();
		Contador conta = new Contador(c);
		ask = "sim";
		while(ask.equals("sim")) {
			System.out.println("Informe o que deseja fazer: ");
			System.out.println("1)zerar\n2)incrementar\n3)pegar o valor");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				conta.zerarCont();
				System.out.println("cont: "+conta.getCont());
				break;
			case 2:
				conta.incrementarCont();
				System.out.println("cont: "+conta.getCont());
				break;
			case 3:
				System.out.println(conta.getCont());
				break;
			default:
				System.out.println("invalido");
			}
			
			System.out.println("Deseja continuar?");
			ask = teclado.next();
			
		}
			
	}

}
