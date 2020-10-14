package bll;

import dao.AlunosDao;
import model.Alunos;

/**
 *
 * @author edivan
 */
public class AlunosBll {

    // chama a classe AlunoDao;
    private AlunosDao alunoDao;

    //Contrutor recebendo a conexão atravez da alunoDao pelo objeto AlunosDao;
    public AlunosBll() {
        alunoDao = new AlunosDao();
    }

    // metodo adicionar receber os parametros da classe Alunos → aluno.
    public void adicionarAlunos(Alunos aluno) throws Exception {
        // 
        alunoDao.adicionarAlunos(aluno);
        
    }
    
}
