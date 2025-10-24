public class MainGuerreiro {
    public static void main(String[] args) {
        //Cadastrar dois guerreiros
        Guerreiro g1 = new Guerreiro(1, "Vegeta");
        Guerreiro g2 = new Guerreiro(2, "Goku");

        System.out.println("Estado inicial dos guerreiros ");
        System.out.println(g1);
        System.out.println(g2);

        // Inicia luta usando laço
        System.out.println("\n--- Luta com laço ---");
        g1.lutar(g2);

        // Exibe o estado após a luta
        System.out.println("\n Estado do guerreiro após a luta com laço ");
        System.out.println(g1);
        System.out.println(g2);

        // Alimenta os guerreiros
        System.out.println("\n--- alimentando guerreiros ---");
        g1.alimentarse();
        g2.alimentarse();

        // Exibe novamente
        System.out.println("\n estado do guerreiro alimentado");
        System.out.println(g1);
        System.out.println(g2);

        // Restaura energia para nova luta
        System.out.println("\n--- Reiniciando energia para nova luta ---");
        g1 = new Guerreiro(1, "Vegeta");
        g2 = new Guerreiro(2, "Goku");

        // segunda partida
        System.out.println("\n--- Luta com recursividade ---");
        g1.lutarRecursiva(g2);

        // Exibir as informações dos guerreiros
        System.out.println("\n quem ganhou? quem perdeu?");
        System.out.println(g1);
        System.out.println(g2);
    }
}
