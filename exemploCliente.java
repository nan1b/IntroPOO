package IntroPOO;

public class exemploCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente(); 
		Cliente c2 = new Cliente(); 
		
		c1.setNome("Cliente Silva");
		
		System.out.println(c1.getNome());
		
		c1.setEmail("Cliente@cliente.com");
		
		System.out.println(c1.getEmail());
	}
}
