

import java.util.Scanner; // ler a entrada do teclado
import atividade4.ControleRemoto;
import atividade4.Televisor;

/** !!!!!!!!!!!!!!!!!!!!!!!!!!!!!PROTOTIPO INACABADO PARA A TV!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * Classe principal que cria um menu interativo no terminal
 * para controlar o Televisor.
 */
public class TerminalInterativo {

    public static void main(String[] args) {
        
        Televisor tv = new Televisor(1, 10, false); // Comeca desligada, canal 1, vol 10
        ControleRemoto controle = new ControleRemoto(tv);
        Scanner scanner = new Scanner(System.in); // Cria o leitor de entrada
        
        boolean executando = true; // controlar o loop

        // 2. Loopdo programa
        while (executando) {
            // Mostra o menu de opções para o usuário
            System.out.println("\n--- CONTROLE REMOTO ---");
            System.out.println("Comandos disponíveis:");
            System.out.println("  ligar       - Liga a TV");
            System.out.println("  desligar    - Desliga a TV");
            System.out.println("  vol+        - Aumenta o volume");
            System.out.println("  vol-        - Diminui o volume");
            System.out.println("  canal <num> - Troca para o canal <num> (ex: canal 12)");
            System.out.println("  status      - Mostra o estado atual da TV");
            System.out.println("  sair        - Fecha o programa");
            System.out.println("-------------------------");
            System.out.print("Digite um comando: ");

            // Lê o comando digitado pelo usuário
            String comando = scanner.nextLine().toLowerCase(); // Converte para minusculas

            
            if (comando.startsWith("canal ")) {
                try {
                    String[] partes = comando.split(" ");
                    int novoCanal = Integer.parseInt(partes[1]);
                    controle.trocarCanal(novoCanal);
                } catch (Exception e) {
                    System.out.println("Comando de canal inválido. Use o formato: canal numero");
                }
            } else {
                // Usa um switch para os outros comandos
                switch (comando) {
                    case "ligar":
                        controle.ligar();
                        break;
                    case "desligar":
                        controle.desligar();
                        break;
                    case "vol+":
                        controle.aumentarVolume();
                        break;
                    case "vol-":
                        controle.diminuirVolume();
                        break;
                    case "status":
                        System.out.println("Status atual -> " + controle.getStatusTelevisor());
                        break;
                    case "sair":
                        executando = false; // sair do loop
                        break;
                    default:
                        System.out.println("Comando desconhecido. Tente novamente.");
                        break;
                }
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close(); 
    }
}

