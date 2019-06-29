package br.com.teste;

public class Main {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Treze do Vasco", "", "50740-370", "Vasco da Gama", "Recife", "PE", 69);
		Pessoa pessoa = new Pessoa("Matheus", "88896669", "66696654", 51, endereco);

		System.out.println(pessoa.getEndereco().getLogradouro());
		
		
		//Endereco novoEndereco = new Endereco("Rua Treze do Vasco", "", "50740-370", "Vasco da Gama", "Recife", "PE", 69);
		//pessoa.setEndereco(novoEndereco);
		
		pessoa.getEndereco().setLogradouro("Rua do meio");
		
		System.out.println(pessoa.getEndereco().getLogradouro());
		
		
	}

}
