package entities;

public class Medico extends Pessoa{

	private String crm;
	private double salario;
	private String especializacao;
	
	public Medico(String nome, String endereco, int idade, String cpf, char sexo, String crm, double salario,
			String especializacao) {
		super(nome, endereco, idade, cpf, sexo);
		this.crm = crm;
		this.salario = salario;
		this.especializacao = especializacao;
	}
	
	public void plantao() {
		System.out.println("Médico dando plantão");
	}
	
	public void imprimirValores() {
		super.imprimirValores();
		System.out.println("Crm: "+getCrm()+"\nSalário: "+String.format("%.2f",getSalario())+"\nEspecialização: "+getEspecializacao());
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	
	
}
