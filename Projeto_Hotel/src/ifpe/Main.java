package ifpe;

import ifpe.funcionarios.Desenvolvedor;
import ifpe.sistemas.BancoDeDados;
import ifpe.sistemas.Firewall;

public class Main {
	public static void main(String[] args) {
		Desenvolvedor desenvolvedor = new Desenvolvedor("Luiz", "123", "fadfa@gmail", "666","Dev" ,"Java", "adm", "adm");
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Firewall firewall = new Firewall(desenvolvedor, bancoDeDados);
		
		
		firewall.lerBanco();
		firewall.autenticar("adm", "adm");
		
		firewall.lerBanco();
		
		firewall.AdicionarAoBanco("Teste");
		firewall.lerBanco();
		
		System.out.println(desenvolvedor.getCargo());
	}
}
