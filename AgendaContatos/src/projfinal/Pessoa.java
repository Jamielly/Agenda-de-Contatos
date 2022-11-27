package projfinal;

import javax.xml.crypto.Data;

public class Pessoa extends Agenda{
	String nome;
	String endereco;
	String bairro;
	int cep;
	String cidade;
	String estado;
	Data dtnascimento;
	int cpf;
	
	public Pessoa(String nome, String endereco, String bairro, int cep, String cidade, String estado, Data dtnascimento,
			int cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.dtnascimento = dtnascimento;
		this.cpf = cpf;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Data getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(Data dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public char[] imprimeDados() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	