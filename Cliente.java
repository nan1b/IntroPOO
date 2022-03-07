package IntroPOO;

public class Cliente {
	private String nome, email;
	private int numeroCadastro;
	private boolean cadastroAtivo;
	
	public void cadastrar() {
		if (cadastroAtivo == true) 
			System.out.println("Erro! Ative seu cadastro");
		else
			System.out.println("Ativando seu cadastro");
		
	}
	
	public void naoCadastrar() {
		cadastroAtivo = false;
	}
	 
	 public String getNome() {
			return nome;
		}
	 
	 public void setNome(String nome) {
			this.nome = nome;
		}
	 
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		public boolean isAtivo() {
			return cadastroAtivo;
		}

		public void setTampada(boolean cadastroAtivo) {
			this.cadastroAtivo = cadastroAtivo;
		}
		
		public void status() {
				System.out.println("Seu cadastro �: "+this.numeroCadastro);
				System.out.println("Est� ativo? "+ this.cadastroAtivo);
				System.out.println("Informa��es cadastro: "+this.nome + this.email);
		}

}