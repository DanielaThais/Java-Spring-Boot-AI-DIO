import domain.User;
import java.util.TreeMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		var value = "java;java;java;java;spring;boot";
		value = value.replaceFirst("j", "J"); // sempre fazer a atribuição nesse caso
		System.out.println("<==== APRESENTAÇÃO DOS DADOS ====>");
		System.out.println("\nDados com ReplaceFirst: " + value);
		value = value.replaceAll("j", "J");
		System.out.println("Dados com ReplaceAll: " + value);

		// Usando o split para organizar os dados
		System.out.println("\n=================================>" + "\nDados após split:");
		var values = value.split(";");
		for (var v : values) {
			System.out.println(v);
		}

		System.out.println("\nSplit com limite definido para 2:");
		var values2 = value.split(";", 2);
		for (var v : values2) {
			System.out.println(v);
		}

		// mantendo todas as letras maiúsculas e minúsculas
		System.out.println("\n=================================>" + "\nManipulando tamanho das letras\n");
		System.out.println("Maiúsculas: " + value.toUpperCase());
		System.out.println("Minúsculas: " + value.toLowerCase());

		// identificando o index de uma letra ou palavra com condição
		System.out.println("\n=================================>" + "\nIdentificando o index de uma letra\n");
		System.out.println("Index da letra 'j': " + value.indexOf("a", 2));
		System.out.println("Index da palavra 'spring': " + value.indexOf("spring"));
		System.out.println("Index da palavra 'Java': " + value.indexOf("Java", 1));
		System.out.println("Index da palavra inexistente: " + value.indexOf("desenvolvimento"));

		// identificando se há registro seguindo uma condição
		System.out.println("\n=================================>"
				+ "\nIdentificando a existência de registros através de filtros\n");
		System.out.println("Existe algum registro iniciado com 'Ja': " + value.startsWith("Ja"));
		System.out.println("Existe algum registro iniciado com 'de': " + value.startsWith("de"));
		System.out.println("Existe algum registro terminado em 'va': " + value.endsWith("va"));
		System.out.println("Existe algum registro terminado em 'to': " + value.endsWith("to"));
		
		//Diferenças entre isEmpty e isBlank
		System.out.println("\n=================================>"
				+ "\nDiferenças entre isEmpty e isBlank\n");
		var dados = "     ";
		System.out.println("Variável dados está vazia e desconsiderando espaços? " + dados.isEmpty());
		System.out.println("Variável dados está vazia e desconsiderando espaços? " + dados.isBlank());
		//mas ao aplicar trim() temos:
		System.out.println("IsEmpty com trim: " + dados.trim().isEmpty());
	}
}
