package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Alunos;

/**
 *
 * @author edivan
 */
public class AlunosDao {

    private Connection conexao;

    // Construtor que preparar a conexao;
    public AlunosDao() {
        conexao = ModuloConexaoDao.conector();
    }

    // Dao para adicionar.
    public void adicionarAlunos(Alunos aluno) throws Exception {
        // variavel que ira realizar o insert
        String sql = "insert into aluno (alu_nome) VALUES (?)";

        try {
            // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            // pegar os dados da variavel Alunos usando o getNome;
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());
        }
    }
    
    public List<Alunos> getAllAlunos() throws Exception {
        List<Alunos> listAlunos = new ArrayList<Alunos>();
        String sql = "SELECT * FROM aluno";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {

                Alunos alunos = new Alunos();
                alunos.setId(rs.getInt("alu_id"));
                alunos.setNome(rs.getString("alu_nome"));

                listAlunos.add(alunos);
                System.out.println("teste 1");

            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
                    + erro.getMessage());
        }
        return listAlunos;
    }
    
    

    // 2 etapa 2.-2
    // Metodo getAlunosById
    public Alunos getAlunosById(int id) throws Exception {

        Alunos alunos = new Alunos();
        String sql = "SELECT * FROM aluno WHERE alu_id=?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                alunos.setId(rs.getInt("alu_id"));
                alunos.setNome(rs.getString("alu_nome"));
            }

        } catch (Exception erro) {
            throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
        }
        return alunos;
    }
}
