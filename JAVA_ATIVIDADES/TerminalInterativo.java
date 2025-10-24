

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


private int codigo, energia, aura;
    private String nome;

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 100;
        this.aura = 0;
    }

    public int getcodigo() {
        return codigo;
    }

    public String getnome() {
        return nome;
    }

    public int getenergia() {
        return energia;
    }

    public int incremento() {

        if (energia < 5) {
            energia++;
        } else {
            System.out.println(" energia cheia");
        }
        return energia;
    }

    public int dencremento() {
        if (energia > 0) {
            energia--;
            if (energia == 0) {
                System.out.println(nome + " está sem energia!");
            }
        }
        return energia;
    }

    //F
    public int alimentarse() {
        return incremento();
    }

    //G
    public int atacar() {
        Random gerador = new Random();
        return gerador.nextInt(2);
    }
    public int atkEspecial(){
        Random kamehamehaaa = new Random();
        return kamehamehaaa.nextInt(4);
    }

    /*h) o método lutar recebe por parâmetro o guerreiro oponente e deve reduzir a energia de um guerreiro
    a cada ataque com sucesso de seu oponente (use o método decremento do item e). O método lutar deve chamar
    o método atacar de cada guerreiro e exibir o vencedor quando a energia de um dos guerreiros chegar a zero.
    */
    
    public void lutar(Guerreiro oponente) {
        while (true) {
            if (this.atacar() == 1) {
                System.out.println(this.getnome() + " ataca com SUCESSO!");
                oponente.dencremento();
            } else {
                System.out.println(this.getnome() + " ataca e... ERROU!");
            }

            if (oponente.atacar() == 1) {
                System.out.println(oponente.getnome() + " ataca com SUCESSO!");
                this.dencremento();
            } else {
                System.out.println(oponente.getnome() + " ataca e... ERROU!");
            }

            if (this.getenergia() == 0) {
                System.out.println("\n E VENCEDOR É: " + oponente.nome + "!");
                break;
            }else if (oponente.getenergia() == 0){
                System.out.println("\n E VENCEDOR É: " +  this.nome + "!");
                break;
            }

        }

    }
    

    // h2 Lutar com recursividade
    public void lutarRecursiva(Guerreiro oponente) {

        if (atacar() == 1) {
            oponente.dencremento();
            System.out.println(this.nome + " atacou com sucesso!");
        } else {
            System.out.println(this.nome + " errou o ataque!");
        }

        // turno do guerreiro 2
        if (oponente.energia > 0 && oponente.atacar() == 1) {
            this.dencremento();
            System.out.println(oponente.nome + " atacou com sucesso!");
        } else if (oponente.energia > 0) {
            System.out.println(oponente.nome + " errou o ataque!");
        }
        // conndição do fim da luta
        if (energia == 0 || oponente.energia == 0) {
            if (energia == 0) {
                System.out.println( oponente.nome + " venceu a luta!");
            } else {
                System.out.println(nome + " venceu a luta!");
            }
            return;
        }
        lutarRecursiva(oponente);
    }

    
    public String toString() {
        return "Guerreiro: Código: " + this.codigo + ", Nome: " + this.nome + ", Energia: " + this.energia + "";
    }

