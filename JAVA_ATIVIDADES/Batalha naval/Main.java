import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("digite o nome do Jogador 1: ");
        String nome1 = sc.nextLine();
        System.out.print("digite o nome do Jogador 2: ");
        String nome2 = sc.nextLine();
        Jogador j1 = new Jogador(nome1);
        Jogador j2 = new Jogador(nome2);

        System.out.println("\n--- posicionarr armas ---\n");
        j1.posicionarArmas(sc);
        j2.posicionarArmas(sc); 
        int rodada = 1;

        while (true) {
            System.out.println("\n===== rodada: "+ rodada +" =====");

            System.out.println("\nvez do "+ j1.getNome());
            j1.atirar(j2, sc); 
            j1.atirar(j2, sc);
            if (j2.todasArmasAfundadas()) {
                System.out.println("\n " + j1.getNome() + " venceu!");
                break;
            }
            System.out.println("\nvz do " + j2.getNome());
            j2.atirar(j1, sc); 
            j2.atirar(j1, sc);
            if (j1.todasArmasAfundadas()) {
                System.out.println("\n " + j2.getNome() + " venceu!");
                break;
            }
            rodada++;
        }

        sc.close(); 
    }
}