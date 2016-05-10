/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

// classe criada para o padrão ADAPTER - faz um Aluno Bolsista pagar imposto como Professor
public class AdaptaAlunoBolsista extends AlunoBolsista{
    private Professor professor;

    public AdaptaAlunoBolsista(Professor professor, String nome, int matricula, double valorBolsa) {
        super(nome, matricula, valorBolsa);
        this.professor = professor;
    }
    
    public double pagarImposto(){
        return professor.pagaImposto(valorBolsa);
    }
}
