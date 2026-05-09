import domain.User;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, User> users = new HashMap<>();

		users.put("joao@joao.com", new User("João", 22)); // ao invés de .add, é utilizado o .put
		users.put("maria@maria.com", new User("Maria", 32));
		users.put("juca@juca.com", new User("Juca", 18));
		users.put("leo@leo.com", new User("Léo", 40));

		System.out.println("***** APRESENTAÇÃO DOS DADOS *****" + "\nImpressão do método put: " + users);

		users.putAll(users);
		System.out.println("\nImpressão do método putAll: " + users);

		// obtendo valores de Map
		System.out.println("\n==================================" + "\nOBTENDO DADOS COM KEYSET");
		users.keySet().forEach(System.out::println);
		System.out.println("\n==================================" + "\nOBTENDO DADOS COM VALUES");
		users.values().forEach(System.out::println);

		System.out.println("\n==================================" + "\nOBTENDO DADOS COM CONTAINS KEY"
				+ "\n\nO Map contém 'leo@leo.com'? ");
		System.out.println(users.containsKey("leo@leo.com"));
		System.out.println("\nO Map contém 'ana@ana.com'? ");
		System.out.println(users.containsKey("ana@ana.com"));

		System.out.println("\n==================================" + "\nOBTENDO DADOS COM CONTAINS VALUE");
		System.out.println("\nO Map contém o usuário João?");
		System.out.println(users.containsValue(new User("João", 22)));
		System.out.println("\nO Map contém o usuário Pedro?");
		System.out.println(users.containsValue(new User("Pedro", 25)));

		// Removendo um valor através da key
		System.out.println("\n==================================" + "\nREMOVENDO DADOS COM REMOVE"
				+ "\nQual usuário foi removido?\n" + users.remove("joao@joao.com"));
		System.out.println("\nUsuário Leo removido?\n" + (users.remove("leo@leo.com", new User("Léo", 40))));

		// Trabalhando com o replace
		System.out.println(
				"\n==================================================" + "\nImpressão de usuários antes do replace:\n");
		users.forEach((k, v) -> System.out.printf("Key: %s | value: %s\n".formatted(k, v)));
		System.out.println(
				"\n==================================================" + "\nAplicando o replace no usuário Maria:\n");
		users.replace("maria@maria.com", new User("Maria", 60));
		users.forEach((k, v) -> System.out.printf("Key: %s | value: %s\n".formatted(k, v)));

		// Trabalhando com o getOrDefault
		System.out.println("\n=================================================="
				+ "\nAplicação do getOrDefault em usuário existente:");
		System.out.println(users.getOrDefault("juca@juca.com", new User("Juca", 18)));
		System.out.println("\nAplicação do getOrDefault em usuário inexistente:");
		System.out.println(users.getOrDefault("catarina@catarina.com", new User("Catarina", 25)));

		// Usando somente o get
		System.out.println(
				"\n==================================================" + "\nAplicação do get em usuário existente:");
		System.out.println(users.get("juca@juca.com"));
		System.out.println("\nAplicação do get em usuário inexistente:");
		System.out.println(users.get("mariana@mariana.com"));
		
		// Map está vazio?
		System.out.println("\n==================================================" + "\nO Map está vazio?\n"
		+ users.isEmpty());
		
		users.clear();
		System.out.println("\nO Map está vazio após o clear?\n" + users.isEmpty());
	}

}
