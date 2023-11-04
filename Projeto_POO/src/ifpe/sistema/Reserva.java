package ifpe.sistema;

import java.util.List;

import ifpe.Pessoas.Cliente;
import ifpe.Pessoas.Funcionario;

public class Reserva {
	
	private Cliente cliente;
	private Funcionario funcionario;
	private List<Quarto> listaQuarto;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(Cliente cliente, Funcionario funcionario, List<Quarto> listaQuarto) {
		super();
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.listaQuarto = listaQuarto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Quarto> getListaQuarto() {
		return listaQuarto;
	}

	public void setListaQuarto(List<Quarto> listaQuarto) {
		this.listaQuarto = listaQuarto;
	}
}
