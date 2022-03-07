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
		System.out.println("O nome do cliente é: "+this.nomeCliente);
		System.out.println("O número da conta é: "+ this.numeroConta + "\nCom o saldo de: " + this.saldoConta);
	}
}
