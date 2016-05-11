/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

public class AlunoNormal extends Aluno{
    
    public AlunoNormal(int matricula, Disciplina[] disciplinas, String nome, String CPF) {
        super(matricula, disciplinas, nome, CPF);
    }  
    
    @Override
    public String getTipo() {
        return "Aluno Normal";
    }
    
    @Override
    public double getMediaDisciplinas(){    //Método criado para o padrão INFORMATION EXPERT - Obtem a nota media das disciplinas cursadas pelo aluno
        double media = 0;
        double subMedia = 0;
        for (Disciplina disc : getDisciplinas()) {
            subMedia += disc.getNota();
            media = subMedia / getDisciplinas().length;
        }
        return media;
    }
}
