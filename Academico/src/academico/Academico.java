
package academico;

public class Academico {

    public static void main(String[] args) {
        Estudante est = new Estudante("Rafael", "2020112", Situacao.ATIVO);
        Estudante jao = new Estudante("Joao", "20211123", Situacao.ATIVO);
        Auxilio aux = new Auxilio("Auxílio moradia");
        
        Projeto proj = new Projeto("Projeto Integrador");
        System.out.println(est.acessaAuxilio(aux));
        
        System.out.println(proj);
        proj.adicionaMembro(est);
        proj.adicionaMembro(jao);
        System.out.println(proj);

        Curso curso = new Curso("TSI", "Sistemas para Internet");
        curso.adicionarEstudante("Rafael", "1234", Situacao.ATIVO);
        
    }
    
}
