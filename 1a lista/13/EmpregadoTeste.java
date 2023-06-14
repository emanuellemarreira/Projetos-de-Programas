
public class EmpregadoTeste {
	
	public static void main(String[] args) {
		Empregado a = new Empregado("Fulano", "da Silva", 100);
		Empregado b = new Empregado("Ciclano", "Marreira", 200);
		System.out.println("Salario anual de a: "+ a.salarioanual(a.getSalariomensal()));
		System.out.println("Salario anual de b: "+ b.salarioanual(b.getSalariomensal()));
		a.darAumento(10, a.getSalariomensal());
		b.darAumento(10, b.getSalariomensal());
		System.out.println("NOVO Salario anual de a: "+ a.salarioanual(a.getSalariomensal()));
		System.out.println("NOVO Salario anual de b: "+ b.salarioanual(b.getSalariomensal()));
		
	}

}
