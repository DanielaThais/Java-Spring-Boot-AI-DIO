import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Set<User> users = new LinkedHashSet<>();
        users.add(new User(0, "João"));
        users.add(new User(1, "Maria"));
        users.add(new User(2, "Pedro"));
        users.add(new User(3, "Ana"));

        System.out.println("***** APRESENTAÇÃO DOS DADOS *****");
        System.out.println(users.contains(new User(0, "João")));
        System.out.println("\nHash de João: " + new User (0, "João").hashCode());
        System.out.println("Hash de Ana: " + new User (3, "Ana").hashCode());
        System.out.println("Hash de Maria: " + new User (1, "Maria").hashCode());
        System.out.println("Hash de Pedro: " + new User (2, "Pedro").hashCode());
        

        //o número de hash é um valor gerado agrupando com uma espécie de setor, onde cada número significa algo

        System.out.println("\nUsuários:");
        users.forEach(System.out::println);

        //Apresentando dados com Lambda

        System.out.println("\nDados com Lambda:");
        var iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Remoção condicional
        users.removeIf(Predicate.not(user -> user.getId() > 2));

        System.out.println("\nUsuários após remoção condicional:");
        users.forEach(System.out::println);
    }
}
