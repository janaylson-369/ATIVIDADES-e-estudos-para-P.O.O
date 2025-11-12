package atividade7;

public class Aluno {
    private String nome, matricula;
    private double nota1, nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getMatricula(){
        return matricula;
    }


    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }


    public String situacao(){ 
        double media  =  calcularMedia();      
        if(media >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public void exibirInfo(){
        System.out.printf("Nome: %s Matrícula: %s Nota1: %.2f Nota2: %.2f Média: %.2f Situação: %s \n",
        nome, matricula, nota1, nota2, calcularMedia(), situacao());
    }
}
