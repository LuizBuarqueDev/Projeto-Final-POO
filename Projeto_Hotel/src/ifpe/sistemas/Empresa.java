package ifpe.sistemas;

import java.util.List;

public class Empresa {
	
	private String cnpj;
	private List <Departamento> departamentos;
	
	public Empresa(String cnpj, List<Departamento> departamentos) {
		super();
		this.cnpj = cnpj;
		this.departamentos = departamentos;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
}
