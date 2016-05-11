/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

//classe criada para o padrão FACTORY METHOD - Cria ou adiciona novos alunos
public class AlunoFactory {
    public static Aluno getAluno(String tipoAluno, double valorBolsa, int matricula, Disciplina[] disciplinas, String nome, String CPF){
        if(tipoAluno == null){
            return null;
        }else if(tipoAluno.equals("Aluno Bolsista")){
            return new AlunoBolsista(valorBolsa, matricula, disciplinas, nome, CPF);
        }else if(tipoAluno.equals("Aluno Normal")){
            return new AlunoNormal(matricula, disciplinas, nome, CPF);
        }else{
            return null;
        }
    }
}
