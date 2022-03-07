package IntroPOO;

public class Eletronico {
	private String nomeModelo;
	private boolean estaFuncionando, ligada, desligada;
	
	 
	 public void desligada() {
			estaFuncionando=false;
		}

	public void estaFuncionando() {
		if (estaFuncionando == true) 
			System.out.println("Ligando aparelho...");
		else
			System.out.println("Verifique o funcionamento");
	}
	
	public void status() {
		System.out.println("O aparelho está ligado? "+ this.estaFuncionando);
}
	
	
}
