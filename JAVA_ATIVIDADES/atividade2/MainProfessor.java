package atividade2;

public class MainProfessor {
    public static void main(String[] args){
        Professor professor = new Professor("Sydiney Oliveira",23343555 , "Ultrafarma Classe 1");
        System.out.println(professor.toString());
        professor.setNomeProfessor("zeca");
        professor.setMtricula(2282787);
        professor.setNomeDepartamento("Ultrafarma classe 2");
        System.out.println(professor);

    }
}
