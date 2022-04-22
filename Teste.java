package banco;

public class Teste {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNumero(1245);
		c1.setLimite(2000);
		c1.setSaldo(1000);
		c1.depositar(700);
		c1.sacar(200);
		System.out.println(c1);
		
		Cliente cl1 = new Cliente();
		cl1.setSenha(123456);
		cl1.setIdade(50);
		cl1.setNome("João");
		cl1.setSobrenome("Ramos");
		cl1.setCpf("12345678910");
		cl1.setAltura(1.80);
		System.out.println(cl1);
		
		Gerente g1 = new Gerente();
		g1.setCargo("Gerente");
		g1.setNome("Ricardo");
		g1.setSobrenome("Dias");
		g1.setCpf("12345678911");
		g1.setDepartamento("Gestão"); 
		g1.setDataAdmissao("15/08/2015");
		g1.setSalario(8000); 
		g1.setAltura(1.80);
		g1.setStatus("Trabalhando");
		System.out.println(g1);
		
		Caixa cx1 = new Caixa();
		cx1.setCargo("Caixa");
		cx1.setNome("Juan");
		cx1.setSobrenome("Gonçalo");
		cx1.setCpf("1234567912");
		cx1.setDepartamento("Atendimento"); 
		cx1.setDataAdmissao("12/02/2017");
		cx1.setSalario(2000); 
		cx1.setStatus("Trabalhando");
		System.out.println(cx1);
	}
}
