package atividade7;

public class Principal {
    public static void main(String[] args){
        // Criar uma turma.
        Turma turma = new Turma();


        //Adicionar pelo menos 3 alunos no vetor.

        turma.adicionarAluno(new Aluno("João", "32131", 10, 2));

        Aluno maria = new Aluno("Maria", "13213", 10, 10);
        turma.adicionarAluno(maria);

        Aluno pedro = new Aluno("Pedro", "213132", 9, 6);
        turma.adicionarAluno(pedro);

        System.out.println("--------------- LISTAR TODOS OS ALUNOS ----------------");
        //Listar todos os alunos com suas informações.
        turma.listarAlunos();
        System.out.println("--------------- FIM DA LISTAGEM ----------------");

        System.out.println("--------------- INICIANDO A BUSCA ----------------");
        
        System.out.println("--------------- BUSCAR POR MATRÍCULA ----------------");
        //Buscar um aluno pela matrícula e exibir suas informações.
        Aluno buscado = turma.buscarPorMatricula("13213");
        if(buscado != null){
        buscado.exibirInfo();
        }
        System.out.println("--------------- FIM DA BUSCA ----------------");
    }
}
