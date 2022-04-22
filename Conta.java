package banco;

public class Conta extends ContaAbstrata {
	
	@Override
	void correcaoMensal(double taxa) {
		this.saldo += this.saldo*1.05;
	}

	@Override
	public String toString() {
		return 
		"\nConta "	
		+"\nNumero= " + getNumero() 
		+"\nSaldo= R$ " + String.format("%.2f",getSaldo())
		+"\nLimite= R$ " + String.format("%.2f",getLimite());
	}
}
