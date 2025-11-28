public class MotoristaIniciante extends Manager{
    
    public MotoristaIniciante (String nome,int numerocorrida,double arrecadacao, double media){
        super(nome, numerocorrida, arrecadacao);
        
    }
    //Iniciante, que recebe 70% do valor da corrida
    public double pagamentoMotorista(){
        return arrecadacao * 0.70;
    }

}
