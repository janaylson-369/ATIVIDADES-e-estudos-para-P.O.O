public class Tabuleiro {

    private char[][] matriz;

    public Tabuleiro() {
        matriz = new char[8][8];
        inicializar();
    }
    private void inicializar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = '~'; // água
            }
        }
    }
    // 'l' vai ser as linhas e 'c' vai ser as colunas
    public void posicionarArma(int l, int c, char tipo) {
        matriz[l][c] = tipo;
    }
    public char[][] getMatriz() {
        return matriz;
    }

    public void mostrarTabuleiro() {
        System.out.println("   1 2 3 4 5 6 7 8");
        for (int i = 0; i < 8; i++) {
            char letraLinha = (char) ('A' + i);
            System.out.print(letraLinha + "  ");
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}