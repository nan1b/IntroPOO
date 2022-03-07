package IntroPOO;

public class Paciente {
	String nomePaciente, statusPaciente;
	int idadePaciente,filaAtendimento;
	boolean convenio, temPrioridade;
	
	public Paciente(String nomePaciente, String statusPaciente, int idadePaciente, int filaAtendimento, boolean convenio, boolean temPrioridade) {
		this.nomePaciente = nomePaciente;
		this.statusPaciente = statusPaciente;
		this.filaAtendimento = filaAtendimento;
		this.idadePaciente = idadePaciente;
		this.convenio = convenio;
		this.prioridade();

	}

	public void prioridade() {
		if(this.idadePaciente>60) {
			System.out.println("Prioridade no atendimento!");
			this.filaAtendimento=1;
			System.out.println("Seu numero da fila é "+this.filaAtendimento);		
			}
	}
	public void status() {
		System.out.println("Nome do paciente: "+this.nomePaciente);
		System.out.println("Idade do paciente: "+this.idadePaciente);
		System.out.println("Sintomas do paciente: "+this.statusPaciente);
		System.out.println("Tem convênio? "+this.convenio);
	}
}
