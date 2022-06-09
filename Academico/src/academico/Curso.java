package academico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    String descricao;
    List<Estudante> estudantes = new ArrayList<>();
    
    public Curso(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void adicionarEstudante(String nome, String descricao, Situacao situacao){
        Estudante est = new Estudante(nome, descricao, situacao);
        estudantes.add(est);
    }
    
}
