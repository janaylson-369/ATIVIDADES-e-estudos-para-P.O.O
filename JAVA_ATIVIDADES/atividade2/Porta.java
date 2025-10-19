package atividade2;

public class Porta  {
    
    private String cor,estaAberta;
    private double largura,altura;

    public Porta(String cor,double altura,String estaAberta,double largura){
        this.altura = altura;
        this.cor = cor;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double novaAltura){
        altura = novaAltura;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String novaCor){
        cor = novaCor;
    }
    public double getlargura(){
        return largura;
    }
    public void setlargura(double novaLargura){
        largura = novaLargura;
    }
    public String getestaAberta(){
        return estaAberta;
    }
    public void setEstaAberta(String EstaAbertaNovamente){
        estaAberta = EstaAbertaNovamente;
    }

    public String toString(){
        return String.format("A Porta é da cor %s com %.2f de  altura %.2f de largura e a porta está %s.\n",getCor(),getAltura(),getlargura(),getestaAberta());
    }
    
    
}
