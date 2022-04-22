package banco;

public class Gerente extends Funcionario implements AcessoInterno{
	private int senha;
	
	public boolean verificar(int senha){
		if(this.senha==senha) {
			System.out.println("Acesso autorizado.");
			return true;
		}else {
			System.out.println("Acesso NÃO autorzado.");
			return false;
		}
	}
	
	@Override
	public double getBonus() {
		return super.getBonus() + 2000;
	}
	
//	@Override
//	public String toString() {
//		return 
//		"\nGerente "
//		+"\nNome= " + getNome()+" "+getSobrenome()
//		+"\nCPF= " + getCpf() 
//		+"\nDepartamento= " + getDepartamento()
//		+"\nData de Admissão= "+ getDataAdmissao() 
//		+"\nSalário= R$ " + String.format("%.2f",getSalario()) 
//		+"\nBonus= R$ " + String.format("%.2f",getBonus())
//		+"\nStatus= " + getStatus();
//	}
}
