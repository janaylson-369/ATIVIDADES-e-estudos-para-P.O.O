package atividade2;

public class Professor {

    private int matricula;
    private String nomeProfessor, nomeDepartamento;

    public Professor(String nomeProfessor, int matricula, String nomeDepartamento) {
        this.nomeProfessor = nomeProfessor; 
        this.matricula = matricula;
        this.nomeDepartamento = nomeDepartamento;
        
    }
    public  String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String novoNomeProf){
        nomeProfessor = novoNomeProf;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMtricula(int novaMatricula){
        matricula = novaMatricula;
    }
    public String getNomeDepartamento(){
        return nomeDepartamento;
    }
    public void setNomeDepartamento(String NovoNomeDepartamento){
        nomeDepartamento = NovoNomeDepartamento;
    }

    public String toString() {
        return String.format(
        "Professor { nome:'%s', matricula: %d, departamento: '%s' }", 
        getNomeProfessor(), 
        getMatricula(), 
        getNomeDepartamento()
    );
    }

}
