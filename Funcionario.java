package banco;

public abstract class Funcionario extends Pessoa{
	private String cargo;
	private String departamento;
	private String dataAdmissao;
	private Double salario;
	private String status;
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBonus() {
		return this.salario * 0.05;
	}
	
	public String toString() {
		return 
		"\nCargo= "+getCargo()		
		+"\nNome= " + getNome()+" "+getSobrenome()
		+"\nCPF= " + getCpf() 
		+"\nDepartamento= " + getDepartamento() 
		+"\nData de Admissão= "+ getDataAdmissao() 
		+"\nSalário= R$ " + String.format("%.2f",getSalario())
		+"\nBonus= R$ " + String.format("%.2f",getBonus())
		+"\nStatus= " + getStatus();
	}
}
