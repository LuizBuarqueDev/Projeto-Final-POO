package ifpe;

public class Firewall {
	
	private Desenvolvedor desenvolvedor;
	private BancoDeDados bancoDeDados;
	
	
	
	public Firewall(Desenvolvedor desenvolvedor, BancoDeDados bancoDeDados) {
		super();
		this.desenvolvedor = desenvolvedor;
		this.bancoDeDados = bancoDeDados;
	}

	public void autenticar(String usuario , String senha) {
		if (desenvolvedor.getUsuarioBD().equals(usuario) && desenvolvedor.getSenhaBD().equals(senha)) {
			System.out.println("Auteticado");
		}else {
			System.out.println("Usuario invalido");
		}
	}
}
