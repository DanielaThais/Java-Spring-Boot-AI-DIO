
public class Main {

	public static void main(String[] args) {

		var builder = new StringBuilder("1234567890");
		System.out.println("<======== APRESENTANDO DADOS ========>" + "\n\nDados iniciais: " + builder);
		System.out.println("Dados após builder.delete (0, 3): " + builder.delete(0, 3)); 
		System.out.println("Dados após builder.deleteCharAt (0): " +builder.deleteCharAt(0)); 
		System.out.println("Dados com builder.reverse: " + builder.reverse());
		System.out.println("Reinserindo dados: " + builder.append("43210").reverse());
	}
	
}