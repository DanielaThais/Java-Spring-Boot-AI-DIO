import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] codes = new int[2];
        codes[0] = 10;
        codes[1] = 20;

        // também pode ser implementado de forma mais simples
        int[] codes2 = { 30, 40 };

        // terceira forma de construir arrays
        int[] codes3 = { codes[0], codes[1], codes2[0], codes2[1] };

        System.out.println("***** APRESENTAÇÃO DOS ARRAYS *****");

        System.out.println("\nResultado da primeira forma: " + codes.length + " casas");
        System.out.println("- Posição 0: " + codes[0]);
        System.out.println("- Posição 1: " + codes[1]);

        System.out.println("\nResultado da segunda forma: " + codes2.length + " casas");
        System.out.println("- Posição 0: " + codes2[0]);
        System.out.println("- Posição 1: " + codes2[1]);

        System.out.println("\nResultado da terceira forma: " + codes3.length + " casas");
        System.out.println("- Posição 0: " + codes3[0]);
        System.out.println("- Posição 1: " + codes3[1]);
        System.out.println("- Posição 2: " + codes3[2]);
        System.out.println("- Posição 3: " + codes3[3]);

        // todas essas formas funcionam, mas esta é a mais robusta, mas para usar ele deve ser objeto Integer (não o primitivo int)

        List<Integer> codes4 = new ArrayList<>();
        codes4.add(codes[0]);
        codes4.add(codes[1]);
        codes4.add(300);

        System.out.println("\nResultado da quarta forma: " + codes4.size() + " casas");
        System.out.println("- Posição 0: " + codes4.get(0));
        System.out.println("- Posição 1: " + codes4.get(1));
        System.out.println("- Posição 2: " + codes4.get(2));

        System.out.println("\nSeus valores sem posição: ");
        codes4.forEach(System.out::println); //por ser objeto, também pode ser impresso assim

        //Também pode ser usado o LinkedList, que é ideal para muita inclusão ou remoção de elementos em um array

        List<Integer> codes5 = new LinkedList<>();
        codes5.add(codes2[0]);
        codes5.add(codes2[1]);
        codes5.add(4000);

        System.out.println("\nResultado da quinta forma: " + codes5.size() + " casas");
        System.out.println("- Posição 0: " + codes5.get(0));
        System.out.println("- Posição 1: " + codes5.get(1));
        System.out.println("- Posição 2: " + codes5.get(2));

        System.out.println("\nSeus valores sem posição: ");
        codes5.forEach(System.out::println);

        //Para conhecimento: o Vector é similiar ao ArrayList, mas é sincronizado, ou seja, é mais lento, porém mais seguro em ambientes multi-thread (códigos rodando em paralelo)

        
    }
}
