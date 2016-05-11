/*
Trabalho de Engenharia de Software - 5º Período BSI - IF Sudeste MG Juiz de Fora
Equipe: Antonio Celestino e Nathan Manera
Professor: Daves Martins
 */
package padroes;

public class TesteApp {
    
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[2];
        Disciplina[] dis = new Disciplina[3];
        Disciplina[] did = new Disciplina[3];
        
        
        dis[0] = new Disciplina(90, "matematica");
        dis[1] = new Disciplina(80, "historia");
        dis[2] = new Disciplina(75, "portugues");
        
        did[0] = new Disciplina(65, "matematica");
        did[1] = new Disciplina(70, "historia");
        did[2] = new Disciplina(85, "portugues");
        Aluno a1 = AlunoFactory.getAluno("Aluno Bolsista", 400, 654321, dis, "Ciclano", "444.444.444-44");
        Aluno a2 = AlunoFactory.getAluno("Aluno Normal", 0, 123456, did, "Fulano", "555.555.555-55");
        alunos[0] = a1;
        alunos[1] = a2;
        Professor professor = new Professor(12345, 3000, "Jose", "222.222.222-22");
        AdaptaAlunoBolsista a3 = new AdaptaAlunoBolsista(professor, 1000, 456321, dis, "Beltrano", "666.666.666-66");
        
        // testes do FORMAT FACTORY e do INFORMATION EXPERT
        System.out.println("Media disciplinas "+a1.getNome()+": "+getMedia((Aluno) a1));
        System.out.println("Media disciplinas "+a2.getNome()+": "+getMedia((Aluno) a2));
        System.out.println(a1.getNome()+" é um: "+a1.getTipo());
        System.out.println(a2.getNome()+" é um: "+a2.getTipo());
        System.out.println("Média geral: "+getMediaTodosAlunos(alunos));
        
        // teste do POLIMORFISMO, onde o método 'funcao' da superclasse Pessoa é sobrescrito nas classes Aluno e Professor.
        System.out.println(a1.getNome()+" é um: "+ocupacao(a1));
        System.out.println(a2.getNome()+" é um: "+ocupacao(a2));
        System.out.println(professor.getNome()+ " é um: " + ocupacao(professor));
        
        // teste do ADAPTER, onde um Aluno Bolsista tem seu imposto calculado por um método de Professor.
        System.out.println(professor.getNome()+" pagará "+ professor.valorDoImposto(professor.getValorSalario())+" de imposto.");
        System.out.println(a3.getNome()+" pagará "+ a3.pagarImposto()+" de imposto.");
    }
    
    public static String ocupacao(Pessoa p){
        return p.getFuncao();
    }
    
    public static double getMedia(Aluno a){
        return a.getMediaDisciplinas();
    }
    public static double getMediaTodosAlunos(Aluno[] alunos){   //Método criado para o padrão INFORMATION EXPERT - Obtem a nota media das medias dos alunos
        double mediaGe = 0;
        for (Aluno aluno : alunos) {
            mediaGe += getMedia(aluno);
        }
        return mediaGe/alunos.length;
    }
}
// FORMAT FACTORY - fonte: http://www.robsonsoares.com/?p=149
// INFORMATION EXPERT - fonte: http://www.olharcritico.com/engenhariadesoftware/2009/09/grasp-como-atribuir-responsabilidades-com-eficiencia-introducao-padroes-para-atribuicao-de-resposabilidade/