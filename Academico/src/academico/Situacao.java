package academico;

public enum Situacao {
    ATIVO(1, "Aluno ativo"),
    TRANCADO(2, "Aluno em trancamento"),
    DESLIGADO(3, "Aluno desligado"),
    FORMADO(4, "Formado"),
    FORMANDO(5, "Estudante formando");
    
    int codigo;
    String msg;
    Situacao(int codigo, String msg){
        this.codigo = codigo;
        this.msg = msg;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getMsg(){
        return this.msg;
    }
}