package br.com.teste;

public class Pessoa {

	private String nome;
	private String rg;
	private String cpf;
	private int codigo;
	private Endereco endereco;



	public Pessoa(String nome, String rg, String cpf, int codigo, Endereco endereco) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
