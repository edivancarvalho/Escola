package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Alunos;
import model.Contato;

/**
 *
 * @author edivan
 */
public class ContatoDao {

    private Connection conexao;

    public ContatoDao() {
        conexao = ModuloConexaoDao.conector();
    }

    public List<Alunos> getAllAlunos() throws Exception {
        //           ↓ isso se chama referencia.
        List<Alunos> listAlunos = new ArrayList<Alunos>();

        // buscar por ordenação por ID;
        String sql = "SELECT aluno.alu_id, aluno.alu_nome, con_telefone from aluno INNER JOIN contato ON aluno.alu_id = contato.con_alu_id ORDER by aluno.alu_id";
        //String sql = "SELECT * from aluno ORDER by aluno.alu_id";
        //String sql = "SELECT * FROM aluno";
        try {
            Statement statement = conexao.createStatement();
            //                              ↓ consultar;
            ResultSet rs = statement.executeQuery(sql);
            //        ↓ enquato estive proximo faça;
            while (rs.next()) {
                //     ↓ fazendo um estaciação com o [new]
                Alunos alunos = new Alunos();
                Contato contato = new Contato();

                alunos.setId(rs.getInt("alu_id"));
                alunos.setNome(rs.getString("alu_nome"));
                //contato.setTelefone(rs.getString("con_telefone"));

                listAlunos.add(alunos);
                System.out.println("teste 1");

            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
                    + erro.getMessage());
        }
        return listAlunos;
    }

    public List<Contato> getAllContato() throws Exception {
        List<Contato> listContato = new ArrayList<Contato>();
      String sql = "select * from contato";
    //String sql = "SELECT  con_telefone from aluno INNER JOIN contato ON aluno.alu_id = contato.con_alu_id ORDER by aluno.alu_id";

        try {
            Statement statement = conexao.createStatement();
            //                              ↓ consultar;
            ResultSet rs = statement.executeQuery(sql);
            //        ↓ enquato estive proximo faça;
            while (rs.next()) {
                //     ↓ fazendo um estaciação com o [new]
                Contato contato = new Contato();
                AlunosDao aluno = new AlunosDao();
                contato.setAluno(aluno.getAlunosById(rs.getInt("con_alu_id")));
                contato.setTelefone(rs.getString("con_telefone"));

                listContato.add(contato);
                System.out.println("teste 1");

            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
                    + erro.getMessage());
        }
        return listContato;
    }
    
    // Dao para adicionar.
    public void adicionarContato(Contato contato) throws Exception {
        // variavel que ira realizar o insert
        String sql = "insert into contato (con_telefone, con_alu_id) VALUES (?, ?)";

        try {
            // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            // pegar os dados da variavel Alunos usando o getNome;
            preparedStatement.setObject(1, contato.getTelefone());
           preparedStatement.setObject(2, contato.getAluno().getId());
            
            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());
        }
    }
}
