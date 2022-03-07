package IntroPOO;

public class Patinete {
	private String nomeModelo;
	private boolean bateriaCheia, ligada, desligada;
	
	public Patinete(String nomeModelo, boolean bateriaCheia, boolean ligada, boolean desligada)
	{
		this.nomeModelo = nomeModelo;
		this.bateriaCheia = bateriaCheia;
		this.ligada = ligada;
		this.desligada = desligada;
		this.andarPatinete();
	}	
	 
	 public void desligada() {
			bateriaCheia=false;
		}
	 
	 public void ligada() {
			bateriaCheia=true;
		}

	public void andarPatinete() {
		if (bateriaCheia == true) 
			System.out.println("Ligando patinete...");
		else
			System.out.println("Verifique a bateria");
	}
	
	public void status() {
		System.out.println("O aparelho está ligado? "+ this.bateriaCheia);
	}
}
