package ifpe.sistema;

public class Servico {
	
	private String discricao;
	private double valor;
	
	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public Servico(String discricao, double valor) {
		super();
		this.discricao = discricao;
		this.valor = valor;
	}

	public String getDiscricao() {
		return discricao;
	}

	public void setDiscricao(String discricao) {
		this.discricao = discricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
