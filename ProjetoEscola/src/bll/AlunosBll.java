package bll;

import dao.AlunosDao;
import java.util.List;
import model.Alunos;

/**
 *
 * @author edivan
 */
public class AlunosBll {

    // chama a classe AlunoDao; "Referenciando"
    private AlunosDao alunoDao;

    //Contrutor recebendo a conexão atravez da alunoDao pelo objeto AlunosDao;
    public AlunosBll() {
        alunoDao = new AlunosDao(); // criar uma nova instancia
    }

    // metodo adicionar receber os parametros da classe Alunos → aluno.
    public void adicionarAlunos(Alunos aluno) throws Exception {
        // 
        alunoDao.adicionarAlunos(aluno);
    }
    
    // Etapa btnExcluir ex. -4 → AlunosBll -3, → AlunoDao
    public void removerAlunos(Alunos aluno) throws Exception{
        alunoDao.deleteAlunos(aluno.getId());
    }
    //
    public List<Alunos> consultarAlunos() throws Exception {
        return alunoDao.getAllAlunos();
    }

    // consulta alunos por Id no banco de dados; 2° etapa 2.-1
    public Alunos consultarAlunosPorId(int id) throws Exception {
        return alunoDao.getAlunosById(id);
        // criar metodo "getAlunosById" em →AlunosDao
    }
    
    public void alterarAlunos (Alunos aluno) throws Exception{
        alunoDao.updateAluno(aluno);
    }
    
    public  void validarAlunos(Alunos aluno)throws  Exception{
        if ("".equals(aluno.getNome())){
            throw new Exception("Preenchar todos os campos obrigatorios");
        }
    }
}
