package IntroPOO;

public class contaBancaria {
	String nomeCliente;
	int numeroConta;
	double saldoConta;
	boolean estaNegativo;
	private boolean estaPositivo;
	private boolean bloquearConta;

	public contaBancaria(String nomeCliente, int conta, double saldoConta, boolean negativo, boolean positivo) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = conta;
		this.saldoConta = saldoConta;
		this.estaNegativo = negativo;
		this.estaPositivo = positivo;
		this.bloquearConta();
	}

	private void bloquearConta() {
		if(saldoConta < 0) {
			this.bloquearConta = true;
			System.out.println("Conta bloqueada...");
		} else {
			this.bloquearConta = false;
		}
		
	}
	
	public void status() {
		System.out.println("O nome do cliente �: "+this.nomeCliente);
		System.out.println("O n�mero da conta �: "+ this.numeroConta + "\nCom o saldo de: " + this.saldoConta);
	}
}
