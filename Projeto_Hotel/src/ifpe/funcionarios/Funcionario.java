package ifpe.funcionarios;

public class Funcionario extends Pessoa{
	
	protected String idFuncionario;
	protected String cargo = getClass().getSimpleName();
	
	public Funcionario(String nome, String cpf, String email, String idFuncionario) {
		super(nome, cpf, email);
		this.idFuncionario = idFuncionario;
	}

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
