package bll;

import dao.AlunosDao;
import java.util.List;
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
    
    public List<Alunos> consultarAlunos() throws Exception {
        return alunoDao.getAllAlunos();
    }

    // consulta alunos por Id no banco de dados; 2° etapa 2.-1
    public Alunos consultarAlunosPorId(int id) throws Exception {
        return alunoDao.getAlunosById(id);
        // criar metodo "getAlunosById" em →AlunosDao
    }

}
