/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

public class AlunoBolsista extends Aluno{
    public double valorBolsa;
    
    public AlunoBolsista(String nome, int matricula, double valorBolsa) {
        super(nome, matricula);
        this.valorBolsa = valorBolsa;
    }
}
