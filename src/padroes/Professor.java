/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

public class Professor extends Pessoa implements PagaImposto{
    int codigo;
    double valorSalario;

    public Professor(int codigo, double valorSalario, String nome, String CPF) {
        super(nome, CPF);
        this.codigo = codigo;
        this.valorSalario = valorSalario;
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

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    String getFuncao(){
        return "Professor";
    }

    @Override
    public double valorDoImposto(double valorRecebido) {
        if (valorRecebido > 2000) {
            return valorRecebido*0.10;
        }
        else
            return 0;
    }
}
