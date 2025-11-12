package atividade7;

public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma(){
        alunos = new Aluno[5];
        quantidade = 0;
    }
    
    //void adicionarAluno(Aluno aluno) → insere um aluno no vetor.
    public void adicionarAluno(Aluno aluno){
        if (quantidade < alunos.length){
            alunos[quantidade] = aluno;
            quantidade++;
        }
    }


    public void listarAlunos(){
        for(int i = 0; i < quantidade; i++){
            if (alunos[i] != null){
                alunos[i].exibirInfo();
            }
        }
    }


    public Aluno buscarPorMatricula(String matricula){
        for(int i = 0; i < quantidade; i++){
            if (alunos[i] != null && alunos[i].getMatricula().equals(matricula)){
                return alunos[i];
            }
        }
        return null;
    }
}
