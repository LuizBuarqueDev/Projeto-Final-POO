package ifpe.funcionarios;

public class CEO  extends Funcionario{
	private float parteDaEmpresa;

	public CEO(String nome, String cpf, String email, String idFuncionario, float parteDaEmpresa) {
		super(nome, cpf, email, idFuncionario);
		this.parteDaEmpresa = parteDaEmpresa;
	}

	public float getParteDaEmpresa() {
		return parteDaEmpresa;
	}

	public void setParteDaEmpresa(float parteDaEmpresa) {
		this.parteDaEmpresa = parteDaEmpresa;
	}
}
