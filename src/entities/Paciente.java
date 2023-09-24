package entities;

public class Paciente extends Pessoa{
	
	private String doenca;
	private String medicacao;
	
	public Paciente(String nome, String endereco, int idade, String cpf, char sexo, String doenca, String medicacao) {
		super(nome, endereco, idade, cpf, sexo);
		this.doenca = doenca;
		this.medicacao = medicacao;
	}
	
	public void imprimirValores() {
		super.imprimirValores();
		System.out.println("Doença: "+getDoenca()+"\nMedicação: "+getMedicacao());
	}
	
	public void sentirDor() {
		System.out.println("Paciente sentindo Dor");
	}
	
	public void alta() {
		System.out.println("Paciente teve Alta");
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
	
	
	
}
