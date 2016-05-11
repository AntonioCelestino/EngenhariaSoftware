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
        Aluno a1 = AlunoFactory.getAluno("Aluno Bolsista", 400, "Ciclano", 654321, dis);
        Aluno a2 = AlunoFactory.getAluno("Aluno Normal", 0, "Fulano", 123456, did);
        alunos[0] = a1;
        alunos[1] = a2;
        
        System.out.println("Media disciplinas aluno a1: "+getMedia((Aluno) a1));
        System.out.println("Media disciplinas aluno a2: "+getMedia((Aluno) a2));
        System.out.println("a1 é um: "+a1.getTipo());
        System.out.println("a2 é um: "+a2.getTipo());
        System.out.println("Média geral: "+getMediaTodosAlunos(alunos));
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