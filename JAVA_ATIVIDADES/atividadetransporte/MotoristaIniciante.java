public class MotoristaIniciante extends Manager{
    
    public MotoristaIniciante (String nome, int numerocorrida, double arrecadacao){
        super(nome, numerocorrida, arrecadacao);
        
    }
    //Iniciante, que recebe 70% do valor da corrida
    @Override
    public double pagamentoMotorista() {
        return arrecadacao * 0.70;
    }

}
