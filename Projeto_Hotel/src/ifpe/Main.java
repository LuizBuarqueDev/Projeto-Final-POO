package ifpe;

public class Main {
	public static void main(String[] args) {
		Desenvolvedor desenvolvedor = new Desenvolvedor("Luiz", "123", "fadfa@gmail", "666","Dev" ,"Java", "adm", "adm");
		Firewall firewall = new Firewall(desenvolvedor, null);
		firewall.autenticar("adm", "adm");
	}

}
