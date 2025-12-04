public class MotoristaExperiente extends Manager {
    //Dos Experientes deseja-se armazenar: nome, número de corridas, valor total arrecadado e nota média
    double media;
    public MotoristaExperiente (String nome,int numerocorrida,double arrecadacao, double media){
        super(nome, numerocorrida, arrecadacao);
        this.media= media;
    }
    //Experiente, que recebe 75% do valor da corrida e tem bônus de 5% por média da avaliação maior que 4.6
    @Override
    public double pagamentoMotorista() {
        double valor = arrecadacao * 0.75;
        double bonus = 0;
        if (media > 4.6) {
            bonus = arrecadacao * 0.05;
        }
        return valor + bonus;
    }
    
}
