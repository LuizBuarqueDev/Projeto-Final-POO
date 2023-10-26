package ifpe;

public class Funcionario extends Pessoa{
	
	protected String idFuncionario;
	protected String cargo = getClass().getSimpleName();
	
	public Funcionario(String nome, String cpf, String email, String idFuncionario, String cargo) {
		super(nome, cpf, email);
		this.idFuncionario = idFuncionario;
		this.cargo = cargo;
	}

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
}
