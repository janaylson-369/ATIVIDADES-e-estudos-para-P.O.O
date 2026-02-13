import java.util.Scanner;

//A classe Jogador deve possuir um nome, meuJogo e o jogoDoAdversario e,
//  além disso, deve possuir os métodos atirar, verificarSeAcertou e registrarTiro
public class Jogador {

    private String nome;
    private Tabuleiro meuJogo;
    private Tabuleiro jogoDoAdversario;

    public Jogador(String nome) {
        this.nome = nome;
        this.meuJogo = new Tabuleiro();
        this.jogoDoAdversario = new Tabuleiro();
    }
    public String getNome() {
        return nome;
    }

    public Tabuleiro getMeuJogo() {
        return meuJogo;
    }

    public Tabuleiro getJogoDoAdversario() {
        return jogoDoAdversario;
    }

    public void atirar(Jogador adversario, Scanner sc) {
        System.out.println("\nSeu tabuleiro de tiros:");
        jogoDoAdversario.mostrarTabuleiro();
        System.out.print(nome + " informe posicao do tiro (ex:B3): ");
        String posicao = sc.next().toUpperCase();
        char linhaChar = posicao.charAt(0);
        int c = Integer.parseInt(posicao.substring(1));
        int l = linhaChar - 'A';
        c = c - 1;
        boolean acertou = verificarSeAcertou(adversario, l, c);
        registrarTiro(l, c, acertou);
    }

    public boolean verificarSeAcertou(Jogador adversario, int l, int c) {
        char[][] matrizAdversario = adversario.getMeuJogo().getMatriz();
        if (matrizAdversario[l][c]== 's' ||
                matrizAdversario[l][c]== 'c' ||
                matrizAdversario[l][c]== 'p') {
            matrizAdversario[l][c]= 'A';
            System.out.println("acertou!");
            return true;
        } else {
            System.out.println("agua!");
            return false;
        }
    }

    public void registrarTiro(int l, int c, boolean acertou) {
        if (acertou) {
            jogoDoAdversario.getMatriz()[l][c] = 'A';
        } else {
            jogoDoAdversario.getMatriz()[l][c] = 'E';
        }
    }
    private void posicionar(Scanner sc, char tipo, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\ntabuleiro atual:");
            meuJogo.mostrarTabuleiro();

            System.out.print("informe posição (ex: A1): ");
            String posicao =sc.next().toUpperCase();
            char linhaChar = posicao.charAt(0);
            int c =Integer.parseInt(posicao.substring(1));
            int l= linhaChar - 'A';
            c = c - 1;
            meuJogo.posicionarArma(l, c, tipo);
        }
    }
    //PASSO 1: Solicitar que o Jogador 1 informe a posição das suas armas 
    // (3 submarinos, 2 cruzadores e 1 porta-aviões). Atribua as posições 
    // das armas do Jogador 1 à sua matriz correspondente; 
    public void posicionarArmas(Scanner sc) {
        
        System.out.println(nome + " - Posicione 3 submarinos (s)");
        posicionar(sc, 's', 3); 

        System.out.println(nome + " - Posicione 2 cruzadores (c)");
        posicionar(sc, 'c', 2); 

        System.out.println(nome + " - Posicione 1 porta-aviões (p)");
        posicionar(sc, 'p', 1);
    }

    public boolean todasArmasAfundadas() {
        char[][] matriz = meuJogo.getMatriz();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] == 's' ||
                    matriz[i][j] == 'c' ||
                    matriz[i][j] == 'p') {
                    return false;
                }
            }
        }
        return true;
    }
}
