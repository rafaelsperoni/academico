package academico;

public class Estudante extends Pessoa{
    String nome;
    String matricula;
    Situacao situacao;
    
    public Estudante (String nome, String matricula, Situacao situacao){
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ","
                + "\n matricula=" + matricula + ","
                + "\n situacao=" + situacao 
                + "\n situacao_codigo=" + situacao.getCodigo() 
                + "\n situacao_msg=" + situacao.getMsg()+ 
                '}';
    }
    
    public String getSituacao(){
        String msg = "";
        switch (this.situacao) {
            case ATIVO:
                msg = "Estudante ativo";
                break;
            case DESLIGADO:
                msg = "Estudante desligado";
                break;
            case FORMADO:
                msg = "Formado";
                break;
            case TRANCADO:
                msg = "Estudante em trancamento";
                break;
        }        
        return msg;
    }
    
    public String acessaAuxilio(Auxilio aux){
        return "Estudante acessou " + aux.getDescricao();
    }
}
