package projfinal;

import javax.xml.crypto.Data;

public class Contato extends Pessoa{
	int telefone;
	String email;
	int ddd;
	
	
	public Contato(String nome, String endereco, String bairro, int cep, String cidade, String estado,
			Data dtnascimento, int cpf) {
		super(nome, endereco, bairro, cep, cidade, estado, dtnascimento, cpf);
		// TODO Auto-generated constructor stub
		this.bairro = bairro;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.dtnascimento = dtnascimento;
		this.estado = estado;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
}
