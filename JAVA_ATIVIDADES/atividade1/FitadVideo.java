package atividade1;

public class FitadVideo {

    private String titulo;
    private double preco;

    public FitadVideo(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }
    public String getTitulodFita(){
        return titulo;
    }
    public double getPrecoPorDia(){
        return preco;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return preco*numeroDeDiasAlugada;
    }
    public String toString(){
        return String.format("A fita é %s o valor é: %.2f\n",titulo,preco);
    }

}
