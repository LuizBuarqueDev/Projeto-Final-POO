package ifpe;

public class Desenvolvedor extends Funcionario{
	 private String especialidade;
	 private String usuarioBD = "adm";
	 private String senhaBD = "senha";
	public Desenvolvedor(String nome, String cpf, String email, String idFuncionario, String cargo,
			String especialidade, String usuarioBD, String senhaBD) {
		super(nome, cpf, email, idFuncionario);
		this.especialidade = especialidade;
		this.usuarioBD = usuarioBD;
		this.senhaBD = senhaBD;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getUsuarioBD() {
		return usuarioBD;
	}
	public void setUsuarioBD(String usuarioBD) {
		this.usuarioBD = usuarioBD;
	}
	public String getSenhaBD() {
		return senhaBD;
	}
	public void setSenhaBD(String senhaBD) {
		this.senhaBD = senhaBD;
	} 
}
