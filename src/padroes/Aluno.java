/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

public abstract class Aluno extends Pessoa{
    private int matricula;
    private Disciplina[] disciplinas;

    public Aluno(int matricula, Disciplina[] disciplinas, String nome, String CPF) {
        super(nome, CPF);
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    } 

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    String getFuncao(){
        return "Aluno";
    }
    
    public abstract String getTipo();
    
    public abstract double getMediaDisciplinas();
}
