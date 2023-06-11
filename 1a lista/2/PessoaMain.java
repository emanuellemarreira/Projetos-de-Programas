import java.util.Scanner;
public class PessoaMain {
	Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("012.345.678-90", "joao", 19);
		PessoaJuridica pj = new PessoaJuridica("0123456/0001", "maria", 20);
		System.out.println("PESSOA FISICA "+ pf.getCPF()+" " + pf.getNome()+" "+ pf.getIdade());
		System.out.println("PESSOA JURIDICA"+ pj.getCNPJ()+" " + pj.getNome()+" "+ pj.getIdade());

	}

}
