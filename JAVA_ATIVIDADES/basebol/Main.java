package basebol;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<String> operacoes = new ArrayList<>();
        int i = 0;
        System.out.println("--- Turing Test ---");
        System.out.println("Regras: Digite um número, 'C' (cancelar), 'D' (dobrar) ou '+' (somar anteriores).");

        while (true) {
            System.out.print("digite o " + (i + 1) + "º caractere da operacao: ");
            String valor = input.nextLine().toUpperCase();
            operacoes.add(valor);
            i++;

            System.out.print("Deseja inserir mais uma operacao? [S/N]: ");
            String continuar = input.nextLine().toUpperCase();

            if (continuar.equals("N")) {
                break;
            }
        }

        String[] umaArray = operacoes.toArray(new String[0]);

        int pontuacaoTotal = Solution.calPoints(umaArray);

        System.out.println("\n--- Resultado Final ---");
        System.out.println("operacoes registrada: " + operacoes);
        System.out.println("soma total: " + pontuacaoTotal);

        input.close();
    }
}