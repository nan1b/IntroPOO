package IntroPOO;

public class Aviao {
	private String nomeModelo;
	private int numeroVoo, lotacaoPessoas, capacidadeMax;
	private boolean decolarAviao;
	
	public Aviao(String modeloAviao, int numVoo, int lotacao, int capacidade)
	{
		this.nomeModelo = modeloAviao;
		this.numeroVoo = numVoo;
		this.lotacaoPessoas = lotacao;
		this.capacidadeMax = capacidade;
		this.decolarAviao();
	}

	private void decolarAviao() {
		if(lotacaoPessoas <= capacidadeMax) {
			this.decolarAviao = true;
		} else {
			this.decolarAviao = false;
		}
	}
	
	public void status() {
		System.out.println("O modelo do avi�o �: "+this.nomeModelo);
		System.out.println("O n�mero do voo �: "+ this.numeroVoo);
		System.out.println("A capacidade m�xima do avi�o �: "+this.capacidadeMax);
		System.out.println("Qual a quantidade de pessoas no voo? "+this.lotacaoPessoas);
		System.out.println("Pronto para levantar voo? "+this.decolarAviao);
	}
}
