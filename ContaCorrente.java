package joao;

public class ContaCorrente extends ContaCliente{
	private float saldocc;

	public void setSaldoCC(float saldocc) {
		this.saldocc = saldocc;
	}
	public float getSaldoCC() {
		return saldocc;
	}
	public void sacar(float saldo, float valor) {
		this.saldocc = this.saldocc - valor;
	}
	public void depositar(float saldo, float valor) {
		this.saldocc = this.saldocc + valor;
	}
	
}
