package atividade1;
/*Escreva uma classe principal, onde você deve criar algumas fitas e mostrar os dados de cada uma.
 */
public class MainFitadVideo {
    public static void main(String[] args){
        FitadVideo fitadVideo = new FitadVideo("The Matrix", 10.00);
        System.out.println(fitadVideo.toString());
        FitadVideo fitadVideo2 = new FitadVideo(" The Avengers Doctor Von dom", 15.00);
        System.out.println(fitadVideo2.toString());
        FitadVideo fitadVideo3 = new FitadVideo("The Avengers infinix", 30.00);
        System.out.println(fitadVideo3.toString());
    }   
}
