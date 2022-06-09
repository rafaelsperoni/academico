package academico;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    public String descricao;
    
    List<Estudante> membros = new ArrayList<>();
    
    public Projeto(String descricao){
        this.descricao = descricao;
    }
    
    public void adicionaMembro(Estudante estudante){
        membros.add(estudante);
    }

    @Override
    public String toString() {
        return "Projeto{" + "descricao=" + descricao + ", membros=" + membros + '}';
    }
    
    
}
