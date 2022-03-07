package IntroPOO;

public class exemploFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ro",1234, "vendas", false, true, false, false);
		f1.promover();
		f1.status();
		
		Funcionario f2 = new Funcionario("Fe",9999, "marketing", true, false, true, false);
		f2.demitir();
		f2.status();
	}
}
