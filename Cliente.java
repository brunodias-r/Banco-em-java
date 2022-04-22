package banco;

public class Cliente extends Pessoa implements AcessoInterno{
	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Cliente() {
	}

	public Cliente(String nome, String sobrenome, String cpf ) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	@Override
	public boolean verificar(int senha) {
		return false;
	}

//	@Override
//	public String toString() {
//		return 
//		"\nCliente "
//		+"\nCPF= " + getCpf()
//		+"\nNome= " + getNome()
//		+" "+ getSobrenome() 
//		+"\nIdade= " + getIdade() +" anos"  
//		+"\nAltura= " + String.format("%.2f",getAltura())+"m";
//	}
	
	
}
