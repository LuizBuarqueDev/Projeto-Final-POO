package ifpe.Pessoas;

import ifpe.sistema.Endereco;
import ifpe.sistema.Telefone;

public abstract class PessoaFisica {
	
	protected String nome;
	protected String rg;
	protected String endereco;
	protected Telefone telefone;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	
	public PessoaFisica(String nome, String rg, Endereco endereco, Telefone telefone) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
