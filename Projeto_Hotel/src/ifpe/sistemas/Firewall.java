package ifpe.sistemas;

import java.util.Date;

import ifpe.funcionarios.Desenvolvedor;

public class Firewall {

	private Desenvolvedor desenvolvedor;
	private BancoDeDados bancoDeDados;

	public Firewall(Desenvolvedor desenvolvedor, BancoDeDados bancoDeDados) {
		super();
		this.desenvolvedor = desenvolvedor;
		this.bancoDeDados = bancoDeDados;
	}

	boolean auteticaoUsuario = false;

	public void autenticar(String usuario, String senha) {

		if (desenvolvedor.getUsuarioBD().equals(usuario) && desenvolvedor.getSenhaBD().equals(senha)) {
			System.out.println("\nAutenticação concluida");
			Date data = new Date();
			System.out.printf("Sistema acessado por %s id: %s \nAcesso as %s", desenvolvedor.getNome(),
					desenvolvedor.getIdFuncionario(), data);
			System.out.println("\nContato: " + desenvolvedor.getEmail());
			auteticaoUsuario = true;

		} else {
			System.out.println("Usuario invalido");
		}
	}

	public void lerBanco() {
		if (auteticaoUsuario) {
			System.out.println("\nLendo banco de dados.......");
			System.out.println(bancoDeDados.ler());
		} else {
			System.out.println(auteticaoUsuario);
			System.out.printf("\nUsuario %s não foi autenticado", desenvolvedor.getNome());
		}
	}

	public void AdicionarAoBanco(String dados) {
		if (auteticaoUsuario) {
			System.out.println("Adicionando a o banco de dados.......");
			bancoDeDados.gravar(dados);
			System.out.println("Gravação concluida");
		} else {
			System.out.printf("\nUsuario %s não foi autenticado", desenvolvedor.getNome());

		}
	}
}
