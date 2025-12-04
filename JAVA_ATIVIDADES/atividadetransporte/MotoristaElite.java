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
    @Override
    public double pagamentoMotorista() {
        double valor = arrecadacao * 0.80;
        double bonus1 = 0;
        if (media > 4.6) {
            bonus1 = arrecadacao * 0.05;
        }
        double bonusPremium = corridapremium * 5;
        return valor + bonus1 + bonusPremium;
    }
    


}
