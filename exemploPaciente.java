package IntroPOO;

public class exemploPaciente {
	public static void main(String[] args) {
			
			Paciente p1 = new Paciente("Paciente 1", "Dor no corpo", 25, 35, false,false);
			Paciente p2 = new Paciente("Paciente 2", "Dor de cabeça", 42, 2, false,true);

			p1.status();
			p2.status();
		}
}
