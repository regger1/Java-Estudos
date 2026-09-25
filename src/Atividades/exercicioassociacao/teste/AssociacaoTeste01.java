package Atividades.exercicioassociacao.teste;

import Atividades.exercicioassociacao.dominio.Aluno;
import Atividades.exercicioassociacao.dominio.Local;
import Atividades.exercicioassociacao.dominio.Professor;
import Atividades.exercicioassociacao.dominio.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Rio das Antas");
        Aluno aluno = new Aluno("Carlos", 22);
        Professor professor = new Professor("Coral", "IA");
        Aluno[] alunosParaSeminario = { aluno };

        Seminario seminario = new Seminario("Como usar IA no trabalho", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = { seminario };

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprimir();
    }
}
