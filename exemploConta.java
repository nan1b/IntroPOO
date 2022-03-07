package IntroPOO;

public class exemploConta {
	public static void main(String[] args) {
		contaBancaria c1 = new contaBancaria("Cliente 1", 1234, -100, true, false); 
		c1.status();
		contaBancaria c2 = new contaBancaria("Cliente 2", 8888, 5000, false, true);
		c2.status();
	}

}
