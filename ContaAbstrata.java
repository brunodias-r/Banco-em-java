package banco;

public abstract class ContaAbstrata {
	private int numero;
	protected double saldo;
	private double limite;
	private Cliente cliente;
	
	public ContaAbstrata() {
		this.cliente = new Cliente();
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	boolean sacar(double valor) {
		if(valor<=limite+saldo) {
			this.saldo-=valor;
			//this.saldo=saldo-valor;
			return true;
		}
			return false;
	}
	
	void depositar(double valor) {
		this.saldo+=valor;
	}
	
	abstract void correcaoMensal(double taxa);
}
