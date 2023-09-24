package entities;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private int idade;
	private String cpf;
	private char sexo;
	
	public Pessoa(String nome, String endereco, int idade, String cpf, char sexo) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
		
	}
	
	public void andar() {
		System.out.println("Pessoa andando");
	}
	
	public void imprimirValores() {
		System.out.println("nome: "+getNome()+"\nendereço: "+getEndereco()+"\nidade: "+getIdade()+"\nCPF: "+getCpf()+"\nSexo: "+getSexo());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

}
