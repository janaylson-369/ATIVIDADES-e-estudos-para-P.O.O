package atividade1;
/*Crie uma classe Principal e nela, o método main para execução do programa. Crie dois objetos Calendario,
e em cada instanciação informe nos parâmetros do construtor um dia, mês e um ano. 
Para cada objeto, utilize os seus métodos para:
a. Mostrar a data;
b. Imprimir na tela se o objeto tem um ano bissexto
*/

public class MainCalendario {
    public static void main(String[] args){
        Calendario calendario1 = new Calendario(23, 6, 2020);
        Calendario calendario2 = new Calendario(27, 4, 2025);
        calendario1.mostrarData();
        calendario1.anoBissexto();
        calendario2.mostrarData();
        calendario2.anoBissexto();
    }
}
