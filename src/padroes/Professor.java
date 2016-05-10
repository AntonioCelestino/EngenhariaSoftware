/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

public class Professor implements PagaImposto{
    int codigo;
    String nome;
    double valorsalario;

    public Professor(int codigo, String nome, double valorsalario) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorsalario = valorsalario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorsalario() {
        return valorsalario;
    }

    public void setValorsalario(double valorsalario) {
        this.valorsalario = valorsalario;
    }

    @Override
    public double pagaImposto(double valorRecebido) {
        return valorRecebido*0.10;
    }
    
    
}
