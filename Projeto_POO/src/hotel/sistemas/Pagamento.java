package hotel.sistemas;

public class Pagamento {
	
	private String metodo;
	private double valor;
	
	public Pagamento() {
		// TODO Auto-generated constructor stub
	}

	public Pagamento(String metodo, double valor) {
		super();
		this.metodo = metodo;
		this.valor = valor;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
