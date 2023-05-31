package joao;

public class ContaPoupanca extends ContaCliente{
	private float saldocp;
	
	public void setSaldoCP(float saldocp) {
		this.saldocp = saldocp;
	}
	public float getSaldoCP() {
		return saldocp;
	}
	public void sacar(float saldo, float valor) {
		this.saldocp = this.saldocp - valor;
	}
	public void depositar(float saldo, float valor) {
		this.saldocp = this.saldocp + valor;
	}
	
	
}
