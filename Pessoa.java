package banco;

public abstract class Pessoa {
	int idade;
	protected String nome;
	protected String sobrenome;
	protected String cpf;
	Double altura;
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return 
		"\nCPF= " + getCpf()
		+"\nIdade= " + getIdade() +"anos"
		+"\nNome= " + getNome() 
		+" "+ getSobrenome()  
		+"\nAltura= " + String.format("%.2f",getAltura());
	}
	
	
}
