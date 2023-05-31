package joao;
import java.util.Scanner;
public class ContaATM {
	public static void main(String Args[]) {
		Scanner teclado = new Scanner(System.in);
		String cpf;
		int conta, ask;
		float saldo, valor;
		ContaCorrente contacc = new ContaCorrente();
		ContaPoupanca contapp = new ContaPoupanca();
		System.out.println("CPF do cliente:");
		cpf = teclado.next();
		contacc.setCpfDono(cpf);
		contapp.setCpfDono(cpf);
		System.out.println("CPF do cliente " + contacc.getCpfDono()+"//"+contapp.getCpfDono());
		System.out.println("Numero da conta da cc:");
		conta = teclado.nextInt();
		contacc.setNumeroConta(conta);
		System.out.println("Numero da conta da pp:");
		conta = teclado.nextInt();
		contapp.setNumeroConta(conta);
		System.out.println("Saldo da conta da cc:");
		saldo = teclado.nextFloat();
		contacc.setSaldoCC(saldo);
		System.out.println("Saldo da conta da pp:");
		saldo = teclado.nextFloat();
		contapp.setSaldoCP(saldo);
		System.out.println("1-sacar cc\n2-depositar cc\n3-sacar cp\n4-depositar cp");
		ask = teclado.nextInt();
		switch(ask) {
		case 1:
		System.out.println("valor p sacar: ");
		valor = teclado.nextFloat();
		contacc.sacar(saldo, valor);
		default:
		System.out.println("Invalido");
		}
		System.out.println("novo saldo cc:"+contacc.getSaldoCC());
	}
}
