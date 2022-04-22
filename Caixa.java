package banco;

public class Caixa extends Funcionario implements AcessoInterno{
	private int senha;

	@Override
	public boolean verificar(int senha) {
		return false;
	}
	
	@Override
	public double getBonus() {
		return super.getBonus() + 500;
	}
	
//	@Override
//	public String toString() {
//		return 
//		"\nCaixa "
//		+"\nNome= " + getNome()+" "+getSobrenome()
//		+"\nCPF= " + getCpf() 
//		+"\nDepartamento= " + getDepartamento() 
//		+"\nData de Admissão= R$ "+ getDataAdmissao() 
//		+"\nSalário= R$ " + String.format("%.2f",getSalario())
//		+"\nBonus= R$ " + String.format("%.2f",getBonus())
//		+"\nStatus= " + getStatus();
//	}
}
