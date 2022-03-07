package IntroPOO;

public class Funcionario {
	private String nomeFunc, setorFunc;
	private int numeroRegistro;
	private boolean estaAtivo, comportamentoBom, comportamentoRuim, promovido, demitido;
	
	public Funcionario(String nomeFunc, int numeroRegistro, String setorFunc, boolean comportamentoBom, boolean comportamentoRuim, boolean promovido, boolean demitido)
	{
		this.nomeFunc = nomeFunc;
		this.numeroRegistro = numeroRegistro;
		this.setorFunc = setorFunc;
		this.comportamentoBom = comportamentoBom;
		this.comportamentoRuim = comportamentoRuim;
		this.promovido = promovido;
		this.demitido = demitido;
	}


	public void demitir() {
		if(comportamentoRuim == true) {
			this.demitido = true;
		}else {
		this.demitido = false;
		}
	}
		
	public void promover() {
		if(comportamentoBom == true) {
			this.promovido = true;
		}else {
			this.promovido = false;
		}
	}
	
	public void status() {
		System.out.println("Nome: "+this.nomeFunc);
		System.out.println("Número do Funcionário: "+this.numeroRegistro);
		System.out.println("O setor é: "+ this.setorFunc);
		System.out.println("Será demitido? "+this.demitido);
		System.out.println("Será promovido? "+this.promovido);
	}
}
