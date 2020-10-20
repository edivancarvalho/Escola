package model;

/**
 *
 * @author edivan
 */
public class Contato {

    private String telefone;
    
    private Alunos aluno;
    

    public Contato() {
    }

    public Contato(String telefone, Alunos aluno) {
        this.telefone = telefone;
        this.aluno = aluno;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
    
}
