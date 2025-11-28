public class MotoristaElite extends Manager{
    //Dos Elites deseja-se armazenar: nome, número de corridas, valor total arrecadado, nota média e número de corridas premium
    int corridapremium;
    double media;
    public MotoristaElite (String nome,int numerocorrida,double arrecadacao, int corridapremium, double media){
        super(nome, numerocorrida, arrecadacao);
        this.corridapremium = corridapremium;
        this.media= media;
    }
    //Elite, que recebe 80% do valor da corrida, tem bônus de 5% por avaliação maior que 4.6 e (FALTA --> R$ 5,00 por cada corrida premium que realizou.

    public double pagamentoMotorista(){
        if (media > 4.6){
            arrecadacao = arrecadacao * 0.80;
            arrecadacao = arrecadacao * 1.05;
        }else if (corridapremium> 0) {
            //(FALTA --> R$ 5,00 por cada corrida premium que realizou
        } else {
             System.out.println("não bateu a meta");
        }                   
        return arrecadacao;
    }


}
