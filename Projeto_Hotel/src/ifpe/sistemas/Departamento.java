package ifpe.sistemas;

import java.util.List;

import ifpe.funcionarios.Funcionario;

public class Departamento {
	
	private String nome; 
	private List<Funcionario> funcionarios;
	
	public Departamento(String nome, List<Funcionario> funcionarios) {
		super();
		this.nome = nome;
		this.funcionarios = funcionarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
